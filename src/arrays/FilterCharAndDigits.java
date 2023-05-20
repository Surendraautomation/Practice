package arrays;

public class FilterCharAndDigits {

	public static void main(String[] args) {
		
		String s= "abc123xyz678";

		String f=" ";

		String e= " ";

		for(int i=0; i<s.length(); i++){

		if(Character.isDigit(s.charAt(i))){

		f= f + s.charAt(i); 
	
		}
		else 
		{ if(Character.isLetter(s.charAt(i))){

		e= e + s.charAt(i); }
}
}
		System.out.println(f);
		System.out.println(e);
	}}


