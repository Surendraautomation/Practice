package arrays;

public class DuplicateWordFromStringByForLoop {

	public static void main(String[] args) {
		
		String s = "Big black bug bit a big black dog on his big black nose nose nose";    
      
		int k;    
            
        
        s = s.toLowerCase();    
            
           
        String a[] = s.split(" ");    
            
        System.out.println("Duplicate words in a given string : ");  
        
        for(int i = 0; i < a.length; i++) {    
            k = 1;    
            for(int j = i+1; j < a.length; j++) {    
                if((a[i]).equals(a[j])) {    
                    k++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    a[j] = "0";    
                }    
            }    
                
            //Displays the duplicate word if count is greater than 1    
            if(k > 1 && (a[i]!="0"))    
                System.out.println(a[i]);    
        }    
	}
         
}
