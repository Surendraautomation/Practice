import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		
		
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(0,1,2,3));
		
		System.out.println(mirror(list));
	}
	
	
	public static List<Integer> mirror(List<Integer> mr) {
		
		for ( int i=mr.size()-1; i>=0; i--) {
			
			mr.add(mr.get(i));
		
		}
return mr;
}
}