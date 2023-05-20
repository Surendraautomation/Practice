package arrays;

public class MinNumberfromMultiDimensionalArray {

	public static void main(String[] args) {
		int [][] a= {{9,8,9},{3,4,5},{4,5,6}};
		
		int min = a[0][0];
		 for ( int i=0; i<3; i++) {
			  for ( int j=0; j<3; j++) {
				  
				  if (a[i][j]<min) {
					  
					  
					  min=a[i][j];
					  a[i][j]=  a[j][i];
					  a[j][i]= min;
					  
					  
					  
				  }
				  
			  }System.out.println(min);
		 }
			
		
		

	}

}
