/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan3;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if ( 18 <= newAge && newAge <= 30) {
            age = newAge;
        }else{
            System.out.println("Umur minimam 18 dan maksimal 30");
        }
    }
    
    
}
