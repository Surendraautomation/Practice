package strings;

public class RepeatedLettersFromString {

	public static void main(String[] args) {
		String  a= "Surendra Mayank";
		String c="Surendra";
	    String v= a.concat(c);
	
	char b[]=v.toCharArray();
		char aa= 'a';
		int num = 0;
		
		for (int i=0; i<b.length; i++) {
			
			if(b[i]==aa){
				{System.out.println(b[i]);
				num = num +1;
				
			}
				
			}
			
			}System.out.println(num);
	}

}
