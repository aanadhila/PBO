/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2;

/**
 *
 * @author HP
 */
public class Persewaan {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int durasi;
    public int bayar;
    
    public int hargaBayar(){
    bayar = durasi * harga;
    return bayar;
    }
    
    public void tampil(){
        System.out.println("id          : "+id);
        System.out.println("Nama member : " +namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Harga bayar : Rp." + bayar);
    }
}
