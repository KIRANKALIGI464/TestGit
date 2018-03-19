package selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserHistory {
WebDriver d;
 
@Test
 public void testBrowser() throws Exception{
	d.navigate().to("http://docs.seleniumhq.org/");
	assertEquals("Selenium - Web Browser Automation", d.getTitle());
	d.findElement(By.linkText("Download")).click();
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(2000);
	d.navigate().forward();
	Thread.sleep(2000);
	d.navigate().refresh();
	Thread.sleep(2000);
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
