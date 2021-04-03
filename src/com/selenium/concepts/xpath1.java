package com.selenium.concepts;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class xpath1 {
		
		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			
			close.click();
			
			Thread.sleep(2000);
			
			/*WebElement login_btn = driver.findElement(By.xpath("//a[text()='Login']"));
			
			login_btn.click();*/
			
			WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
			
			search.sendKeys("Baby toys");
			
			WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));
			
			enter.click();
		
			/*WebElement email_txt = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			
			email_txt.sendKeys("abc@gmail.com");
			
			WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
			
			pwd.sendKeys("abc");
			
			WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
			
			login.click();*/
			
}
}