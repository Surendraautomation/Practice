package arrays;

public class SwapNumbers {

	public static void main(String[] args) {
		int i = 24;
		int j = 54;
		
		System.out.println("Before swapping:");
		System.out.println("i value is: "+i);
		System.out.println("j value is: "+j);
		
		i = i +j;
		
		j = i - j;
		i = i - j;
		
		System.out.println("After swapping:");
		System.out.println("i value is: "+i);
		System.out.println("j value is: "+j);

	}

}
