package expDemo;

public class CustomException extends Exception {
	
	String str;
	
	CustomException(String str){
		this.str=str;
		
		
	}
	  public String toString() {
		  
		  return str;
		  
	  }

	public static void main(String[] args) {
		
		
		

	}

}
