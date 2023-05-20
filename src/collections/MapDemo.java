package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		//No KEY Duplicate, VALUE may be
		//NOT Maintains Insertion Order

		hm.put(0, "Bob");
		hm.put(1, "Bob");
		hm.put(2, "ABC");
		
		hm.put(6, "Andrew");
		hm.put(7, null);
		hm.put(7, null);
		hm.put(3, "Martin");
		hm.put(4, "John");
		hm.put(5, null);
		System.out.println("HashMap " + hm);
		
		
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Map.Entry mp= (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
		LinkedHashMap<Integer, String>lhm=new LinkedHashMap<Integer, String>();
		//No KEY Duplicate, VALUE may be
		//Maintains Insertion Order
		lhm.put(7, "Kris");
		lhm.put(1, "Bob");
		lhm.put(0, "Bob");
		lhm.put(1, "Bob");
		lhm.put(3, "Martin");
		lhm.put(4, null);
		lhm.put(1, "John");
		lhm.put(5, "Andrew");
		System.out.println("LinkedHashMap " +lhm);
		
		
		TreeMap<Integer, String>trm=new TreeMap<Integer, String>();
		//No KEY Duplicate, VALUE may be
		//Maintains Keyswise Serial Insertion Order
//		trm.put("d", "sfsfs");
//		trm.put("d", "sfsfs");
//		trm.put("c", "sfsfs");
//		trm.put("dr", "sfsfs");
//		trm.put("z", "sfsfs");
		trm.put(7, "Kris");
		trm.put(1, "Bob");
		trm.put(0, "Bob");
		trm.put(1, "Bob");
		trm.put(3, "Martin");
		trm.put(4, null);
		trm.put(1, "John");
		trm.put(5, "Andrew");
		System.out.println("TreeMap " +trm);
		
		
		

	}

}
