package arrays;

import java.util.HashMap;
import java.util.Map;

public class Int {

	public static void main(String[] args) {
		
		int a []= {1,2,3,4,3,4,1};
		
		int temp =0;
		
		//sorting desc
		
		Map< Integer, Integer> hm = new HashMap< Integer, Integer>();
		
		for (Integer b:a) {
			if(hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			}
			
			else {
				hm.put(b, 1);
			}
		}
		
			
		}
		
		
	}
	


