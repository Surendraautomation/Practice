package truenotee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Prc {

	public static void main(String[] args) {
	
String s = "Automation is my work and yes yes Automation is fun";  //String

String a[]= {"Surendra", "Narendra", "Devendra", "Mahendra"}; //String Array

int[]n= {1,2,3,4,4,3,2,1}; //Integer array

Arrays.sort(n);

//System.out.println(Arrays.toString(n));
//System.out.println((n.length)-1);
//
//System.out.println(a[a.length-1]);
//System.out.println(n[n.length-3]);

HashMap<String, Integer> hm = new HashMap<String, Integer>();

Set<String> hs= new HashSet<String>();
String b[]=s.split(" ");

for (int i=0; i<b.length; i++) {
	
	hs.add(b[i]);

	
	}
System.out.println(hs);
}

			}
		
