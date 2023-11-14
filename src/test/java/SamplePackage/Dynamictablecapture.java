package SamplePackage;

import java.time.Duration;
import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

public class Dynamictablecapture {

	@Test

	//public static void main(String[] args) {
		public void Dynamictablecaptures() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		driver.findElement(By.id("menu-sale")).click();
		
	    driver.findElement(By.xpath("//*[@id=\"collapse-4\"]/li[1]")).click();
	    
	    
	    String paginationtext = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
	    System.out.println("Print the pagination text " +paginationtext);    //1 to 10 of 82 (9 Pages)
	    
	               
	      // int total_pages= Integer.valueOf(paginationtext.substring(paginationtext.indexOf("1 to 10 of 82 (")+1, paginationtext.indexOf(")")-1));
	       
		  //  System.out.println("Total number of pages " +total_pages);
	    
	    
	           
	     
	       for(int row=1;row< 8; row++)
	       {
	    	   
	    	     
	           WebElement activepage = driver.findElement(By.xpath("//ul[@class='pagination']//li/span"));
	           System.out.println("Click on active 1st page "+activepage.getText());
	         //  activepage.click();
	     
	        
	           
	               
	           int totalrows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
	           System.out.println("Total number of pages "+totalrows);
	           
	           String pgno = Integer.toString(row+1);


	        // driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pgno+"']")).click();
	            
	           
	       WebElement orderid =  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[position()="+row+"]/td[position()=2]"));
		   WebElement store =  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[position()="+row+"]/td[position()=3]"));
		   WebElement customer =  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[position()="+row+"]/td[position()=4]"));

         /* System.out.println("Get the Order Id "+orderid.getText());
           System.out.println("Print the store name "+store.getText());
           System.out.println("Print the customer name "+customer.getText()); */
		   
	          System.out.println(orderid.getText()+" "+store.getText()+"  "+customer.getText());



			// System.out.println("Get text value " +element.getText());
         //div[@class='tooltip-arrow']
	        		
         //div[@class='tooltip-arrow']
	       }
	       
	         driver.quit();
	    
	    
				
	}

	
}
