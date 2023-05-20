package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetDemo {
	
	
		public static void main(String[] args) {
	
		HashSet<String> abc= new HashSet<String>();
		//Null Accepted
		//No Duplicate Value
		//No Insertion Order
		abc.add("John");
		abc.add("Bob");
		abc.add("Bob");
		abc.add("Martin");
		abc.add(null);
		abc.add("Bob");
		System.out.println("HashSet " + abc);
		
		LinkedHashSet<String> ab= new LinkedHashSet<String>();
		//Null Accepted
		//No Duplicate Value
		//Maintains Insertion Order
				ab.add("John");
				ab.add("Bob");
				ab.add("Martin");
				ab.add(null);
				ab.add("Bob");
				ab.add(null);
				System.out.println("LinkedHashSet " + ab);
				
				
				TreeSet<String> a= new TreeSet<String>();
				//No Null Accepted
				//No Duplicate Value
				//Maintains ALPHABETIC Insertion Order
						a.add("John");
						a.add("Bob");
						a.add("Martin");
						
						a.add("Bob");
						
						System.out.println("TreeSet " + a);	

	}

}
