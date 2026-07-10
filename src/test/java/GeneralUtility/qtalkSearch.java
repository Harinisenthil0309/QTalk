package GeneralUtility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qspy.crm.generalUtilities.ExcelUtility;
import com.qspy.crm.generalUtilities.JavaUtility;
import com.qspy.crm.generalUtilities.PropertyUtility;
import com.qspy.crm.generalUtilities.WebDriverUtility;

public class qtalkSearch

{
	public static void main(String[]args) throws Throwable
	{
		
	// Object Creation 
		
	PropertyUtility plib=new PropertyUtility();
	ExcelUtility elib=new ExcelUtility();
	JavaUtility jlib=new JavaUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	
	//To read data from propertyUtility
	String Browser=plib.ToReadDataFromProp("browser");
	String URL=plib.ToReadDataFromProp("url");
	String UN=plib.ToReadDataFromProp("un");
	String PW=plib.ToReadDataFromProp("pw");
	
	
	//To read data From excelUtility
	
	String nameSrch=elib.toReadDataFromExcel("Search",1,0);
	String msg=elib.toReadDataFromExcel("Search",1,1);
	

	WebDriver driver=null;
    if(Browser.equalsIgnoreCase("edge")) {
    	driver=new EdgeDriver();
    }else if(Browser.equalsIgnoreCase("chrome"))
    {
    	ChromeOptions options=new ChromeOptions();
	    Map<String,Object> prefs=new HashMap<>();
	    prefs.put("profile.password_manager_leak_detection",false);
	    options.setExperimentalOption("prefs",prefs);
	    driver=new ChromeDriver(options);
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
    
    driver.findElement(By.name("search")).sendKeys(nameSrch);
    driver.findElement(By.xpath("//div[@class='_chat_listUser__7px9Q']")).click();
    driver.findElement(By.xpath("//textarea[@placeholder='Write something...']")).sendKeys(msg);
    driver.findElement(By.xpath("//button[@class='chatSubmitButton' and @type='button']")).click();
    
    
    Thread.sleep(2000);
    
   
    driver.quit();
    
}
}
