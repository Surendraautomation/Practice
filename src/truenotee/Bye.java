package truenotee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bye extends Hello  {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "/Users/surendra/Documents/Grid");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println("Opened");

}}
