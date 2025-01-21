 /*
package java1;
import java.util.*;
import java.io.*;
 
public class Java1 {
  
    
    public static void main(String[] args) {
            
           Book b1=new Book();
           Book b2=new Book();
           b1.title="Balu";
           b1.Auther="ashif";
           b1.price=345;
           System.out.println(b1.title);
    }
    
}

class Book{
    public String title;
    public String Auther;
    public double price;
}*/
 /*import java.util.*;

class animal{

    String rate;
    void eat(){
        System.out.println("eat food as meet");
    }
}
class bird extends animal{
    void eat(){
        
        System.out.println("birds eat food as Earthworm");
    }
    public int rate = 3000;
    
}
class pet extends animal{
void domstic(){
    System.out.println("I have both birds and dogs");
}
public int rate = 8500;
} 
public class Java1
{
public static void main(String[]args)
{
 animal a1=new pet();
 animal b1=new bird();  
a1.eat();
b1.eat();
a1.domstic();

}
}  
*/
import java.util.*;
import java.io.*;
 class animal{
      int a;
     public animal(){
         a=10;
         System.out.println(a);
     }
 }
class dog extends animal{
    int b;
   public dog(){
         b=20;
         System.out.println(b);
    }
}
class pet extends dog{
   public pet(){
         System.out.println(a+b);         
    }
   void display(){
       System.out.println(a+" "+b);
   }
}
public class Java1{
public static void main(String args[]){
    pet p1=new pet();
    p1.display();
}
        
}
