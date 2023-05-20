package arrays;

public class Sure {

	public static void main(String[] args) {
		String s ="Welcome to Mashreq bank" ;
		
		String a[]= s.split(" ");
		
		String Str1 =a[0];
		String Str2 =a[1];
		String Str3 =a[2];
		String Str4 =a[3];
		
		
		String rev = " ";
	
				for(int j=s.length()-1; j>=0; j--) {
					if(a[j].equalsIgnoreCase("Welcome || to || bank" )) {
						rev = rev + s.charAt(j);
					}
					
					
					
					
					
					
					
						
						
					}
				System.out.println(rev);
					
					
				}
				
				
				
			}
			
			
			
			
			
				
			
			
		
		
		

