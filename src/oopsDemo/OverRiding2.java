package oopsDemo;

public class OverRiding2 extends OverRiding1 {
	
	
	
	public static void m1() {
		System.out.println("Child Dominates");
	}

	public static void main(String[] args) {
		OverRiding2 o=new OverRiding2();
		o.m1();
	}

}
