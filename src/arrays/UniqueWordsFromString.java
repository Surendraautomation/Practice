package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordsFromString {

	public static void main(String[] args) {
		String str = "apple banana banana mango grape lichi mango apple grape";
        
        String[] b = str.split(" ");
        
        
        
        
        Set<String> d=new HashSet<String>();
        for(int i=0; i<b.length; i++) {
        	d.add(b[i]);
        }
        
        System.out.println(d);
        
         
//        ArrayList<String> uniqueWords = new ArrayList<String>(Arrays.asList(words));
//         
//        for(int i=1; i<uniqueWords.size(); i++) {
//            for(int j=0;j<i;j++) {
//                if(uniqueWords.get(i).equals(uniqueWords.get(j))) {
//                    uniqueWords.remove(i);
//                    i--;
//                    break;
//                }
//            }
//        }
//         
//        for(String s: uniqueWords) {
//            System.out.println(s);
//        }

	}

}
