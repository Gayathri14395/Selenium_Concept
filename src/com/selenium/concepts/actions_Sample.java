package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_Sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement Dressess_Ele = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(Dressess_Ele).build().perform();
		
		WebElement SummerDresses = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[2]"));
		//a.moveToElement(SummerDresses).build().perform();
		SummerDresses.click();
		
		
		
		
		
	}

}
