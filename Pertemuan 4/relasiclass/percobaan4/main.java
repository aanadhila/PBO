/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa.relasiclass.percobaan4;

/**
 *
 * @author HP
 */
public class main {

    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        Penumpang p1 = new Penumpang("54321", "Patrick");
        gerbong.setPenumpang(p1, 1);

        System.out.println(gerbong.info());
    }
}
