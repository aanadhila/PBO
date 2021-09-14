/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan2;

public class Mahasiswa {
public int nim;
public String nama;
public String alamat;
public String kelas;

public void tampilBiodata(){
    System.out.println("Nim : "+nim);
    System.out.println("Nama : "+nama);
    System.out.println("Alamat :"+alamat);
    System.out.println("Kelas :"+kelas);
}
}
class Orang {
    private String id;
    private String nama;
    private int umur;

    public Orang() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Murid {
    private String id;
    private String nama;
    private int kelas;

    public Murid() {
    }
    
    public String getNama() {
        return nama;
    }

    public void setIsi(String Nama, String id, int kelas) {
        this.nama = Nama;
        this.id = id;
        this.kelas = kelas;
    }
}
