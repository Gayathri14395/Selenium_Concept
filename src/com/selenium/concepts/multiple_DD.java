package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_DD
  
  {
	  public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\Selenium_Concept\\Driver\\chromedriver.exe");
	
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		  
		  driver.manage().window().maximize();
		  
		  WebElement multiple_box = driver.findElement(By.xpath("//select[@id='multi-select']"));
		  
		  Select s = new Select(multiple_box);
		  
		  List<WebElement> options = s.getOptions();
		  
		  for (WebElement alloptions : options) {
			  
			  String text = alloptions.getText();
			  System.out.println("All options: ");
			  System.out.println(text);
			
		}
		  
		  int size = options.size();
		  
		  for (int i = 0; i < size-1; i++) {
			if(i==1 || i==2 || i==3)
				s.selectByIndex(i);
		}
		  List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		 
		  for (int i = 0; i < allSelectedOptions.size(); i++) {
			  
			  String selected_op = allSelectedOptions.get(i).getText();
			  System.out.println("Selected options are: ");
			  System.out.println(selected_op);
			
		}
	  }
	  
}
