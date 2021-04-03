package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExec {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		WebElement go_Down = driver.findElement(By.xpath("(//div[@class='navFooterColHead'])[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", go_Down);
		
		Thread.sleep(3000);
		
		WebElement leather_bag = driver.findElement(By.xpath("(//img[@class='product-image'])[81]"));
		
		js.executeScript("arguments[0].scrollIntoView();", leather_bag);
		
	
}
}