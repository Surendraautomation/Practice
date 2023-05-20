package arrays;

import java.util.HashMap;
import java.util.Set;

public class DuplicateNumberAndTheirCountFromArraysByHashMap {

	public static void main(String[] args) {
		int [] a = {4,2,2,6,7,8,8,2,2,2,4,2,2,2,1};
		
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
				
		for (int i=0; i<a.length; i++) {
			
			if(hm.containsKey(a[i])) {
				
				int count= hm.get (a[i])+1;
				
				hm.put(a[i], count);
				
				//System.out.println(a[i]);
				
				//System.out.println("Repeatation count is " + count + " for " + a[i]);
			}
			
			
			else {
				hm.put(a[i], 1);
			}
			
		}
		
		Set<Integer>keys=hm.keySet();
		
		for (Integer b:keys) {
			if(hm.get(b)>1) {
				System.out.println(b + "is Repeated " + hm.get(b)+ " times");
			}
		}
		
		
		
		//System.out.println("All integers with their repeatation count " + hm);

	}

}
