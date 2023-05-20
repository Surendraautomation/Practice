package strings;

public class RemoveSpChar {

	public static void main(String[] args) {
		String s = "d$$r#";


				int k = 0;

				
				for ( int i=0; i<s.length(); i++){
				
					if(Character.isLetter(s.charAt(i))) {
						System.out.print(s.charAt(i));
						
						//k++;
					}
				
				}//System.out.println(k);
	}

}
