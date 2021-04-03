package com.selenium.concepts;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class taskDiff {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement enter_text = driver.findElement(By.xpath("//input[@type='text']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(enter_text);
		
		Thread.sleep(2000);
		
		enter_text.sendKeys("Difference between Action and Actions in Selenium");
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		WebElement toolsqa = driver.findElement(By.xpath("(//div[@class='yuRUbf'])[1]"));
		
		toolsqa.click();
		
		WebElement actionsClassExp = driver.findElement(By.xpath("(//div[@class='wpb_wrapper'])[3]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",actionsClassExp);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com/");
		
			driver.manage().window().maximize();
		
		WebElement enter_text1 = driver.findElement(By.xpath("//input[@type='text']"));
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(enter_text1);
		
		Thread.sleep(2000);
		
		enter_text1.sendKeys("What is AWT Exception in Selenium?");
		//Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		
		
		
				
		
		
		
		
		
	
		
		
		
		
	}

}
