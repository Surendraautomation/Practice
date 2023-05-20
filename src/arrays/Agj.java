package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Agj {
//unique REpeated count
	public static void main(String[] args) {
		//int [] a = {1,2,3,2,5,5};
		
	//	String d = "Surenfta in in is is";
		
		
		String t="Surendra";
		char d[]=t.toCharArray();
		
		
		System.out.println(d);
		
		//String a[]=d.split(" ");
		
		String []a= {"ban", "can", "tan","lan","ban", "can", "tan"};
		
		
		//ArrayList<String> al= new ArrayList<String>();
		
		for (int i=0; i<a.length; i++) {
			int count =0;
			for (int j=i+1; j<a.length; j++) {
				if((a[i]).equals(a[j])) {
					count++;
					a[j]="0";
					
					System.out.println(a[i]);
				}
			}
			
			
		}
		
		
		
	}

}
