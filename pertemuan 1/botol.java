/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester3;

public class botol {
    public String warna;
    public int ukuran;
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    public void setUkuran(int newValue){
        ukuran = newValue;
    }
    public void cetakBotol(){
        System.out.println("Warna botol : "+warna);
        System.out.println("Ukuran : "+ukuran+" ml");
    }    
}
