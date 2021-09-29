/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package annisa.relasiclass.tugas;

public class citacita {
   private String mimpi;
   private sifat id;

    public citacita(String mimpi, sifat id) {
        this.mimpi = mimpi;
        this.id = id;
    }
   
   public void info(){
       id.info();
       System.out.println("Cita - cita :"+ mimpi);
   }
}
