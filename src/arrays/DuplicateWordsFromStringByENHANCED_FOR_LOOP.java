package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsFromStringByENHANCED_FOR_LOOP {

	public static void main(String[] args) {
		String s = "Big black bug bit a big black dog on his big black nose nose nose"; 
		String[] a = s.split(" ");  
		
		
		 Map<String, Integer> hm = new HashMap<String, Integer>();  
	        
	        for (String b : a) {  
	            if (hm.containsKey(b)) {  
	                hm.put(b, hm.get(b) + 1);  
	            } else {  
	                hm.put(b, 1);  
	            }  
	        }  
	        System.out.println(hm);
	        
	        Set<String> keys = hm.keySet();  
	        for (String b : keys) {  
	            if (hm.get(b) > 1) {  
	                System.out.println(b + "  is repeated " + hm.get(b) + " times");  
	            }  
		

	}

}
}