package oopsDemo;

public class OverLoading {
	
	
	public void a(String a) {
		System.out.println(a);
	}
	
	public void a(String b, int a) {
		System.out.println(b + a);
	}
	
	public void a(int a) {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		
		
		OverLoading overLoading= new OverLoading();
		overLoading.a("Hello");
		overLoading.a("Bye", 123);
	}

}
