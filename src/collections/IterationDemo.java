package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class IterationDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> abc= new HashSet<String>();
		
		abc.add("John");
		abc.add("Bob");
		abc.add("Bob");
		abc.add("Martin");
		abc.add(null);
		abc.add("Bob");
		//System.out.println("HashSet " + abc);
		
	 Iterator<String> s=abc.iterator();
	 
	 while(s.hasNext()) {
		System.out.println(s.next());
	 }
	 
	 HashMap<Integer, String>hm=new HashMap<Integer, String>();
		

		hm.put(0, "Bob");
		hm.put(1, "Bob");
		hm.put(2, "ABC");
		
		hm.put(6, "Andrew");
		hm.put(7, null);
		hm.put(7, null);
		hm.put(3, "Martin");
		hm.put(4, "John");
		hm.put(5, null);
		
		
		
		
		Set sn= hm.entrySet();
		
		Iterator it=sn.iterator();
		
			 while(it.hasNext()) {
					
					Map.Entry mp= (Map.Entry) it.next();
					System.out.println(mp.getKey());
					System.out.println(mp.getValue());
			
		}
	 
	 
	 

	}

}