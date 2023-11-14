package SamplePackage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.testng.annotations.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Screenshots {
	@Test

	//public static void main(String[] args) throws IOException, InterruptedException {
	public static void Screenshot() throws IOException, InterruptedException {

	WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		Thread.sleep(4000);
		
		/*//Screenshot capture full screen
         TakesScreenshot fullscreen = (TakesScreenshot) driver;
         File src = fullscreen.getScreenshotAs(OutputType.FILE);
         File dest = new File(".\\Screenshots\\homescreen.png");
         
         FileUtils.copyFile(src, dest); */
         
         
		
         
		WebElement snapshot = driver.findElement(By.xpath("//div[@id='content']//div[@class='row']"));
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='Your Store']"));
		
		
		//WebElement snapshot = driver.findElement(By.xpath("//div[@id='carousel-banner-1']"));		
		File src1 = snapshot.getScreenshotAs(OutputType.FILE);
		File dest1 = new File(".\\Screenshots\\snapshot.png");
		Thread.sleep(5000);
		File src2 = logo.getScreenshotAs(OutputType.FILE);
		File dest2 = new File(".\\Screenshots\\logo.png");

		
		FileUtils.copyFile(src1, dest1);
		Thread.sleep(5000);

		FileUtils.copyFile(src2,dest2);
		
		driver.quit();
		
	}


}
