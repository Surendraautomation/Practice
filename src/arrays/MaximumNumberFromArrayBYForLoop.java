package arrays;

public class MaximumNumberFromArrayBYForLoop {

	public static void main(String[] args) {
		int [] a = {2,3,2,5,45,5,3,4,2,2,6,7,8,8,};
		int n=0;
		
		for (int i=0; i<a.length; i++) {
			if((a[i])>n) {
				n=a[i];
				
			}
		}
		System.out.println(n);

	}

}
