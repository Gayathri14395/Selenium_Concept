package com.selenium.concepts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class absXpath 
{
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement search_box = driver.findElement(By.xpath("//input[@type='text']"));
		
		search_box.sendKeys("iphone");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement model1 = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span[3]/div[2]/div[8]/div/span/div/div/div/div[2]/div/div/div/span/a/div/img"));
		
			
	model1.click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	for (String string : windowHandles) {
		
		
		String title = driver.switchTo().window(string).getTitle();
		
		System.out.println("Titles: "+title);		
	}
	
		String goTit = "Amazon.in : iphone";
		
		
		for (String string : windowHandles) {
		
			if(driver.switchTo().window(string).getTitle().equals(goTit))
			{
		driver.switchTo().window(string).navigate().to(goTit);
		break;
	}}

//	WebElement model2 = driver.findElement(By.xpath("(//span[@class='celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results']/div/div/div[2]/div/div/div/span/a/div/img)[9]"));
//model2.click();
//		
//}
//	
	
}}









