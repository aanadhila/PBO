/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annisa.relasiclass.tugas;

public class sifat {
    private String sifat;
    private identitas id;

       public String getSifat() {
        return sifat;
    }

    public sifat(String sifat, identitas id) {
        this.sifat = sifat;
        this.id = id;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public void info(){
        this.id.info();
        System.out.println("Sifat :" + sifat);
    }
    
    
}
