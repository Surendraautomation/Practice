package testNgDemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	
	
	@BeforeSuite
	public void test1() {
		//System.out.println("@BeforeSuite");
		
	}
	
	@BeforeTest
	public void test2() {
		//System.out.println("@BeforeTest");
		
	}
	@Parameters("CandidateName")
	@BeforeClass
	public void test3(String s) {
		//System.out.println("@BeforeClass");
		System.out.println(s);
		
	}
	@BeforeMethod
	public void test4() {
		
		
		

		
	}
	
	@Test(groups="Sanity")
	public void Test1() {
		
		System.out.println("Test 1");
		}
	
	
	@Test
	public void Test2() {
		
		
		
		System.out.println("Test 2");
		}
	@Test(dataProvider="testData")
	public void Test3(String a, String b) {
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		System.out.println("B");
	}
	
	@DataProvider(name="testData")
	public String[][] Test4() {
		
		String[][]data= {{"Sur"},{"May"}};
		System.out.println("A");
		return data;
		}
	
	@Test
	public void Test5() {
		
		
		System.out.println("Test 5");
		}
	@Test(dependsOnMethods="test7")
	public void Test6() {
			
			
			System.out.println("Test 6");
			}
		
	
	@AfterMethod
	public void test8() {
		//driver.close();
		//System.out.println("@AfterMethod");
		

}
	@AfterClass
	public void test7() {
		//System.out.println("@AfterClass");
		
	}
	@AfterTest
	public void test6() {
		//System.out.println("@AfterTest");
		
	}
	@AfterSuite
	public void test5() {
		//System.out.println("@AfterSuite Mayank");
		
	}
	
	
	
	
}