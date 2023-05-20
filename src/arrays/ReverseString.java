package arrays;

public class ReverseString {

	public static void main(String[] args) {
		String s= "surendra abc";
		String []a=s.split(" ");
		
		
		String rev =" ";
		
		for(int i=0; i<a.length; i++) {
			for(int j=a[i].length()-1; j>=0; j--) {
				rev =rev + a[i].charAt(j);
				
			}rev = rev + " ";
		}
		
			System.out.println(rev);
			
			
//		
//		for (int i=s.length()-1; i>=0;  i-- ) {
//			
//			rev= rev + (s.charAt(i));
//			
//		}
//		
//		System.out.println(rev);

	}

}
