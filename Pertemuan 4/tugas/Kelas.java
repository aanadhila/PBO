/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annisa.relasiclass.tugas;

/**
 *
 * @author HP
 */
public class Kelas {
    private int tingkat;
    private String jurusan;

    public Kelas() {
    }

    public Kelas(int tingkat, String jurusan) {
        this.tingkat = tingkat;
        this.jurusan = jurusan;
    }

    public void info(){
        System.out.printf("Tingkat = %s/n", tingkat);
        System.out.printf("Jurusan = %.2f\n", jurusan);
    }
}
