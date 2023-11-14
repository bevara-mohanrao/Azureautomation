package SamplePackage;
import java.time.Duration;
import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ScrollerandActions {

	@Test

	//public static void main(String[] args) throws InterruptedException {
	public static void ScrollerandAction() throws InterruptedException {

		//Program of Scroll scroller,Difference between Action and Action, Difference between build().perform() and perform()
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		
		driver.get("https://www.cheapoair.com/air/listing?&d1=RDU&r1=AUS&dt1=11/15/2023&tripType=ONEWAYTRIP&cl=ECONOMY&ad=1&se=0&ch=0&infs=0&infl=0");
		
		WebElement  leftscroll = driver.findElement(By.xpath("//div[@class='left-range-button ranges__left']"));
		
		System.out.println("Find the exact location  of left scroll "+leftscroll.getLocation());
		System.out.println("Print the size of left scroll " +leftscroll.getSize());
		
		Actions act1 = new Actions(driver);
		Thread.sleep(2000);
		
		act1.dragAndDropBy(leftscroll, 85,181).perform();
		
		//WebElement  rightscroll = driver.findElement(By.xpath("//div[@class='range-slider__block']//div[@class='right-range-button ranges__right primaryBg--color']"));
		Thread.sleep(4000);
		WebElement  rightscroll = driver.findElement(By.xpath("//*[@id='filter']/section[3]/div/section/div/div/span[2]/div/section/div/div/div[2]/div[2]")); 
		

		act1.dragAndDropBy(rightscroll, 102,181).perform(); 
		

		driver.get("https://demo.opencart.com/");
		
	   WebElement component =   driver.findElement(By.xpath("//a[normalize-space()='Components']"));
	   Thread.sleep(3000);
       WebElement scannersub=   driver.findElement(By.xpath("//a[normalize-space()='Scanners (0)']"));

	   Action cursor= act1.moveToElement(component).build();
	       cursor.perform();
		   Thread.sleep(1000);
	   act1.moveToElement(scannersub).perform();

		   driver.quit();
		
	}

}
