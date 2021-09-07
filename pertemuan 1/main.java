/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester3;

public class main {
    public static void main(String[] args) {
        anjing ajg = new anjing();
        kucing kcg = new kucing();
        Buku bk = new Buku();
        botol btl = new botol();
        
        System.out.println("=============================");
        ajg.setNama("rocky");
        ajg.setKaki(4);
        ajg.setJenis("Bulldog");
        ajg.setTipe("pengembala");
        ajg.cetakAnjing();
        
        System.out.println("=============================");
        kcg.setNama("shiro");
        kcg.setKaki(4);
        kcg.setJenis("Anggora");
        kcg.setTipe("rumahan");
        kcg.cetakKucing();
        
        System.out.println("=============================");
        bk.setNama("Aku");
        bk.setHalaman(100);
        bk.cetakBuku();
        
        System.out.println("=============================");
        btl.setWarna("Biru");
        btl.setUkuran(500);
        btl.cetakBotol();

    }
   
}
