package variables;

public class StaticDemo {
	
	
	static String s="Surendra";
	String a="Mayank";
	String n=" Nilam";
	

	public static void main(String[] args) {
		
		
		String f= "Nilam";
		System.out.println(f);
		StaticDemo d= new StaticDemo();
		System.out.println(d.a);
		
		StaticDemo d1= new StaticDemo();
		System.out.println(d1.a);
		
		System.out.println(s);
		String s="ABC";
		System.out.println(s);
		
		

	}

}
