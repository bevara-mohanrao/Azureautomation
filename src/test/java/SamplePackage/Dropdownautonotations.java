package SamplePackage;

import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownautonotations {

	@Test

	@SuppressWarnings("deprecation")
	//public static void main(String[] args) throws InterruptedException {
	
	public  void Dropdownautonotation() throws InterruptedException {

		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement Searchfield = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		           Searchfield.sendKeys("Java Tutorial");
		          // Searchfield.sendKeys(Keys.ENTER);
		           
		
		List<WebElement>searchkey = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		
		//driver.manage().timeouts().implicitlyWait(60, java.util.concurrent.TimeUnit.SECONDS);
		//Thread.sleep(5000);

		System.out.println("Count the list of searchs\n"+searchkey.size());
		
		driver.get("https://www.bing.com/");
		
	    driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("Java Training");
		Thread.sleep(3000);
		
	     List<WebElement>bingsearch = driver.findElements(By.xpath("//li[@role='option']//div[@class='sa_tm']/span"));
	     System.out.println("Cout list of bing search words\n"+bingsearch.size());
	     
	     for(WebElement bingoptions:bingsearch)
	     {
	    	 if(bingoptions.getText().equals("java training"));
	    	 {
	    		 bingoptions.click();
	    		 break;
	    	 }
	     }
	     
	     //Autocomplete feature for search
	     driver.get("https://www.twoplugs.com/newsearchserviceneed");
	     
	   WebElement  Searchmap = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	   Searchmap.clear();
	   
	   Searchmap.sendKeys("Italy");
	   
	   Thread.sleep(5000);
	   
         String inputtext;
         
         
         
         /*    do
         {
        // Searchmap.sendKeys(Keys.ARROW_DOWN);
        	 inputtext=Searchmap.getAttribute("value");
        	 if(inputtext.equals("Italy, NY, USA"))
             {
        		 Searchmap.sendKeys(Keys.ENTER);
        		 break;
      
             } 
        	 
         } 
         while(!inputtext.isEmpty());
         
       driver.findElement(By.xpath("//div[@class='row filters-row long-select-new']")).click();
    		   
  	   Thread.sleep(10000);  */

      
		           
		       driver.quit();		           
	
	}

}
