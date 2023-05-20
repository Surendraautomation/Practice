package arrays;

public class IntR {

	public static void main(String[] args) {
		String s= "this is recro interview";

		String [] a= s.split(" ");
		
		//Output : “Interview Recro Is This”

		String r= " ";
		
		for ( int i =a.length-1; i>=0; i--){
			
			r = r + a[i] + " ";
		}
		
		
		System.out.println(r);
		
		
		

//		for ( int i =s.length()-1; i>=0; i--){
//			 
//			  if(Character.isUpperCase(s.charAt(i))) {
//				   r= r + Character.toLowerCase(s.charAt(i));
//			  }
//			
//			  r = r + s.charAt(i);
//			
//			
//
//
//	}
//System.out.println(r);
}
}