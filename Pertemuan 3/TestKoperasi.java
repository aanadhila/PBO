/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan3;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        Scanner annisa = new Scanner(System.in);
        System.out.println("Nama Anggota : "+ donny.getNama());
        System.out.println("Limit Peminjam = " + donny.getLimit());
        
//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.pinjam(10000000);
//        
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: "+ donny.getJumlahPinjam());
//        
//        System.out.println("\nMembayar angsuran 1000");
//        donny.angsur(1000);
//        System.out.println("Jumlah pinjaman saat ini: "+ donny.getJumlahPinjam());
        System.out.print("Masukkan Jumlah Pinjaman : ");
        donny.pinjam(annisa.nextInt());
        System.out.println("Jumlah pinjaman saat ini: "+ donny.getJumlahPinjam());
        System.out.println("");
        System.out.print("Masukkan jumlah angsuran : ");
        donny.angsur(annisa.nextInt());
        System.out.println("Jumlah pinjaman saat ini: "+ donny.getJumlahPinjam());
        
       
    }
}
