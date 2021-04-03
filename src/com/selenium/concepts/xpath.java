package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
	
		WebElement email_txt = driver.findElement(By.xpath("//input[@name='username']"));
		
		email_txt.sendKeys("abc@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		
		pwd.sendKeys("abcdefgh");
		
		WebElement login_btn = driver.findElement(By.xpath("//button[contains(@class='sqd0p')]"));
		
		login_btn.click();
		
		
		
		
		
	}

}
