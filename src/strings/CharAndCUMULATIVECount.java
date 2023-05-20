package strings;

import java.util.ArrayList;

public class CharAndCUMULATIVECount {
	//static int k =0;
	public static void main(String[] args) {
		
		
		String s="aaaaabbb";
		char a[]=s.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		
		for (int i=0; i<a.length; i++) {
			
			if (!al.contains(a[i])) {
				al.add(a[i]);
				System.out.print(a[i]);
			}
			
			for (int j=0; j<a.length; j++) {
				
				if (al.contains(a[j])) {
					int k =0;
					k++;
					
					System.out.print(k);
					
				}
				break;
			}
		
			
		
				
				
			}
			
		}
		
	
}

