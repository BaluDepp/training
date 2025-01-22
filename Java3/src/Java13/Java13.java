package Java13;
 

public class Java13{
     public static void main(String args[]){
         animal d=new Dog ();
         d.food();
         animal a=new cat();
         a.food();
     }
 }
interface animal{
     void food();
     void sleep();
     default void place(){
         System.out.println("Pce of the animal");
}    
}
class Dog implements animal{
    @Override
    public void food(){
        System.out.println("meat");
    }
    @Override
    public void sleep(){
        System.out.println("road");
    }
}
class cat implements animal{
    @Override
    public void food(){
        System.out.println("milk");
    }
    @Override
    public void sleep(){
        System.out.println("compound wall");
    }}

    

