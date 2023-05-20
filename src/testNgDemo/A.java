package testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "/Users/surendra/Documents/geckodriver");
		 
		 WebDriver driver= new FirefoxDriver();
		driver.get("https://amazon.com");
		//System.out.println(driver.getPageSource());
		System.out.println("Opened");
		driver.close();

	}

}
