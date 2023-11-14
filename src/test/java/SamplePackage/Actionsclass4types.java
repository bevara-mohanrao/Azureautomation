package SamplePackage;
import java.time.Duration;
import java.util.List;
import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Actionsclass4types {

	@Test
	
	
	//public static void main(String[] args) throws InterruptedException {
		
    public  void actionclasstypes() throws InterruptedException {

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html\r\n");

	WebElement rightclick =	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
	Actions act1= new Actions(driver);
	
	       act1.contextClick(rightclick).perform();
	       
	    WebElement copy=   driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
	   //  copy.click();
	     
        
        
	     //Second action for double click one.
	     
	     driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	     
	     driver.switchTo().frame("iframeResult");
	   WebElement inputtext =  driver.findElement(By.xpath("//input[@id='field1']"));
	   inputtext.clear();
	   inputtext.sendKeys("Automation Practice");
	   
	   
	    WebElement doubeclick=  driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	   
	    
	    act1.doubleClick(doubeclick).perform();
	    
	       
	       // Third action for drag and drop movement.
	    
	    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    
	  //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_0']")));
	    
	    WebElement originpath = driver.findElement(By.xpath("//div[@id='capitals']//div[@id='box3']"));
	    
	    WebElement Destpath = driver.findElement(By.xpath("//div[@id='countries']//div[@id='box103']"));
	    
	    act1.dragAndDrop(originpath, Destpath).perform();
	    
 
	    
	    // Fourth method for drag and drop to recycle with iframe
	    
	    Thread.sleep(3000);
	    
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
	    
	   WebElement firstele1 =  driver.findElement(By.xpath("//li[1]"));
	   WebElement firstele2 =  driver.findElement(By.xpath("//li[3]"));

       WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	   
       
       act1.dragAndDrop(firstele1, trash).click().perform();
       act1.dragAndDrop(firstele2, trash).click().perform();

	    
       //final action for mouse hoover action
       Thread.sleep(3000);
       
       driver.get("https://demo.opencart.com/");
       
       WebElement component =   driver.findElement(By.xpath("//a[normalize-space()='Components']"));
       WebElement scannersub=   driver.findElement(By.xpath("//a[normalize-space()='Scanners (0)']"));
         
         act1.moveToElement(component).moveToElement(scannersub).click().perform();
         
            
         //difference of perform and build().perform()
         
         driver.get("https://demo.opencart.com/");
         
         
		
	}

}
