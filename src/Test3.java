import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) {
		String s="Surendra";
		char a[]=s.toCharArray();
		
		//output count of chars
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (Character b:a ) {
			if (hm.containsKey(b)) {
				hm.put(b, hm.get(b)+1);
			} else {
				hm.put(b, 1);
			}
		}
		
		System.out.println("Count of characters are as " );
		System.out.println(hm );
	}

}
