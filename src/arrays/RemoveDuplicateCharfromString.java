package arrays;

import java.util.ArrayList;



public class RemoveDuplicateCharfromString {

	public static void main(String[] args) {
		String d= "aabbbcccdddeeefff";
		char[]a= d.toCharArray();
	String f= " ";
		
		ArrayList<Character> al= new ArrayList<Character>(); 
		for(int i=0; i<a.length; i++) {
			if(!al.contains(a[i])) {
				al.add(a[i]);
				
				f= f+ a[i];
				
			}
			
		}System.out.println(f);
	}

}
