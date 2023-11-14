package SamplePackage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LinkPartialBroken {

	@Test

	//public static void main(String[] args) throws InterruptedException, MalformedURLException {

	public static void LinkPartialBrokens() throws InterruptedException, MalformedURLException {

		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		driver.findElement(By.partialLinkText("Basics")).click();
		
		
		List<WebElement> Linkslist=  driver.findElements(By.tagName("a"));
		
		System.out.println("Count the total links  "+Linkslist.size());
		
		for(int i=0;i <Linkslist.size();i++)
		{
			System.out.println("Link text area"+Linkslist.get(i).getText());
			System.out.println("Get the URL links "+Linkslist.get(i).getAttribute("href"));

			
		}
		Thread.sleep(4000);
		
		// Code for the broken links
		
		driver.get("http://www.deadlinkcity.com/");
	
		List<WebElement> brlinks = driver.findElements(By.tagName("a"));
		
		int brokelinks = 0;
		
		for(WebElement blinks:brlinks)
		{
			String  url= blinks.getAttribute("href");
			
			if(url==null ||url.isEmpty())
			{
				System.out.println("Url is empty");
				continue;
			}
			
			URL link = new URL(url);
			
			try {

				 HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();
				httpconnect.connect();
				if(httpconnect.getResponseCode()>=400)
				{
					System.out.println(httpconnect.getResponseCode()+ url + " is" + "broken link");
					brokelinks++;
					//Thread.sleep(500);

				}
				
				else
				{
					System.out.println(httpconnect.getResponseCode()+ url + " is" + "Valid link");

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		
		  driver.quit();

	}

}
