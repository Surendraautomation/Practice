package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	
	 static WebDriver driver;


	public static void main(String[] args) throws IOException {
		
			
	System.setProperty("webdriver.chrome.driver", "/Users/surendra/Documents/chromedriver");
	 
     driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	
	
	 //checking the links fetched.
    for(int i=0;i<links.size();i++)
    {
        WebElement E1= links.get(i);
        String url= E1.getAttribute("href");
        verifyLinks(url);
    }
    

//	for (WebElement link:links) {
//		String url=link.getAttribute("href");
//		SoftAssert sa=new SoftAssert();
//		HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();	
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int responseCode=conn.getResponseCode();
//		System.out.println(responseCode);
//		sa.assertAll();
		driver.close();

	}
		public static void verifyLinks(String linkUrl)
	    {
	        try
	        {
	            URL url = new URL(linkUrl);

	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()>=400)
	            {
	            	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
	            }    
	       
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
	            }
	        }catch (Exception e) {	
	
	
	}
		
				
				
				
	}}
