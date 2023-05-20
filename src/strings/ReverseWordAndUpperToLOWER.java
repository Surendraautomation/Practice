package strings;

public class ReverseWordAndUpperToLOWER {

	public static void main(String[] args) {
		String s= "My Name Is Surendra";
		//String a[]=s.split(" ");
		
		char[] a=s.toCharArray();
		
		
		
		String rev = " ";
		
		
		for ( int j=a.length-1; j>=0; j--) {
			
			if(Character.isUpperCase(a[j])) {
				rev = rev + Character.toLowerCase(a[j]);
			} else {
				rev = rev + Character.toUpperCase(a[j]);
			}
			
			}
			
		System.out.println(rev);
	

	}

}
