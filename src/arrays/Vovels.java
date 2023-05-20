package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Vovels {

	public static void main(String[] args) {
		String s="Surendra Mohan Suryavanshi";
		String c=s.replaceAll("\\s", "");
		char a[]=c.toCharArray();
		
		Map<Character, Integer>hm= new HashMap<Character, Integer>();
		
		for ( Character b:a) {
			if(hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			}
			else {
				hm.put(b, 1);
			}
		}
		
		System.out.println(hm);
		
		
		Set<Character>keys=hm.keySet();
		for (Character b:keys) {
			if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
				System.out.println(b + " is repeated " + hm.get(b) + " times");
				//System.out.println(hm);
			}
		}
		
		//System.out.println(hm);
		

	}

}
