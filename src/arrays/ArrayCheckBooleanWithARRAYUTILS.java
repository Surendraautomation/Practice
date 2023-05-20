package arrays;

import java.util.Arrays;

import java.util.List;

public class ArrayCheckBooleanWithARRAYUTILS {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
		String[] nameArray = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};
		
		List<Integer> a=Arrays.asList(intArray);
		List<String> s= Arrays.asList(nameArray);

		System.out.println(a.contains(2));
		System.out.println(s.contains("John"));
		
		
		
		
		
//		int[] intArray1 = new int[]{1, 2, 3, 4, 5};
//		boolean found = false;
//		int searchedValue = 2;
//
//		for(int x : intArray1){
//			if(x == searchedValue){
//		        found = true;
//		        break;
//		    }
//		}
//
//		System.out.println(found);
		
		
		
		

	}

}
