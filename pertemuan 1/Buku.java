/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester3;

public class Buku {
  public String nama;
  public int jumlahHalaman;
  
    public void setNama(String newValue){
        nama = newValue;
    }
    public void setHalaman(int newValue){
        jumlahHalaman = newValue;
    }
    public void cetakBuku(){
        System.out.println("Nama Buku: "+ nama);
        System.out.println("Jumlah Halaman: "+jumlahHalaman+" halaman");
    }
}
