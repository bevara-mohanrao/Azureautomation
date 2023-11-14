package SamplePackage;

import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Boostrapdropdown {

	@Test

	//public static void main(String[] args) {
	
	public void Boostrapdropdownprogram() {

		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.hdfcbank.com/");
		driver.get("https://themes.getbootstrap.com/product-category/specialty/");
		 
         WebElement categorydrp=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']"));
         categorydrp.click(); 
              
     List<WebElement>categorylist = driver.findElements(By.xpath("//li[@class='nav-item dropdown show']//div[@class='dropdown-menu show']//div[@class='navbar-collapse navbar-top-collapse']//ul[@id='menu-top-menu']//a"));
     
     System.out.println("Print all producttype list items\n" +categorylist.size());
     
     for(WebElement categoryoptions :categorylist )
     {
    	 if(categoryoptions.getText().equals("Application"))
    			 {
    		              
    		            categoryoptions.click();
    		            break;
    		    
    			 }	
     }
      driver.navigate().back();

       //driver.quit();
       
      driver.get("https://www.hdfcbank.com/nri-banking");
      
 	 WebElement producttypedrp=  driver.findElement(By.xpath("//div[@class='drp1']")); 
	 producttypedrp.click();
	 
	 List<WebElement> producttypeopendrp = driver.findElements(By.xpath("//div[@class='drp1']//div[@class='dropdown open']//li"));
	 System.out.println("Print all the product types\n"+producttypeopendrp.size());
	 Bankaccounttype(producttypeopendrp,"Accounts"); 
	 
	/*  for(WebElement prdtype :producttypeopendrp)
	  {
		  if(prdtype.getText().equals("Accounts"))
		  {
			  prdtype.click();
			  break;
		  }
	  } */
	 
 	 WebElement prodictcategorydrp=  driver.findElement(By.xpath("//div[@class='drp2']"));
 	prodictcategorydrp.click();
 	
 	 List<WebElement> productcategorylist = driver.findElements(By.xpath("//div[@class='drp2']//ul[@class='dropdown2 dropdown-menu']//li"));
	 System.out.println("Print all the product types\n"+productcategorylist.size());
	 Bankaccounttype(productcategorylist,"NRI Current Account"); 

	 
	/* for(WebElement prdcat :productcategorylist)
	  {
		  if(prdcat.getText().equals("NRI Savings Account"))
		  {
			  prdcat.click();
			  break;
		  }
	  } */
 	      
	}
	
	public static void Bankaccounttype(List<WebElement> accountype,String selection)
	{
		
      for(WebElement acctype :accountype)
      {
    	  if(acctype.getText().equals(selection))
           {
    		  acctype.click();
    		  break;
           }
      }
	
	}
	
	

}
