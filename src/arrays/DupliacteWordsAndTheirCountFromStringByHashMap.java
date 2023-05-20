package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DupliacteWordsAndTheirCountFromStringByHashMap {

	public static void main(String[] args) {
	
		String d= "java python abc abc java python abc java english";
		
				
		String s[]=d.split(" ");
		
	
		

		
		Map<String, Integer>  hm = new TreeMap<String, Integer>();
		
		for (int i=0; i<s.length; i++) {
		
		if(hm.containsKey(s[i])) { 
			
			int count= hm.get (s[i])+1;
			
			hm.put(s[i], count);
			
			
			
		}
		else {
			hm.put(s[i],1);
				
		   }	
		
		}
		System.out.println(hm);
//		Set<String> keys =hm.keySet();
//		
//		
//		List<String> nList= new ArrayList<String>(keys);
//		
//		
//		String[] y= new String[nList.size()];
//		nList.toArray(y);
//		Arrays.sort(y);
//		
//		for(String b:y) {
//			System.out.println(b);
//		}
		//System.out.println(y.toString());
		
		
		
		
		
		//System.out.println("All words with their repeatation count " + hm);
		
		
		}
	}
	



