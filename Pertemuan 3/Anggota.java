/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan3;

public class Anggota {
   public String nomorKtp;
   public String nama;
   public int limitPinjam;
   public int jumlahPinjam;
   public int jumlahAngsur;
    public Anggota(String nomorKtp, String nama, int limitPinjam) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    public String getNama() {
        return nama;
    }
    public int getLimit() {
        return limitPinjam;
    }
    public int getJumlahPinjam() {
        return jumlahPinjam -= jumlahAngsur;
    }
    public void pinjam(int Pinjam) {
        if (limitPinjam > Pinjam) {
            this.jumlahPinjam = Pinjam;
        }else{
            System.out.println("Maaf, jumlah pinjam melebihi limit.");
        }
    }
    public void angsur(int Angsur) {
        if (Angsur >= (jumlahPinjam * 0.1)) {
        this.jumlahAngsur = Angsur;
        }else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjam");
        }
    }
}
