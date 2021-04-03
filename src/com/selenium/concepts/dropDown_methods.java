package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_methods {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement select_dd = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		select_dd.click();
		
		Select s = new Select(select_dd);
		
		s.selectByIndex(1);
		
		select_dd.click();
		
		Thread.sleep(2000);
		
WebElement select_dd1 = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		select_dd1.click();
		
		Select s2 = new Select(select_dd1);
					
		s2.selectByValue("Tuesday");
		
		select_dd1.click();
		
		Thread.sleep(2000);
	
WebElement select_dd2 = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		select_dd2.click();
		
		Select s3 = new Select(select_dd1);
		
		
		s3.selectByVisibleText("Thursday");
		
		select_dd2.click();
	
		
		
		
		
		
		
	}
	

}
