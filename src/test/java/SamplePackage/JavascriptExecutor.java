package SamplePackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class JavascriptExecutor {

	@Test

	//public static void main(String[] args) throws InterruptedException, IOException {
	public static void JavascriptExecutors() throws InterruptedException, IOException {


WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com");
		
		//draw border of logo
	/*	WebElement logimage = driver.findElement(By.xpath("//img[@title='Your Store']"));
		
		JSUtilpackage.JsDrawborder(logimage, driver);
		Thread.sleep(2000);

		//Screenshot capture full screen
        TakesScreenshot fullscreen = (TakesScreenshot) driver;
        File src = fullscreen.getScreenshotAs(OutputType.FILE);
        File dest = new File(".\\Screenshots\\opencart.png");
        
        FileUtils.copyFile(src, dest); 
		
		
		Thread.sleep(1000);
		
		//get the title of text
		
		String title = JSUtilpackage.JsgetTitle(driver);
		System.out.println("Print the title" +title);
		Thread.sleep(2000);

		//get the click action
	   WebElement clickenvent=	driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
		JSUtilpackage.JseventClick(clickenvent, driver);
		
       //get the Alert popup window.
		Thread.sleep(2000); */

		JSUtilpackage.JseventAlert(driver,"This is my program Alert ");
		
		Thread.sleep(4000);
		
		// refreshing browser
		
			JSUtilpackage.JsrefreshPage(driver);
   
		// Move scroll down
			Thread.sleep(5000);
			JSUtilpackage.JsScrolldown(driver);
			
	    // Move scroll down
		   Thread.sleep(5000);
		   JSUtilpackage.JsScrollup(driver);
		//Zoom the screen size
		 //  Thread.sleep(5000);
		//  JSUtilpackage.Jszoomstyle(driver);
	
		  WebElement logimage = driver.findElement(By.xpath("//img[@title='Your Store']"));
		   Thread.sleep(5000);

		  JSUtilpackage.Jsbackgroundcolor(logimage, driver);

		driver.quit();
		
		
		
	}

}
