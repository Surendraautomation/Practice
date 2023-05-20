package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import truenotee.Hello;

public class Ace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] s= {"John", "Rockey", "Sunny", "Harry"};
//		for ( String a:s) {
//			System.out.println(a);
//		}
		
		//System.out.println(Arrays.toString(s));
		
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
	}

}
