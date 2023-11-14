package SamplePackage;
import java.util.List;
import java.util.Set;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class coockiesprogram {

	@Test

	//public static void main(String[] args) throws InterruptedException {

	public  void coockiesprograms() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.youtube.com/");
		 Thread.sleep(4000);
		 
		 Set<Cookie> cke =  driver.manage().getCookies();
		  
		 System.out.println("size of the cookies "+cke.size());
		 
		 for(Cookie cooki:cke)
		 {
			 System.out.println(cooki.getName()+ ": " +cooki.getValue());
		 }
		 
         Cookie cookieobj1 = new Cookie("MyNEWCookie324","989833243242");
           cke.add(cookieobj1);
           Cookie cookieobj2 = new Cookie("MyNEWCookie22343","3223443243242");
           cke.add(cookieobj2);
  		 System.out.println("size of the cookies "+cke.size());
  		 
  		    driver.manage().deleteCookie(cookieobj2);
  		  // driver.manage().deleteCookie(cookieobj2);
  		  cke = driver.manage().getCookies();
  		 
  		 driver.manage().deleteCookieNamed("MyNEWCookie");
 		  cke = driver.manage().getCookies();

  		 System.out.println("final list of the cookies "+cke.size());

  		 driver.manage().deleteAllCookies();
 		  cke = driver.manage().getCookies();
 		  
  		 System.out.println("final list of the cookies "+cke.size());

         driver.quit();  
	}

}
