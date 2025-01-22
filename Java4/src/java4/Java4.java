/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

/**
 *
 * @author user
 */
public class Java4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal d=new Dog ();
         d.food();
         d.place();
         animal a=new cat();
         a.food();
         a.place();
    }
    
}
interface animal{
     void food();
     void sleep();
     default void place(){
         System.out.println("Place of the animal");
}    
     }
class Dog implements animal{
    public void food(){
        System.out.println("meat");
    }
    public void sleep(){
        System.out.println("road");
    }
}
class cat implements animal{
    public void food(){
        System.out.println("milk");
    }
    public void sleep(){
        System.out.println("compound wall");
    }
}
