/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2;

public class demo {
    public static void main(String[] args) {
    Barang brg1 = new Barang();
    Persewaan gm = new Persewaan();
    Lingkaran lkr = new Lingkaran();
    System.out.println("========Persewaan========");
    gm.id = "1234";
    gm.namaMember = "Cyntia";
    gm.namaGame = "Among us";
    gm.durasi = 3;
    gm.harga = 35000;
    gm.hargaBayar();
    gm.tampil();
    System.out.println("===========================");
    System.out.println("");
    System.out.println("========Lingkaran==========");
    lkr.phi = 3.14;
    lkr.r = 7;
    System.out.println("Keliling : " + lkr.hitungKeliling());
    System.out.println("Luas     : "+lkr.hitungLuas());
    System.out.println("===========================");
    System.out.println("");
    System.out.println("=========Persewaan=========");
    brg1.namaBarang = "Tamagochi";
    brg1.kode = "123456";
    brg1.hargaDasar = 100000;
    brg1.diskon = 0.2f ;
    brg1.hitungHargaJual();
    brg1.tampilData();
    } 
}
