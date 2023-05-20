package strings;

public class ReplaceChar {

	public static void main(String[] args) {
		//String s="Surendra";
		
		
		StringBuffer sb = new StringBuffer("Surendra");
		sb.replace(0, 2, "d");
		//sb.replace(0, 5, "u");
		
		System.out.println(sb);

	}

}
