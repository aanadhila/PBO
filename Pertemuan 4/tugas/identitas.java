/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annisa.relasiclass.tugas;

public class identitas {
    private String nama;
    private String Karakteristik;
    private Kelas k;

    public identitas(String nama, String Karakteristik, Kelas k) {
        this.nama = nama;
        this.Karakteristik = Karakteristik;
        this.k = k;
    }
    
    void info() {
    System.out.printf("Nama = ", nama);
        System.out.printf("Karateristik = ", Karakteristik);
        k.info();    
    }
    
}
