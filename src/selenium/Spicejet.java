package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class Spicejet {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException, IOException {
		String path=System.getProperty("user.dir")
				+ "//src//testNgDemo//GlobalData.properties";
	// File file=new File (path);
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		//String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
		String browserName=prop.getProperty("browser");

		if (browserName.contains("firefox")) {
	
	System.setProperty("webdriver.firefox.driver", "/Users/surendra/Documents/Grid");
	 
	 driver= new FirefoxDriver();
	driver.get("https://amazon.com");
	System.out.println(driver.getPageSource());
	System.out.println("Opened");
	driver.close();
	
		}
		else  {
			
	System.setProperty("webdriver.chrome.driver", "/Users/surendra/Documents/chromedriver");
	 
     driver = new ChromeDriver();
	driver.get("https://www.spicejet.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	currencyList();
	getWindowCount();

	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,600)");
	
		}
		
		}
		
		public static void getWindowCount()
		{		
			Actions act=new Actions(driver);
			Set<String> handle= driver.getWindowHandles();
		int i = 0;
		for(String f : handle)
		{
		driver.switchTo().window(f);
		i = i++;
		}
		System.out.println(i);
		
		
		}
		
		
		public static void currencyList() throws InterruptedException {
			driver.findElement(By.xpath("//div[@style='flex: 0.3 1 0%; margin-left: 10px;']/div")).click();
			
			List<WebElement> currencyList=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-h3f8nf r-u8s1d r-8fdsdq']/div/div/div"));
			
			
			for( int i=0; i<currencyList.size(); i++) {
				System.out.println(currencyList.get(i).getText());
				//Thread.sleep(2000);
				if(currencyList.get(i).getText().equalsIgnoreCase("KWD")) {
					//Thread.sleep(2000);
				currencyList.get(i).click();
				//Thread.sleep(2000);
				//System.out.println(currencyList.get(i).getText());
				
		}

				//div[@class='css-1dbjc4n r-1awozwy r-1777fci r-1wgy4ey']
	}
			
			
			
			


}




}
