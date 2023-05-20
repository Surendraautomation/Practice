package strings;

public class ReverseWords {
//Not Working
	public static void main(String[] args) {
		String s= "My Name Is Lakan";
		String []a=s.split(" ");
		
		String rev = "";
		
		for ( int i=a.length-1; i>=0; i--) {
			
			if (Character.isUpperCase(s.charAt(i))) {
				rev = rev + Character.toLowerCase(s.charAt(i));
			}else {
				rev = rev + Character.toUpperCase(s.charAt(i));
			}
			
		}
		System.out.println(rev);
	}

}
