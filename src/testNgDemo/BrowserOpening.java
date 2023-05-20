package testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpening {

	 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/surendra/Documents/chromedriver");
		

       
       WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		//System.out.println(driver.getPageSource());
		System.out.println("Opened");
		driver.close();

	}

}
