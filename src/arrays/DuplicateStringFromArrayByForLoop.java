package arrays;

public class DuplicateStringFromArrayByForLoop {

	public static void main(String[] args) {
		//String s[]= {"can","lan","can","van","pan","pan"};
		int [] a = {1,2,2,2,3,2,5,5,5,5};
		
		for (int i=0; i<a.length; i++) {
			
			
			for (int j=i+1; j<a.length; j++) {
				
				if(a[i]==(a[j])) {
				
					int k=0;
					
					k++;
					
					a[j]=0;
					
				}
				}if (a[i]>1 && !(a[i]==0)) {
					
					System.out.println(a[i]);
			} 
				
			
		}

	}

	
}