package testNgDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class Test1 {
	
@BeforeSuite	
public void name() {
	
	//System.out.println("@BeforeSuite");
}




@Test(groups="Sanity")
public void Test() throws IOException {
	
	
	System.out.println("From Another Class");
	
//	 Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
//				+ "//src//testNgDemo//GlobalData.properties");
//		prop.load(fis);
//		
//		//String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
//		String browserName=prop.getProperty("browser");
//
//		if (browserName.contains("chrome")) {
			
			
//	System.setProperty("webdriver.chrome.driver", "/Users/surendra/Documents/chromedriver");
//	 
//    ChromeDriver driver = new ChromeDriver();
//	driver.get("https://amazon.com");
//	driver.manage().window().maximize();
//	System.out.println(driver.getTitle());
//	driver.close();
}

@AfterSuite	
public void name1() {
	
	//System.out.println("@AfterSuite Surendra");
}

	}


