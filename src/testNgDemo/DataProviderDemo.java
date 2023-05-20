package testNgDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(dataProvider="testData")
	public void Test3(String a, String b) {
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
	}
	
	@DataProvider (name="testData")
	public String[][] getData() {
		
		String[][]data= {{"Sur","May"}};
		
		
		return data;
		}

}
