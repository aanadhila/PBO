/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annisa.relasiclass.percobaan1;
public class Laptop {
    private String merk;
    private Processor proc;
    public Laptop() {
    }
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    public void info(){
        System.out.println("Merek Laptop = "+merk);
        proc.info();
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }
    
}
