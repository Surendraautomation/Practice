package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Para {
	


	public static void main(String[] args) {
		
		String s= "abcd1$?@23=+4efg";
		
		String Letter= " ";
		String SpChar= " ";
		String Digit= " ";
		
		
		for (int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				Letter= Letter + s.charAt(i);
				
				
			}else {
				if(Character.isDigit(s.charAt(i))) {
					Digit= Digit + s.charAt(i);
				}
				else {
					SpChar=SpChar + s.charAt(i);
				}
				
			}
			
		}
		
				System.out.print("Lettters are " + Letter);
				System.out.println("");
				System.out.print("Digits are " +Digit);
				System.out.println("");
				System.out.print("SPChar are " +SpChar);
				
	}
	
	

}
