package arrays;

import java.util.HashMap;

public class AllWordsAndTheirCountsFromStringByHashMapwithEnhancedFL {

	public static void main(String[] args) {
		String s= "This is automation , and it's fun doing automation";
		String [] a= s.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (String b:a) {
			
			if (hm.containsKey(b)) {
				
				hm.put(b, hm.get(b)+1);
				}
			
				else {
					hm.put(b, 1);
					
				}
			}System.out.println(hm);

	}

}
