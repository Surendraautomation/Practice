package arrays;

import java.util.ArrayList;

public class SumInArrayExceptCurrentElement {

	public static void main(String[] args) {
		
		int[]a ={3,1,4,5,3};
		
		  int[]result=new int[a.length];
		  
		  int i=0;
		  
		  int sum=0;
		  
		  while(i < a.length){
			  
		   int temp=a[i];
		   
		   result[i++]=sum;
		   
		   sum+=temp;
		   
		  }
		  
		  i--;
		  
		  sum=0;
		  
		  while(i>=0){
			  
		   int temp=a[i];
		   
		   result[i--]+=sum;
		   
		   sum+=temp;
		  }
		  for(int j=0; j < result.length; ++j){
			  
		   System.out.print(result[j]+", ");
		  }

	}

}
