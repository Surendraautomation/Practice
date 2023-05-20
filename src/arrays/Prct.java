package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Prct {

	public static void main(String[] args) {
		 String s= "Automation is my work";
		 String g= s.toLowerCase();
	        char a[]= g.toCharArray();
	        
	        HashMap <Character, Integer> hm = new HashMap <Character, Integer>();
	        for (Character b:a){
	            
	            if(hm.containsKey(b)){
	                
	                hm.put(b, hm.get(b)+1);
	                
	            }
	            else{
	                hm.put(b,1);
	            }
	        }
	        //position of char
	        int k=0;
	        
	        for (int i=0; i<a.length; i++) {
	        	
	        	
	        	if(Character.isLetter(a[i])) {
	        		k++;
	        		//System.out.println("Character " + a[i] +  " is at "+ k + " position");
	        		
	        		
	        	}
	      	
	        	
	        }
	        
	        ArrayList<Character> al= new ArrayList< Character>();
	        
	        int j=0;
	        for (int i=0; i<a.length; i++) {
	        	if  (!al.contains(a[i])) {
	        		al.add(a[i]);
	        		j++;
	        		
	        		//System.out.println(a[i]);
	        		
	        	//	System.out.println("Character " + a[i] +  " is at "+ j + " position");
	        		
	        }
	      
	    	  
	      }
	        	
	        
	       Set sn = hm.entrySet();
	       
	       Iterator it=sn.iterator();
	       
	       while (it.hasNext()) {
	    	   
	    	   Map.Entry mp=(Map.Entry) it.next();
	    	   
	    	  // System.out.println(mp.getKey());
	    	  // System.out.println(mp.getValue());
	    	   
	    	   System.out.println( mp.getKey()+ " is repeated " + mp.getValue()+ " times");
	    	   
	       }
	       
	        

	      //  System.out.println(hm);

	}

}
