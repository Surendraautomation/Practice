package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MirrorElements {

	public static void main(String[] args) {
		
		
		 ArrayList<Integer> list = new ArrayList(Arrays.asList(1, 2, 3));
		    System.out.println(mirror(list));
		}

		public static ArrayList<Integer> mirror(ArrayList<Integer> mr) {
		    for (int i = mr.size() - 1; i >= 0; i--) {
		        mr.add(mr.get(i));
		    }

		    return mr;
		}

	}

