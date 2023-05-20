
public class Test5 {

	public static void main(String[] args) {
		String s= "My Name is Surendra";
		String[]a=s.split(" ");
		
		//output Surendra is name my
		String r= " ";
		
		for (int i=a.length-1; i>=0; i--) {
			r= r + a[i];
			
			
			
		}
		System.out.println(" " + r);
	}

}
