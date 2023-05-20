package strings;

public class AlternateLowerCase {

	public static void main(String[] args) {
		
	    String s = "abcde"; 
	    
	    StringBuffer updatedString = new StringBuffer(); 
	    
	    char[] a = s.toCharArray(); 
	     
	    for (int i = 0; i < a.length; i++) { 
	      
	      char c = a[i]; 
	      
	     
	      if (i % 2 != 0) { 
	        
	        c = Character.toUpperCase(c); 
	      } 
	     
	      updatedString.append(c); 
	    } 
	    System.out.println("Modified string is: " + updatedString.toString()); 
	  } 
	

	}


