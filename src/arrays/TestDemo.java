package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {
		
   String s="Surendra Mohan Suryavanshi";
   
   int count = 0;
   
   int a= 0;
   int e= 0;
   int i= 0;
   int o= 0;
   int u= 0;
   
   
   for (int m=0; m<s.length(); m++) {
	   if (s.charAt(m)=='a') {
		   
		   
		   
		   a++;
		   
	   }
	   else if (s.charAt(m)=='e') {
		   
		   
		   
		   e++;
		   
	   }
 else if (s.charAt(m)=='i') {
		   
		   
		   
		   i++;
		   
	   }
 else if (s.charAt(o)=='e') {
	   
	   
	   
	   o++;
	   
 }
 else if (s.charAt(m)=='u') {
	   
	   
	   
	   u++;
	   
 }
	  
   }
   System.out.println("Count of a is " + a);
   System.out.println("Count of e is " +e);
   System.out.println("Count of i is " +i);
   System.out.println("Count of o is " +o);
   System.out.println("Count of u is " +u);
  
 
	}

}
