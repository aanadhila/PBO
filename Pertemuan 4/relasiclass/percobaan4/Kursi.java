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
public class Kursi {
    private String nomor;
    private Penumpang Penumpang;
    public Kursi(String nomor) {
        this.nomor = nomor;
    }
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public Penumpang getPenumpang() {
        return Penumpang;
    }

    public void setPenumpang(Penumpang Penumpang) {
        this.Penumpang = Penumpang;
    }
    
   public String info(){
       String info = " ";
       info += "Nomor: " + nomor + "\n";
       if (this.Penumpang != null) {
           info += "Penumpang: " + Penumpang.info() + "\n";
       }return info;
   } 
    
}
