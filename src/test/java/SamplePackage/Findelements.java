package SamplePackage;
import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;


public class Findelements {

	@Test

	//public static void main(String[] args) {
	public static void Findelement() {

		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/register");
		
	     WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
	     firstname.sendKeys("First name");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("Last name");
	  
         System.out.println("Check the firstname location" +firstname.getLocation());
         System.out.println("Check the lastname location" +lastname.getLocation());
         
         lastname.clear();
         firstname.clear();
         
         firstname.sendKeys("New First Name");
         lastname.sendKeys("NEW Last Name");

         WebElement detailsid = driver.findElement(By.id("Details_CompanyIndustryId"));
         System.out.println("Get the attribute of class\n" +firstname.getAttribute("data-val-required"));
         System.out.println("Get the gettext value\n" +detailsid.getText());
         
		
	//	 List<WebElement> minputfields = driver.findElements(By.xpath("//input[@id='FirstName']"));
		//  System.out.println("Check no of elements " +minputfields.size());
		    
		 // List<WebElement> multifields = driver.findElements(By.xpath("//div[@class='register-forms']//div[@class='inputs']"));
		  List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));

		  System.out.println("Print no of elements found " +links.size());
		  
		  
		  for(WebElement list: links)
		  {
			 
			  System.out.println("Print the list of all elemtns\n" + list.getText());
			  
		/*	    for(int i=0; i< links.size();i++)
			    {
			    	
			   WebElement str=  driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
				   
				   str.click();
				  
				    driver.navigate().back();
				    
			    } */
	
		  } 
		 
		//driver.quit();
		
	}

}
