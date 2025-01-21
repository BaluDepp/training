 
package java2;
import java.io.*;
import java.util.*;
 
class Game{
    void play()
    {
        System.out.println("Let's play a game !!!!");
    }
    void point(){
        System.out.println("Boness point 5000");
    }
    void fine(){
        System.out.println("fine point -500");

}
}
   class HillClimbing extends Game{
      void car()
   {
        System.out.println("car used in long ride");

   }
      void bike(){
        System.out.println("used in long ride");
}
       public int price=50000;
   }
class TrafficRider extends HillClimbing{
    void ride(){
        System.out.println("Overtake bus for get point");
    }
}
class BusSimulater extends TrafficRider {
void HighWay(){
    System.out.println("Go without hitting any obstacles");
}
   public int price=900000;
}


public class Java2 {
   
    public static void main(String[] args) {
       HillClimbing  h1=new  HillClimbing() ;
       h1.play();
       h1.car();
       TrafficRider r1=new TrafficRider();
       r1.point();
       r1.fine();
       BusSimulater b1=new BusSimulater();
       b1.HighWay();
        System.out.println(h1.price);
    }
    
}
