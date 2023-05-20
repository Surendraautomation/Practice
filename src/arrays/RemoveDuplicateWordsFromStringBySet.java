package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromStringBySet {

	public static void main(String[] args) {
String d= "SurendrasurendraSurendraMayankMayank";

	char s[]=d.toCharArray()	;
	//	String s[]=d.split(" ");
		
		Set <Character> b= new HashSet<Character>();
		for(int i=0; i<s.length; i++) {
			b.add(s[i]);
		}
System.out.print(b);

System.out.println(b.toArray().toString());
System.out.println(b);
	}

}
