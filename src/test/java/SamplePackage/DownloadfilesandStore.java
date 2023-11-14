package SamplePackage;
import java.util.HashMap;
import java.util.prefs.Preferences;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DownloadfilesandStore {

	@Test

	//public static void main(String[] args) throws InterruptedException {
	
	public  void DownloadfilesandStores() throws InterruptedException {

		
		
		//Chrome browser download proces and store file.
		
		/* String location = System.getProperty("user.dir")+"\\Downloads\\";
		 
	     HashMap preference = new HashMap();
         preference.put("download.default.directory", location);
         
	     ChromeOptions option = new ChromeOptions();
	     option.setExperimentalOption("prefs", option); */
	     
	     
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://file-examples.com/index.php/sample-documents-download/sample.doc-download/");
		
		driver.get("https://demo.automationtesting.in/FileDownload.html#google_vignette");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		//driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[2]")).click();
		
		  driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='aswift_8']")));
		
		driver.findElement(By.xpath("//a[@type='button']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		//*[@id="table-files"]/tbody/tr[1]/td[5]/a
		
		
	}

}
