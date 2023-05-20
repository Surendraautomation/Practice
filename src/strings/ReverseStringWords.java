package strings;

public class ReverseStringWords {

	public static void main(String[] args) {
		
		

		String s= "My Name is Surendra";
		String a[]=s.split(" ");
		
		
		
		String rev = " ";
		
		
		for ( int j=a.length-1; j>=0; j--) {
			

				
				rev = rev + a[j];
				rev = rev +" ";
				
			}
			
			
			
			
		System.out.print(rev);
				
			
		
			
			
			
		}
		
	
}