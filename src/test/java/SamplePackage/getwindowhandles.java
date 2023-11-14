package SamplePackage;

import java.util.List;
import java.util.Set;
import org.testng.annotations.*;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;


public class getwindowhandles {

	@Test

	//public static void main(String[] args) throws InterruptedException {
	public static void getwindowhandle() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(4000);
		// String ParentwindowID = driver.getWindowHandle();
		// System.out.println("Get the ParentWindow ID "+ParentwindowID);
		 
		 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		 
		 	//System.out.println("print the windowsid\n"+driver.getWindowHandles());
		 
		  Set<String> Windowvalue= driver.getWindowHandles();
		
		// System.out.println("Get the ParentWindow ID "+WindowIDS);
		 
	/*	 //Iterator process
		  java.util.Iterator<String> itr = Windowvalue.iterator();
           		 
		 String ParentwindowID = itr.next();
		 String childwindowID = itr.next();
		 
	     System.out.println("Get the ParentWindow ID "+ParentwindowID);
	     System.out.println("Get the ParentWindow ID "+childwindowID);
	     
	     //Arraylist method way to get Window ID
	     
         List<String> Windowlist = new ArrayList(Windowvalue);
         String ParentwindowIDA = Windowlist.get(0);
         String childwindowIDA = Windowlist.get(1);
         
    	 
	     System.out.println("Get the ParentWindow ID "+ParentwindowIDA);
	     System.out.println("Get the ParentWindow ID "+childwindowIDA); 
	     
	
	     driver.switchTo().window(ParentwindowID);
	     System.out.println("Print the Parentwindow Title "+driver.getTitle());
	     
	     driver.switchTo().window(childwindowID);
	     System.out.println("Print the Childwindow Title "+driver.getTitle()); */
	     
	     
	     for(String wndID:Windowvalue)
	     {
	    	   String title = driver.switchTo().window(wndID).getTitle();
	  	     System.out.println("Print the  Title "+title);
	  	     
	  	     if(title.contains("OrangeHRM HR Software | OrangeHRM"))
	  	     {
	  	    	 driver.close();
	  	     }

	     }
	  

	
	}

}
