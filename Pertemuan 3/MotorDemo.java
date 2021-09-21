/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan3;

/**
 *
 * @author HP
 */
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahekecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
        motor.tambahekecepatan();
        motor.printStatus();
        
        motor.tambahekecepatan();
        motor.printStatus();
        
        motor.tambahekecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}
