package strings;

public class ReverseStringEachWordOnSamePlace {

	public static void main(String[] args) {
		String s= "My Name is Surendra";
		String rev = " ";
		
		//System.out.println(s.length());
		for ( int i =s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.print(rev);
	}

}
