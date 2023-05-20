package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	
		public static void main(String[] args) {
			String[] s= {"John", "Rockey", "Sunny", "Harry"};
			for ( String a:s) {
				System.out.println(a);
			}
			
			System.out.println(Arrays.toString(s));
			
			List<String> abc= new ArrayList<String>(Arrays.asList(s));
			abc.add(0, null);
			abc.add(0, "Martin");
			abc.add(0, null);
			abc.add(0, "Martin");
			
			
			System.out.println(abc.contains("Sunny"));
			System.out.println(abc.indexOf("Martin"));
			System.out.println(abc.isEmpty());
			System.out.println(abc.size());
			
			System.out.println(abc);
			
			Iterator<String> i=abc.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			
		ListIterator <String> n=	abc.listIterator(0);
		while(n.hasPrevious()) {
			System.out.println(n.previous());
		}
			
		String []xyz= new String [abc.size()];
		abc.toArray(xyz);
		for (String a:abc) {
			System.out.println(a);
		}
			
	}

}
