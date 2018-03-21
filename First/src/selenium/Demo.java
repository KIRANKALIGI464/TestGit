package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] arg){

		System.setProperty("webdriver.chrome.driver", "D://eclipse-jee-mars-2-win32-x86_64//chromedriver.exe");
		//WebDriver d = new FirefoxDriver();
		WebDriver d = new ChromeDriver();
		d.get("http://www.seleniumhq.org/download/");
	    d.quit();
	}

}
