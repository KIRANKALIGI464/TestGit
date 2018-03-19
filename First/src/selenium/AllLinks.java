package selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	 public static void main(String[] args) throws Exception
     {
		 System.setProperty("webdriver.chrome.driver", "D://eclipse-jee-mars-2-win32-x86_64//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
driver.get("https://www1.desipearl.com/advertiser/test-widget-en.html");

         driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

         Map<String, Integer> map = new HashMap<String, Integer>();

         List<String> imgIds = new ArrayList<String>();
         for(int i=0;i<100;i++)
         {
             List<WebElement> adds =
 driver.findElements(By.className("adg_Native_Img"));


             for(int j = 0; j<adds.size();j++)
             {
                  String[] imageIdLinkArray =
 adds.get(j).getAttribute("src").split("/");


 imgIds.add(imageIdLinkArray[imageIdLinkArray.length-1]);
if(!map.containsKey(imageIdLinkArray[imageIdLinkArray.length-1]))
                     {
 map.put(imageIdLinkArray[imageIdLinkArray.length-1],1);
                     }
                     else
                     {
                         int count =
 map.get(imageIdLinkArray[imageIdLinkArray.length-1]);
 map.put(imageIdLinkArray[imageIdLinkArray.length-1],count +1);
                     }
             }
                     for(int k=0; k<imgIds.size()-1; k++)
                     {
                         if(imgIds.get(k)==imgIds.get(k+1))
                             throw new Exception("All ads are not unique");
                     }
                     driver.navigate().refresh();

                 }
                 Iterator<String> keyIterator   = map.keySet().iterator();
                 Iterator<Integer>  valueIterator = map.values().iterator();

                 while(valueIterator.hasNext()){
                     System.out.println(keyIterator.next() + "-"+
 valueIterator.next());

                 }

             }	
}
