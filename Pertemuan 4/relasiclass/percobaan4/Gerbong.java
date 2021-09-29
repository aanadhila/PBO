/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa.relasiclass.percobaan4;

/**
 *
 * @author HP
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    public Gerbong(String kode, Kursi[] arrayKursi) {
        this.kode = kode;
        this.arrayKursi = arrayKursi;
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
    void setPenumpang(Penumpang penumpang, int nomor) {
        if(this.arrayKursi[nomor - 1].getPenumpang() != null){
            System.out.println("Kursi tidak bisa ditempati karna sudah ada penumpang lain");
        }else{
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }

}
