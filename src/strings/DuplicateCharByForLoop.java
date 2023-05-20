package strings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharByForLoop {

	public static void main(String[] args) {
		String a1="Surendra";
		String a2="Mayank";
		
		
		String a=a1.concat(a2);
		
		char []c=a.toCharArray();
		
		HashMap<Character, Integer> hm = new  HashMap<Character, Integer>();
		
		for(Character b:c) {
			if(hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			} else {
				hm.put(b, 1);
			}
		}
		
		System.out.println(hm);
		 Set <Character>keys=hm.keySet();
		 
		 for (Character b:keys) {
			 if(hm.get(b)>1) {
				 System.out.println(b + " is repeated " + hm.get(b) + " times");
			 }
			 
		 }
		 
		

	}

}
