package strings;

public class MixSpCharAndString {

	public static void main(String[] args) {
		
		
		String s="My Name is Surendra Surayavanshi";
	       String a= "$ % ^ % *";
	       String []s1= s.split(" ");
	       String []a1= a.split(" ");
	       String y = " ";
	        
	        for ( int i=0; i<s1.length; i++){
	           y = s1[i]+ a1[i];
	                    System.out.print(y);
	                }


	}

}
