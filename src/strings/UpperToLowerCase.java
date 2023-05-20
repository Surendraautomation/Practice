package strings;

public class UpperToLowerCase {

	public static void main(String[] args) {
		 String s = "Hello world of Java";
		    
	        String rev = " ";
	        
	        for ( int i=0; i<s.length(); i++){
	            if(Character.isUpperCase(s.charAt(i))){
	                rev = rev + Character.toLowerCase(s.charAt(i));
	            }
	            else {
	                if(Character.isLowerCase(s.charAt(i))){
	                rev = rev + Character.toUpperCase(s.charAt(i));
	                
	            }
	          
	        }
	        
	       
	    } System.out.println(rev);

	}

}
