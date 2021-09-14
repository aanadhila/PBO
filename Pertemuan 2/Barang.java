/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    int hargaJual;
    
    public int hitungHargaJual(){
        hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp."+hargaDasar);
        System.out.println("Diskon      : "+diskon);
        System.out.println("Harga jual  : Rp."+hargaJual);
    }
}
