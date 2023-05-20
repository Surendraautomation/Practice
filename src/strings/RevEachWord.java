package strings;

public class RevEachWord {

	public static void main(String[] args) {
		String s="Surendra is my name";
		String [] y=s.split(" ");
		String rev = " ";
		
		
		for(int i=0; i<y.length; i++) {
			for (int j=y[i].length()-1; j>=0; j--) {
				rev = rev + y[i].charAt(j);
				
			}
			rev = rev +" ";
		}  
		
		System.out.println(rev);

	}

}
