package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webEleMethods {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
		WebElement ok_btn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		
		ok_btn.click();
		
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		from.sendKeys("chennai");
		
		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	
		to.sendKeys("madurai");
		
		WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		date.click();
		
		Thread.sleep(3000);
		
	date.clear();
	
	Thread.sleep(3000);
	
		
		date.sendKeys("26/02/2021");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		
		submit.click();
	}

}
