package strings;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=4; 
		int count = 0;
		
		for ( int i=1; i<a/2; i++) {
			if ( a%i==0) {
				count =count +1;
			}
		} if (count==1) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}

	}

}
