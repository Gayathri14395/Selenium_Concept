package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.practice.BaseClass;

public class frames_Sample extends BaseClass{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement multi_Frame = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multi_Frame.click();
		
		WebElement outer_Frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outer_Frame);	
		
		WebElement inner_Frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		//driver.switchTo().frame(inner_Frame);
		toSwitchToFrame(inner_Frame);
		
		
		WebElement text_Box = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
				
		text_Box.click();
		text_Box.sendKeys("ABC");
		
		
		
		
		
	}
	
}
