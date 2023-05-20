package arrays;


public class AscAndDescNumFromArray {

	public static void main(String[] args) {
		int [] a = {1,25,7,4,9,3};     
	      int temp  =0;    
	            
	        
	            
	        //Sort the array in ascending order    
	        for (int i = 0; i < a.length; i++) {     
	            for (int j = i+1; j < a.length; j++) {     
	               if(a[i] > a[j]) {    
	                   temp = a[i];    
	                   a[i] = a[j];    
	                   a[j] = temp;    
	                  
	               }      
	            }      System.out.print(" " + a[i] + "\t");
	        }    System.out.println("\t" + "2nd Smallest element of the array is:: "+a[1]);


	}

}
