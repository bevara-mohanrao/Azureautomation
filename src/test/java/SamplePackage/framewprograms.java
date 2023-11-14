package SamplePackage;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framewprograms {

	@Test

	//public static void main(String[] args) throws InterruptedException {
	public static void framewprogram() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		//driver.findElement(By.xpath("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0"));
		
		//driver.switchTo().frame("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0");
		 Thread.sleep(3000);
		 
		driver.switchTo().frame("iframeResult");

		WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		  System.out.println("Get the text "+element.getText());
		  driver.switchTo().defaultContent();
		  
			 Thread.sleep(1000);

		  WebElement button1 = driver.findElement(By.id("getwebsitebtn"));
		  System.out.println("Get the text "+button1.getText());
		  //button1.click();
		  
			driver.switchTo().frame("iframeResult");
			WebElement element1 = driver.findElement(By.xpath("//p"));

			  System.out.println("Get the text "+element1.getText());
			  
			  driver.switchTo().defaultContent();
			  WebElement runbutton = driver.findElement(By.id("runbtn"));
			  System.out.println("Get the text "+runbutton.getText());
			  

			  // IDENTIFY OUTER AND INNER FRAME
			  driver.manage().window().maximize();
			  driver.get("https://demo.automationtesting.in/Frames.html");
				 Thread.sleep(1000);

				 WebElement outerbutton=driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));
			//WebElement outerbutton = driver.findElement(By.xpath("//li[@class='active']/a[contains(.,'Iframe with in an Iframe')]"));
			  outerbutton.click();
				 Thread.sleep(3000);

	          WebElement outerframe=driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
	          	             
	           driver.switchTo().frame(outerframe);
	           
	           WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe\r\n"));
	           driver.switchTo().frame(innerframe);

			  
             WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
             input.sendKeys("Innter Frame");  
             
             // Outer frame and innner frame and redirect to main screen.
             
             driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
             
             WebElement outframe = driver.findElement(By.name("iframeResult"));
             driver.switchTo().frame(outframe);
             WebElement element3 = driver.findElement(By.xpath("/html/body/h2"));
             
             System.out.println("Print the header " +element3.getText());
             driver.switchTo().frame(0);
             
             WebElement element4 = driver.findElement(By.xpath("/html/body/h1"));
             
             System.out.println("Print the innerframe text " +element4.getText());
                     
             driver.switchTo().parentFrame();
             
             WebElement outframefinal = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]"));
             outframefinal.getText();
             
             
            			  

			  
			  
		
		
		
	}

}

