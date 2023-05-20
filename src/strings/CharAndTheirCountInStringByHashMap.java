package strings;

import java.util.HashMap;

public class CharAndTheirCountInStringByHashMap {

	public static void main(String[] args) {
		String s= "Surendraa rtyu";
		char[] a= s.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char b:a) {
			if (hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);}
				else {
					hm.put(b, 1);
					
				}
			}System.out.println(hm);
		}
		

	}


