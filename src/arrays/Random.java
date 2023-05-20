package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Random {

	public static void main(String[] args) {
	
		String s= "This is automation is fun";
		char[] a = s.toCharArray();  
		
		
		 Map<Character, Integer> hm = new HashMap<Character, Integer>();  
	        
	        for (Character ch : a) {  
	            if (hm.containsKey(ch)) {  
	                hm.put(ch, hm.get(ch) + 1);  
	            } else {  
	                hm.put(ch, 1);  
	            }  
	        }  
	        
	        
	        Set<Character> keys = hm.keySet();  
	        for (Character ch : keys) {  
	            if (hm.get(ch) > 1) {  
	                System.out.println(ch + "  is " + hm.get(ch) + " times");  
	            }  
		
		
		
	}}}