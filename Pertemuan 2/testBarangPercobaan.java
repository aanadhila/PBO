/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester3;

import semester3.BarangPercobaan;

/**
 *
 * @author HP
 */
public class testBarangPercobaan {
    public static void main(String[] args) {
        BarangPercobaan brg1 = new BarangPercobaan();
        brg1.namaBarang = "pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        System.out.println("Stok Baru adalah "+brg1.tambahStok(20));
    }
}
