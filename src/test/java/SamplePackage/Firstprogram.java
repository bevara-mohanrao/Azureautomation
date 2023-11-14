package SamplePackage;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.JavascriptExecutor;





public class Firstprogram {
	@Test

	@SuppressWarnings("deprecation")
	//public static void main(String[] args) {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		// Launch chrome browser with URL and get title and current URL
		
		//System.setProperty("WebDriver.chrom.driver", "C:\\Program Files\\drivers");
		
	     WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en/boards/topic/6977/front-end");
		
		System.out.println("Get the Page title: \n" +driver.getTitle());
		System.out.println("Get the Page current title: \n" +driver.getCurrentUrl());
		
		//close driver
		
		driver.quit();
		
	    driver.manage().timeouts().implicitlyWait(120, java.util.concurrent.TimeUnit.SECONDS);

		
// Launch the firefox browser for google to search keyword and enter.
	    WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.manage().window().maximize();
		        
		driver1.get("https://www.google.com/");

		
		WebElement input = driver1.findElement(By.id("APjFqb"));
		           input.sendKeys("Selenium practice");
		            input.sendKeys("Keys.ENTER");
		          
		           JavascriptExecutor js = (JavascriptExecutor) driver1; 
		     //      js.executeScript("window.scrollBy(0,500);");
		           
		           driver1.getPageSource();
		           
		           System.out.println("Print the page source" +driver1.getPageSource());
		           
		                  
		driver1.quit();
		 
	
		
		

	}

}
