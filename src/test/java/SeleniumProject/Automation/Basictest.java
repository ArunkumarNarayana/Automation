package SeleniumProject.Automation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class Basictest {
	
	public static void main(String args[])  {
	
	
		//System.out.println("Hii		");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN KUMAR\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();  
        
        // Launch Website  
     driver.get("http://www.javatpoint.com/");  
     driver.manage().window().maximize();
     //Thread.sleep(3000);
     @SuppressWarnings("unchecked")
	List <WebElement> list= driver.findElements(By.xpath("//p[text()='Splunk']/../../../a/div/p"));

     Iterator it=list.iterator();
     while(it.hasNext())
     {
    	 WebElement ele= ((WebElement) it.next());
    	// driver.navigate().refresh();
    	 System.out.println(ele.getText());
	     System.out.println("hii arun");
    	 
    	 
    	 
     }
	}
	
	
	
	}
	


