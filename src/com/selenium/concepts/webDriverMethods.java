package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.navigate().back();
	
	driver.get("https://www.facebook.com/");
	
	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("The current URL is " +currentUrl);
	
	String title = driver.getTitle();
	System.out.println("Title of the webpage is " +title);
	
	
	}
}
