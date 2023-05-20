package arrays;

import java.util.HashMap;

public class TotalNumberOfCharAndTheirCountByHashMap {

	public static void main(String[] args) {
		String s= "Surendraartyu";
		char[] a= s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char b:a) {
			if (hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
				
			
			}
				else {
					hm.put(b, 1);
					
					
				}
			}System.out.println(hm);

	}

}
