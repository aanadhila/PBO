/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annisa.relasiclass.tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Webtoon WiraDelima");
        Kelas kl1 = new Kelas(1, "IPS");
        identitas id1 = new identitas("Wira","Tinggi", kl1);
        sifat sf = new sifat("lucu", id1);
        citacita ct1 = new citacita("Menjadi pacar delima", sf);
        ct1.info();
        
    }
}
