package strings;

public class CountVowels {
	
	
	public static void main(String[] args) {
		String s = "Mallyalam";
	  
	int count =0;

	for(int i=0; i<s.length(); i++){

	if(s.charAt(i)== 'a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){

	count = count +1;
	System.out.print(s.charAt(i)+ " ");

	}

	
	}System.out.println(count);}

	}


