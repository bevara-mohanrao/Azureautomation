package SamplePackage;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownsorting {

	@Test

	//public static void main(String[] args) {
	public void Dropdownsortings() {
		
		// TODO Auto-generated method stub
		
      WebDriverManager.chromedriver().setup();
      
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.twoplugs.com/newsearchserviceneed");
      
      WebElement drpdownitems = driver.findElement(By.xpath("//div[contains(text(),'All')]"));
      drpdownitems.click();
      
      WebElement drpdownlist= driver.findElement(By.xpath("//select[@name='category_id']"));
      
       Select drplist = new Select(drpdownlist);
       
       
        List<WebElement> options=  drplist.getOptions();
        System.out.println("Print the list of values\n"+options.size());

        
        ArrayList orglist = new ArrayList();
        ArrayList templist = new ArrayList();
        
        for(WebElement optionlist:options)
        {
        	orglist.add(optionlist.getText());
        	templist.add(optionlist.getText());
        }
        
        System.out.println("Original list values\n "+orglist);
        System.out.println("Temporary list values\n "+templist);
        
        Collections.sort(templist);
        
        System.out.println("Original list values\n "+orglist);
        System.out.println("Temporary list values new set\n "+templist);
        
        
        if(orglist.equals(templist))
       {
        	
         System.out.println("All items are sorted");	
        }
        
        else
        	
        {
        	
            System.out.println("All items are unsorted");	
           }
    
        driver.quit();
    
		
	}

}
