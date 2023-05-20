package arrays;

public class EvenOROddNumber {

	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 4, 5};
		
		for ( int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("Even Number " + a[i]);
				
			}
			else 
			{
				System.out.println("Odd Number " + a[i]);
			}
		}

	}

}
