package SeleniumProject.Automation;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondtest {
	
	public static void main(String args[]) throws InterruptedException  {
		
		
		//System.out.println("Hii		");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();  
        
        // Launch Website  
     driver.get("http://www.javatpoint.com/");  
     driver.manage().window().maximize();
    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //Thread.sleep(3000);
     @SuppressWarnings("unchecked")
	List <WebElement> list= driver.findElements(By.xpath("//ol/li/a"));

     Iterator it=list.iterator();
     
    	 
         for(int i=1;i<list.size();i++) {
        	 driver.navigate().refresh();
        	 Thread.sleep(2000);
        	 System.out.println(driver.findElement(By.xpath("(//ol/li/a)[position()="+i+"]")).getText());
        	 driver.findElement(By.xpath("(//ol/li/a)[position()="+i+"]")).click();
        	Thread.sleep(2000);
        	
        	 
        	 
     		
     	}
    	 
    	 
    	 
     }
    
     
	}
	
	


