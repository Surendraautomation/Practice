package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomP {

	public static void main(String[] args) {
		
		 
		 ArrayList<String> ab= new ArrayList<String>();
		 ab.add("Red");
		 ab.add("Green");
		 ab.add("Yellow");
		 System.out.println(ab.contains("Red"));
		 
		 
		System.out.println("List" + ab);
		boolean found=false;
		String search = "Red";
		String []a=new String[ab.size()];
		ab.toArray(a);
		for (String x:a) {
			if(x.equals(search)) {
				found=true;
			}
			System.out.println(found);
			
			System.out.println(x);
		}
		
		
		
		int []g= {1,2,3};
		
		Integer []b=new  Integer []{1,2,3};
		
		
		
		
		
		
		}
		
	}


