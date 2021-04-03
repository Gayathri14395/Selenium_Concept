package com.selenium.concepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class webElementMethods {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		signin.click();
		
		
		WebElement email = driver.findElement(By.id("ap_email"));
		
		email.sendKeys("abc@gmail.com");
		
		WebElement cont_btn = driver.findElement(By.id("continue"));
		
		cont_btn.click();
		
		WebElement pwd = driver.findElement(By.id("ap_password"));
		
		pwd.sendKeys("abc");
		
		WebElement signin_btn = driver.findElement(By.id("signInSubmit"));
		
		signin_btn.click();
		
		Thread.sleep(2000);
		
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    
	    File destination = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Screenshot\\snap.png");
	    
	    FileUtils.copyFile(source, destination);
	    
	    driver.close();
	    
	    
	    
		
		
		
}
}