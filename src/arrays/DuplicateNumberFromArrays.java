package arrays;

public class DuplicateNumberFromArrays {

	public static void main(String[] args) {
		int [] a = {1,2,2,2,3,2,5,5,5,5};
		
		System.out.println("Duplicate Integers");
		
		for (int i=0; i<a.length; i++) {
			
			for ( int j=i+1; j<a.length; j++) {
				
				int count =1;
				
				 if((a[i])==(a[j])) { 
					 
					count = count +1;
					
					a[j]=0;
				
					 
				}
			}if (a[i]>1 && !(a[i]==0)) {
				
				System.out.println(a[i]);
			}
		}
		
	}

}
