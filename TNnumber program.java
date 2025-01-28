//if first number is 6 or 7 or 8 or 9 means.It is tamilnadu state number otherwise its other state number program
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class NewClass {
    public void coll(){
 String s="+91 62345 67891";
 if(Pattern.matches("\\+[1-9]{2}\\s[6-9]{1}[0-9]{4}\\s[0-9]{5}",s))
     
 {
System.out.println("tamil nadu");
 }
    
 else
 {
     System.out.println("false");
 }
    }
} 
