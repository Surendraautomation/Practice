package arrays;

import java.util.Arrays;

public class SecLargestORLowestNumFromArray {

	public static void main(String[] args) {
		int temp;
		
	      int array[] = {10, 20, 50, 30, 90, 50};
	     
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
	      for(int i = 0; i<array.length; i++ ){
	         for(int j = i+1; j<array.length; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	              
	            }
	         }
	        
	         
	      }
	      System.out.println("2nd Smallest element of the array is:: "+array[1]);

	}

}
