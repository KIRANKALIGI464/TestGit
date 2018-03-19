package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserSlider {
WebDriver d;

 @Test
 public void testDrowser() throws Exception{
	  d.get("https://www.flipkart.com/");
	 //d.get("https://www.jabong.com/men/");
	 for(int n=0;n<10;n++){
		 ((RemoteWebDriver)d).executeScript("window.scrollBy(0,200)", "");
		 Thread.sleep(2000);
	 }
 }
 @BeforeMethod
 public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D://eclipse-jee-mars-2-win32-x86_64//chromedriver.exe");
		d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 
 }
 
 @AfterMethod
 public void tearDown(){
	  d.quit();
 }
	
}
