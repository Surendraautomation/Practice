package arrays;

import java.util.HashMap;
import java.util.Set;

public class Yello {

	public static void main(String[] args) {
		int a[] ={1,2,3,3,3,3,4,4};
		
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		
		for(Integer b:a) {
			if (hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			}
			else {hm.put(b, 1);
		}

		}//System.out.println(hm);
			Set <Integer>keys=hm.keySet();
			
			for(Integer  b:keys) {
				if(hm.get(b)>1) {
					System.out.println( b );
				}
				
				
				
			}
		

	}

}
