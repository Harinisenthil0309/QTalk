package GeneralUtility;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qspy.crm.generalUtilities.ExcelUtility;
import com.qspy.crm.generalUtilities.JavaUtility;
import com.qspy.crm.generalUtilities.PropertyUtility;
import com.qspy.crm.generalUtilities.WebDriverUtility;

public class qtalkHelp {

	public static void main(String[] args) throws Throwable 
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
		
		//To read data From ExcelUility
		String ticTitle=elib.toReadDataFromExcel("Help",1,0);
		String Msg=elib.toReadDataFromExcel("Help", 1, 1);
		
		
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
	    
	    driver.findElement(By.xpath("//a[.='Help']")).click();
	    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedInfo MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiButton-contained MuiButton-containedInfo MuiButton-sizeSmall MuiButton-containedSizeSmall css-72uqgt']")).click();
	driver.findElement(By.id("mui-component-select-subject")).click();
	driver.findElement(By.xpath("//li[3]")).click();
	driver.findElement(By.xpath("//div[@role='combobox' and @aria-controls=':r4:']")).click();
	driver.findElement(By.xpath("//li[@data-value='Selenium']")).click();
	driver.findElement(By.xpath("//input[@name='title']")).sendKeys(ticTitle);
	driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(Msg);
	driver.findElement(By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedWarning MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiButton-contained MuiButton-containedWarning MuiButton-sizeSmall MuiButton-containedSizeSmall css-10zay8b\"]")).click();
	
	driver.findElement(By.xpath("//*[name()='svg' and @viewBox=\"0 0 14 16\"]")).click();
	driver.findElement(By.xpath("//button[.='Cancel']")).click();
	driver.findElement(By.xpath("//*[name()='svg' and @viewBox='0 0 1216 1312']")).click();
	driver.findElement(By.xpath("//button[@aria-haspopup='true']")).click();
driver.findElement(By.xpath("//span[@title='logout']")).click();
driver.findElement(By.xpath("//button[.='OK']")).click();
	Thread.sleep(2000);
	
	




	
	}

}
