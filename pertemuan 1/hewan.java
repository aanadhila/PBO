/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester3;

public class hewan {
    public String nama;
    public int jumlahKaki;
    
    public void setKaki(int newValue){
        jumlahKaki = newValue;
    }
    public void setNama(String newValue){
        nama = newValue;
    }
    public void cetakHewan(){
        System.out.println("Nama : "+nama);
        System.out.println("Jumlah Kaki : "+jumlahKaki);
    }
}
class anjing extends hewan{
    public String jenisA;
    public String tipeA;
    public void setJenis(String newValue){
        jenisA = newValue;
    }
    public void setTipe(String newValue){
        tipeA = newValue;
    }
    public void cetakAnjing(){
        super.cetakHewan();
        System.out.println("Jenis Anjing: "+ jenisA);
        System.out.println("Tipe Anjing: anjing"+tipeA);
    }

}

class kucing extends hewan{
    public String jenis;
    public String tipe;
    public void setJenis(String newValue){
        jenis = newValue;
    }
    public void setTipe(String newValue){
        tipe = newValue;
    }
    public void cetakKucing(){
        super.cetakHewan();
        System.out.println("Jenis Kucing: "+ jenis);
        System.out.println("Tipe Kucing: kucing "+tipe);
    }
}

