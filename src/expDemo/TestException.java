package expDemo;

public class TestException {

	public static void main(String[] args) {
		try {
			throw new CustomException("Invlid Value");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
