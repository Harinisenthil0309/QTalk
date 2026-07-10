package GeneralUtility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qspy.crm.generalUtilities.ExcelUtility;
import com.qspy.crm.generalUtilities.JavaUtility;
import com.qspy.crm.generalUtilities.PropertyUtility;
import com.qspy.crm.generalUtilities.WebDriverUtility;

public class qtalkTestFresher 
{
public static void main(String[]args) throws Throwable
{
	PropertyUtility plib=new PropertyUtility();
	ExcelUtility elib=new ExcelUtility();
	JavaUtility jlib=new JavaUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	
	//To read data from propertyUtility
	
	String Browser=plib.ToReadDataFromProp("browser");
	String URL=plib.ToReadDataFromProp("url");
	String UN=plib.ToReadDataFromProp("un");
	String PW=plib.ToReadDataFromProp("pw");
	
	// to 
			
			WebDriver driver=null;
		    if(Browser.equalsIgnoreCase("edge")) {
		    	driver=new EdgeDriver();
		    }else if(Browser.equalsIgnoreCase("chrome"))
		    {
			    driver=new ChromeDriver();
		    }
		    	 else {
		    	driver=new FirefoxDriver();
		    	 }
		    
		    wlib.toMaximize(driver);  //Maximizing the Browser
		    wlib.waitForPageToLoad(driver); // Implicit Wait
		    
		    driver.get(URL);
		    
		    driver.findElement(By.name("username")).sendKeys(UN);
		    driver.findElement(By.name("password")).sendKeys(PW);
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
		    driver.findElement(By.xpath("//a[.='Test Freshers']")).click();
		    
		    wlib.switchToChildWindow(driver);
		    driver.findElement(By.xpath("//a[.='Practice Question']")).click();
		    
		    driver.findElement(By.xpath("//button[@title=\"core java\"]")).click();

  driver.findElement(By.xpath("//span[.='polymorphism' and @class='_chapterText_c73qr_67']"));
	  Actions act = new Actions(driver);
	 
	  WebElement ele =driver.findElement(By.xpath("//button[.='Solve Problem']"));
	  act.moveToElement(ele).click().perform();
	    driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
	    driver.findElement(By.xpath("//button[.='save answer']")).click();
	   
	    driver.findElement(By.xpath("//*[@class=\"Toastify__close-button Toastify__close-button--dark\" and @type=\"button\"]")).click();
	    driver.findElement(By.id("_preview_md4v8_1")).click();
	    driver.findElement(By.xpath("//p[.='Logout']")).click();
	    driver.findElement(By.xpath("//button[.='Yes']")).click();
	    		    
}
}
	
	




