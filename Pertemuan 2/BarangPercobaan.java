/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester3;

public class BarangPercobaan {
    public String namaBarang;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang  : "+namaBarang);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok         : "+stok);
        
    }
    public int tambahStok(int brgMasuk){
            int stokBaru = brgMasuk+stok;
            return stokBaru;
    }
}

