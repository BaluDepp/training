package day;
import java.util.*;
import java.io.*;
public class night{
	static int sub(int i,int j,String s1,String s2) {
		if(i==s1.length()||j==s2.length()) {
			return 0;
		}
		else if(s1.charAt(i)==s2.charAt(j))
		{
			 return 1+sub(i+1,j+1,s1,s2);
			 
		}
		return Math.max(sub(i+1,j,s1,s2),sub(i,j+1,s1,s2));
	}
	public static void main(String []args) {
		String s1="abcd";
		String s2="acbd";
		System.out.println( sub(0,0,s1,s2));
		
	}
}
