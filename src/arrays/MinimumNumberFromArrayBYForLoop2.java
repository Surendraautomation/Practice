package arrays;

public class MinimumNumberFromArrayBYForLoop2 {

	public static void main(String[] args) {
		int [] a = {1,2,3,2,5,45,5,3,4,2,2,6,7,8,8,};
		int n=Integer.MAX_VALUE;
		
		for (int i=0; i<a.length; i++) {
			if((a[i])<n) {
				n=a[i];
				
			}
		}
		System.out.println(n);

	}

}
