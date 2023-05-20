package arrays;

public class ReverseDemoLetterOnly {
	
	public static void main(String[] args) {
		
		String s="Sure123ndra456";
		 int j = s.length()-1;
		
		 StringBuilder sb = new StringBuilder();
	        
	        for (int i = 0; i < s.length(); i++) {
	        	
	            if (Character.isDigit(s.charAt(i))) {
	            	
	                while (!Character.isDigit(s.charAt(j)))
	                    j--;
	                
	                sb.append(s.charAt(j--));
	                
	            } else {
	                sb.append(s.charAt(i));
	            }
	        } 
		System.out.println(sb);
		
		
		
		//System.out.println(reverseOnlyLetters("Hi123By456"));
		
//	}
		//public static String reverseOnlyLetters(String s) {
			
//	        StringBuilder ans = new StringBuilder();
//	        
//	        int j = s.length() - 1;
//	        
//	        for (int i = 0; i < s.length(); i++) {
//	        	
//	            if (Character.isLetter(s.charAt(i))) {
//	            	
//	                while (!Character.isLetter(s.charAt(j)))
//	                    j--;
//	                ans.append(s.charAt(j--));
//	            } else {
//	                ans.append(s.charAt(i));
//	            }
//	        }
//
//	        return ans.toString();

	}

}
