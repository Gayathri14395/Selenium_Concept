package com.selenium.concepts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandling {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement X_btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		WebElement topOffers = driver.findElement(By.xpath("(//div[text()='Top Offers'])[1]"));
		
		WebElement grocery = driver.findElement(By.xpath("(//div[text()='Grocery'])[1]"));
		
		WebElement mobiles = driver.findElement(By.xpath("(//div[text()='Mobiles'])[1]"));
		
		WebElement travel = driver.findElement(By.xpath("(//div[text()='Travel'])[1]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(X_btn).click();
		
		a.moveToElement(topOffers).contextClick().build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		
		a.moveToElement(grocery).contextClick().build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		
		a.moveToElement(mobiles).contextClick().build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		
		a.moveToElement(travel).contextClick().build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		
		Set<String> Titles = driver.getWindowHandles();
		
		for (String id : Titles) {
			
			String title = driver.switchTo().window(id).getTitle();
			
			System.out.println(title);
					
		}
	
		String gotoTit = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		for (String id : Titles) {
			
			if(driver.switchTo().window(id).getTitle().equals(gotoTit))
					{
			driver.navigate().to("https://www.amazon.in/");
			String tit = driver.getWindowHandle();
			System.out.println("Newly launched URL title is "+tit);
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current URL is "+currentUrl);
			
			break;
		}
		

		
		
		
	}
	
}}
