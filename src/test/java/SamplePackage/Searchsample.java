package SamplePackage;


//import java.util.HashMap;
import org.openqa.selenium.*;
import org.testng.annotations.*;
//import org.openqa.selenium.chrome.*;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import  org.openqa.selenium.JavascriptExecutor;


public class Searchsample {

	
	private static ChromeDriver driver;
	@Test

	@SuppressWarnings("deprecation")
	//public static void main(String[] args) {
	public static void Searchsamples() {

		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C://Program Files/drivers/chromedriver.exe");
		
         WebDriverManager.chromedriver().setup();
          ChromeDriver driver = new ChromeDriver();
          
         // WebDriverManager.edgedriver().setup();
         // WebDriver driver = new EdgeDriver();
          
       //   WebDriverManager.firefoxdriver().setup();
       //   WebDriver driver = new FirefoxDriver();
          
          JavascriptExecutor js =  (JavascriptExecutor) driver;

             driver.manage().window().maximize();
             
		driver.get("https://www.google.com/");
		
        //    System.out.println("The web page title")


		WebElement  input = driver.findElement(By.id("APjFqb"));
				input.sendKeys("Seleniums automation");
			//	input.sendKeys(Keys.ENTER);
				//String pagesource = driver.getPageSource();
				//System.out.println("Print the page source" +pagesource);
				
				  

		        // Handle page loads using dynamic explicit wait
				//WebDriverWait wait = new WebDriverWait(driver,20);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
             
			//	driver.manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);
                 
		        // Find and capture primary URLs
		        List<WebElement> searchResults = driver.findElements(By.cssSelector("h3 > a"));
		        HashSet<String> primaryURLs = new HashSet<String>();

		        for (WebElement result : searchResults) {
		            String href = result.getAttribute("href");
		            primaryURLs.add(href);
		        }

		        // Print the collected URLs using a for-each loop
		        for (String url : primaryURLs) {
		            System.out.println("Print the URL in console" +url);
		        }
		        
                 js.executeScript("window.scrollBy(0,500)");
                 
 				driver.manage().timeouts().implicitlyWait(15, java.util.concurrent.TimeUnit.SECONDS);


		        // Close the browser
		        driver.quit();
		    } 
		
				
						

	} 


