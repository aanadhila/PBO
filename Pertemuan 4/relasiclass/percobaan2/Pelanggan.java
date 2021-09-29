/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa.relasiclass.percobaan2;

public class Pelanggan {
    public Pelanggan() {
    }
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Mobil getMobil() {
        return mobil;
    }
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
    public Sopir getSopir() {
        return sopir;
    }
    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public int getHari() {
        return hari;
    }
    public void setHari(int hari) {
        this.hari = hari;
    }
    private int hari;
    public int hitungBiayaTotal() {
    return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
