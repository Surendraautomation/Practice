package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AnyPosfromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,3,4,2,3};
		String d[]= {"red","yel","gre"};
		
		Set<Integer> hs=new LinkedHashSet<Integer>();
		for (int i=0; i<a.length; i++) {
			hs.add(a[i]);	
			
		}
		System.out.println(hs);
		int n =hs.size();
		System.out.println(n);
//		
//		List<Integer> list = Arrays.stream(a).boxed().toList();
//		System.out.println(list);
//		
//		ArrayList<Integer>al=new ArrayList<Integer>(a.length);
//		System.out.println(al);
//		
//		ArrayList<String>alstr=new ArrayList<String>(Arrays.asList(d));
//		System.out.println(alstr);
		
		
		
		

	}
	

}
