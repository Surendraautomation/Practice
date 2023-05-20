package strings;

public class Abc {

	public static void main(String[] args) {
		String s="Surendra";
		
		String a="Suryavanshi";
		
		s.concat("Suryavanshi");
		System.out.println(s);
		
		s.concat(a);
		
		
		System.out.println(s);
		
		System.out.println(s.concat(a));
		System.out.println(s.concat("Suryavanshi")+    "\t" + s);
		
	}

}
