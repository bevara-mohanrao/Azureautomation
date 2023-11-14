package SamplePackage;
import java.util.concurrent.*;
import org.testng.annotations.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//flash
//draw border
//getting title
//click action
//generate alert
//refreshing this page
//scrolling down
//scropp up page
//zoom page


public class JSUtilpackage {

	@Test

	public static void  JsDrawborder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid green'",element);

	}
	
	public static String  JsgetTitle(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title; ").toString();
                     return title;
	}
	
	public static void  JseventClick(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()",element);
		 
		//js.executeScript("a, null)

	}
	
	public static void  JseventAlert(WebDriver driver,String message)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
	//	js.executeScript("alert('" + message + "')");

	}
	
	public static void  JsrefreshPage(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");

	}
	
	public static void  JsScrolldown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
	public static void  JsScrollup(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrolBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,0)");


	}
	public static void  Jszoomstyle(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='120'");
	
	}
	
	public static void  Jsbackgroundcolor(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgcolor = element.getCssValue("backgroundColor");
		
        for(int i=1;i<10;i++)
        {
		changebackground("#000000",element,driver);
		changebackground(bgcolor,element,driver);
        }
	}
	
	
	
	public static void  changebackground(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].style.backgroundColor ='"+ color + "'", element);
       
        try {
        	Thread.sleep(200);
        }
        catch(InterruptedException e) {
        	
        }

	
		
	}

	
}	



