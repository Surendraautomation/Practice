package strings;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String s= "My Name is Surendra";
		String a[]=s.split(" ");
		String rev = " ";
		
		
		
		for ( int i=0; i<a.length; i++) {
			for( int j=a[i].length()-1; j>=0; j--) {
				rev = rev + a[i].charAt(j);
				
			}
			rev = rev + " ";
		}
		System.out.print(rev);

	}

}
