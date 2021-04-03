package com.selenium.concepts;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.practice.BaseClass;

public class alertBox extends BaseClass {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
//		WebElement simple_alert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		simple_alert.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//		
//		WebElement confirm_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		confirm_alert.click();
//		Thread.sleep(2000);
//		WebElement confirmalert_box = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//		confirmalert_box.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
		
		WebElement promPt_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
//		promPt_alert.click();
//		
//		Thread.sleep(2000);
//		
		WebElement prompt_Box = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//		prompt_Box.click();
//		
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().sendKeys("ABC");
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		
		toHandlePromptAlert(promPt_alert,prompt_Box, "abc");
		
		
		
	}

}
