package strings;

import java.util.Arrays;

public class AngramStrings {
	
	
	public static boolean isAnagram(String s1, String s2) {
		
		String str1=s1.replaceAll("\\s", "");
		String str2=s2.replaceAll("\\s", "");
		
		
		if(str1.length()!= str2.length()) {
			return false;
		}
		else {
			char[]a1=str1.toLowerCase().toCharArray();
			char []a2=str2.toLowerCase().toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
		return Arrays.equals(a1, a2);
			}
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("Act", "Cat"));
		System.out.println(isAnagram("Hello", "Yello"));
		System.out.println(isAnagram("Act", "Cat     "));
		System.out.println(isAnagram("enjoy", "JOY"));

	}

}
