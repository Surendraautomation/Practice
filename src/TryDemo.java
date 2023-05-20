
public class TryDemo {

	public static void main(String[] args) {
		
		try {
			int i=9/0;
		}
catch (Exception e){
	
	System.out.println(e.getMessage());
	
}
	}

}
