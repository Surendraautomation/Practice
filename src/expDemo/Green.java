package expDemo;

public class Green {

	public static void main(String[] args) {
		System.out.println("Hi");
		String s=null;
		
		
		try {
			System.out.println("Hello");
			int i=8/0;
			s.length();
			
			
		}
		
		
		
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println("Something went Wrong" + e.getMessage());
	}
		
finally {
	System.out.println("Finally Done");
}
	}

}
