package strings;

import java.util.HashMap;
import java.util.Set;

public class Green {

	public static void main(String[] args) {
		String s="Surendra Suryavanshi";
		
		
		String f=s.replaceAll("\\s", "");
		System.out.println(f);
		
		char c[]=f.toCharArray();

		System.out.println(s.length());
		System.out.println(f.length());
		
		
		HashMap<Character, Integer>hm= new HashMap<Character, Integer>();
		
		for (Character b:c) {
			if (hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			}else {
				hm.put(b, 1);
			}
			
			
		}
 System.out.println(hm);

Set <Character> keys=hm.keySet();
for(Character b:keys) {
	if(hm.get(b)==1)
	
	System.out.println(b + " is repaeted" + hm.get(b) +" times");
	
}
	}

}
