package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practice {
	
	 

	public static void main(String[] args) {
		//String s= "Surendra is may name & what is yours r r r";
	   //  String n[] = s.split(" ");
	    
		
		int [] n= {2,3,4,1,2,3,4,1,9,7,7,7,7};
	     
	     
	     //ArrayList<String> al= new ArrayList<String>();   
	     ArrayList<Integer> al= new ArrayList<Integer>();  
	    
	    for (int i=0; i<n.length; i++) {
	    	 int k=0;
	    	
	    	if(!al.contains(n[i])) {
	    		al.add(n[i]);
	    		k++;
	    		
	    	for(int j=i+1; j<n.length; j++) {
	    		if(n[i]==n[j]) {
	    			k++;
	    		}
	    	}
	   
	    	
	     
		
	    } if((k==1))
        	System.out.print(n[i]);
	}

	}}
