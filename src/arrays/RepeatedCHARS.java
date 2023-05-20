package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCHARS {

	public static void main(String[] args) {
		String s = "Big black bug bit a big black dog on his big black nose nose nose"; 
		String w= s.replaceAll("\\s", "");
		char a[]=w.toCharArray();
		
		System.out.println(w);
		//String[] a = s.split(" ");  
		
		
		 Map<Character, Integer> hm = new HashMap<Character, Integer>();  
	        
	        for (Character b : a) {  
	            if (hm.containsKey(b)) {  
	                hm.put(b, hm.get(b) + 1);  
	            } else {  
	                hm.put(b, 1);  
	            }  
	        }  
	        System.out.println(hm);
	        
	        Set<Character> keys = hm.keySet();  
	        for (Character b : keys) {  
	            if (hm.get(b) > 1) {  
	                System.out.println(b + "  is repeated " + hm.get(b) + " times");  
	            }  
		

	}

	}}
