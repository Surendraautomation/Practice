package arrays;

import java.util.Arrays;

public class MinAndMaxFromArrayBySort {

	public static void main(String[] args) {
int a[] = {10, 20, 30,  50, 40, 70};
		
	//	System.out.println(" Original Arrays " + Arrays.toString(a));
		
		 Arrays.sort(a);
		
		System.out.println("Sorted arrays is " + Arrays.toString(a));
		
//		System.out.println("Smallest Element " + a[0]);
//		System.out.println("Second Smallest Element " + a[a.length-5]);
//		System.out.println("Largest Element " + a[5]);
//		System.out.println("Second Largest Element " + a[a.length-2]);
		int ab;
	      int arr[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
	      System.out.println("Array = "+Arrays.toString(arr));
	      int count = arr.length;
	      for (int i = 0; i < count; i++) {
	         for (int j = i + 1; j < count; j++) {
	            if (arr[i] > arr[j]) {
	               ab = arr[i];
	               arr[i] = arr[j];
	               arr[j] = ab;
	            }
	         }
	      }
	      System.out.println("Smallest: "+arr[0]);
	      System.out.println("Largest: "+arr[arr.length-1]);
	      System.out.println("Second Smallest: "+arr[1]);
	      System.out.println("Second Largest: "+arr[count-2]);

	}

}
