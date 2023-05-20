package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		
		
		String d= "java python abc abc java python abc java english";

		String e[]=d.split(" ");
		
		//Arrays.sort(e);
		
		ArrayList<String>al=new ArrayList<String>();
		
		for ( int i=0; i<e.length; i++) {
			al.add(e[i]);
		}
		
		System.out.println(al);
		
Map<String, Integer>  hm = new TreeMap<String, Integer>();
		
		for (String b:al) {
			if(hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			}
			else {
				hm.put(b, 1);
					
				
			}
		}
		
		System.out.println(hm);
		
		
		
//		Map<String, Integer> unsortedMap = Map.of("a", 1, "c", 3, "b", 2, "e", 5, "d", 4);
//
//		LinkedHashMap<String, Integer> sortedMap = unsortedMap.entrySet()
//		    .stream()
//		    .sorted(Map.Entry.comparingByValue())
//		    .collect(Collectors.toMap(
//		        Map.Entry::getKey,
//		        Map.Entry::getValue,
//		        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//
//		System.out.println(sortedMap);

	}

}
