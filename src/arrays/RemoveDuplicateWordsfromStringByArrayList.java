package arrays;

import java.util.ArrayList;

public class RemoveDuplicateWordsfromStringByArrayList {

	public static void main(String[] args) {
		String d= "can tal can  tal can ran han tan";
		String []a=d.split(" ");

		String f= " ";
		
		ArrayList<String> al= new ArrayList<String>(); 
		for(int i=0; i<a.length; i++) {
			if(!al.contains(a[i])) {
				al.add(a[i]);
				
				
				
				
				f= f+ a[i] + " ";
				
			}
			
		}System.out.println(f);
	}

}
