package SamplePackage;


import java.time.Duration;
import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

public class Datepicker {

	@Test

	public static void  main (String[] args) {
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		String year ="2023";
		String month ="December";
		String date = "9";
		
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
		while(true) {
			
		String text = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		              
		   String arr[] = text.split(" ");
		   String  mm = arr[0];
		   String yy = arr[1];
		   
		   
		  if((mm.equalsIgnoreCase("month") && yy.equals("year")))
		   break;
		  else
		  {
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			  System.out.println("Selected next month");
			  break;
		  }	  
		  
	}
		  List<WebElement> ddvalue = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//tr/td"));
              for(WebElement ddelement:ddvalue)  
              {
            	  
            	  String ddcompare = ddelement.getText();
            	  
            	  if(ddcompare.equals(date))
            		  
            	  {
            		  ddelement.click();
            		  break;
            	  }
              }
		        
		// Select date picker different style with dropdown types.
              
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		
		
	   Select mmonth = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
	        mmonth.selectByVisibleText("Nov");
	        
	        
		Select yyear = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		
		 yyear.selectByVisibleText("2005");
		 
		 
		 List<WebElement> ddate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		 
		 for(WebElement ddval:ddate)
		 {
			 String datepick = ddval.getText();
			 
			 if(datepick.equals(date))
			 {
				 ddval.click();
				 break;
			 }
			 
		 }
              		
		
		
		
	}

}
