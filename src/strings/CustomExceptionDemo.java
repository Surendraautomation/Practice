package strings;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=2;
		
//int b= a/0;

		try {
			 int b= a/0;
			 
			 System.out.println(b);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
		finally {
			System.out.println("Hello");
		}
	}

}
