package strings;

public class ReverseExceptOneWord {

	public static void main(String[] args) {
		String p="My Name is Lakhan";
		//Not Working
		String [] s= p.split(" ");
		 int j = s.length;
		
		 StringBuilder ans = new StringBuilder();
	        
	        for (int i = 0; i < s.length-1; i++) {
	        	
	        	for(int h=s[i].length()-1; h>=0; i--) {
	        		
	        	
	        	
	            if (Character.isLetter(s[i].charAt(i))) {
	            	
	                while (!Character.isLetter(s[h].charAt(h)))
	                    j--;
	                
	                ans.append(s[i].charAt(j--));
	                
	            } else {
	                ans.append(s[i].charAt(i));
	            }
	        }
	        }
	       
		System.out.println(ans);
		

	}

}
