package strings;

public class DuplicateWordsFromString {

	public static void main(String[] args) {
		String s = "Big black bug bit a big black dog on his big black nose nose nose";   
		
		String[] a=s.split(" ");
		
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				if((a[i])==(a[j])) {
					System.out.print(a[j] + " ");
				}
			}
		}
		

	}

}
