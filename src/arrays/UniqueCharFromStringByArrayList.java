package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueCharFromStringByArrayList {

	public static void main(String[] args) {
		
		//Unique char from string
		
		String d= "banana tanana canana canana lalana  lalana banana";
		String []a= d.split(" ");
		
		ArrayList<String> ab =  new ArrayList<String>();
			
		for (int i=0; i<a.length; i++) {
	
			if (!ab.contains(a[i])) {
				
				int k = 0; 	
				
				ab.add(a[i]);
				
				k++;
			
				for (int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					k++;
							}
						}
				if(k==1)
				System.out.println(a[i]);
			
			}
		}

	}

}
