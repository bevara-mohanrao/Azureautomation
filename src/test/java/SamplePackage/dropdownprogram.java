package SamplePackage;
import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dropdownprogram {


	static WebDriver driver;
	@Test

	//public static void main(String[] args) {
		
	public void dropdownprograms() {
	
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/register");
		
		//aproach 1 to use find element of dropgown and use Select constructor with selecyby types.
		
		driver.manage().window().maximize();
		
	   WebElement countrydrpdown = driver.findElement(By.id("CountryId"));
		
		Select countrydrop = new Select(countrydrpdown);
		
		countrydrop.selectByVisibleText("Canada");
		countrydrop.selectByValue("250");
        countrydrop.selectByIndex(15);  
		
		
        //Approach 2  for long process code which belogns to only one dropdown
        
        WebElement comapnydrpdown =  driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
         

         Select companydd = new Select(comapnydrpdown);
         
         System.out.println("Get the text value" +comapnydrpdown.getText());
         
       List<WebElement> alloptions= companydd.getOptions();
       
       for(WebElement options :alloptions )
       {
    	   if(options.getText().equals("Is a merchant who sells online"))
    	   {
    	      options.click();
    	      break;
    	      
    	   }  
       }
       
       //Aproach 3 model with custom function and reusable code for multiple dropdowns.
       
       
      WebElement companyroledrp = driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']"));
      dropdownprogram(companyroledrp,"Technical developer");
      WebElement companystoredrp= driver.findElement(By.xpath("//select[@id='Details_KindOfExistingStoreId']"));
      dropdownprogram(companystoredrp,"No");
      WebElement companymodeldrp= driver.findElement(By.xpath("//select[@id='Details_CompanyBusinessModelId']"));
      dropdownprogram(companymodeldrp,"C2C"); 
      
      
      //Loop run of dropdown to seleect all values
      
	   WebElement countrydrpdownloop = driver.findElement(By.id("CountryId"));
	   
	   Select cdropdownloop = new Select(countrydrpdownloop);
	   
	   for(int i=1;i<20;i++)
	   {
		   cdropdownloop.selectByIndex(i);
		  // System.out.println("Pring all select countries\n" +countrydrpdownloop.getText());
	   }
	     

     
	}

public static void dropdownprogram(WebElement elemnt,String opt)
{
	
	Select dropdownoptions = new Select(elemnt);
	 List<WebElement> alloptions= dropdownoptions.getOptions();
     
     for(WebElement options :alloptions )
     {
  	   if(options.getText().equals(opt))
  	   {
  	      options.click();
  	      break;
  	      
  	   }  
     }
}


}


