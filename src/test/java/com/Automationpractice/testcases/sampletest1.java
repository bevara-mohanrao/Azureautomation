package com.Automationpractice.testcases;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class sampletest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://Program Files/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		//driver.get("https://www.facebook.com/signup/");
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//driver.findElement(By.name("username")).sendKeys("mercury");
		//driver.findElement(By.name("password")).sendKeys("password");
		
		//driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
		
		
		
		
		

	}

}
