package exceptionDemo;

public class ExceptionEx {

	
	public static void main(String[] args) {
		
		try {
			throw new TestException("Text");
		}
		catch(TestException t) {
			System.out.println(t.getMessage());
		}

	}

}
