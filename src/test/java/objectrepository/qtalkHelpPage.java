package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qspy.crm.generalUtilities.ExcelUtility;
import com.qspy.crm.generalUtilities.JavaUtility;
import com.qspy.crm.generalUtilities.PropertyUtility;
import com.qspy.crm.generalUtilities.WebDriverUtility;
import com.qspy.crm.objectrepository.loginPage;

public class qtalkHelpPage 
{
public static void main(String[]args) throws Throwable
{
	// TO CREATE OBJECT FOR AN UTILITY
	
	PropertyUtility plib=new PropertyUtility();
	JavaUtility jlib=new JavaUtility();
	WebDriverUtility wlib=new WebDriverUtility();
	ExcelUtility elib=new ExcelUtility();
	
	// TO READ DATA FROM PROPERTY UTILITY
	String Browser=plib.ToReadDataFromProp("browser");
	String URL=plib.ToReadDataFromProp("url");
	String UN=plib.ToReadDataFromProp("un");
	String PWD=plib.ToReadDataFromProp("pw");
	
	//To read data From ExcelUility
	String ticTitle=elib.toReadDataFromExcel("Help",1,0);
	String Msg=elib.toReadDataFromExcel("Help", 1, 1);
	
	
	WebDriver driver=null;
    if(Browser.equalsIgnoreCase("edge")) {
    	driver=new EdgeDriver();
    }
    else if(Browser.equalsIgnoreCase("chrome"))
    {
   
	    driver=new ChromeDriver();
    }
    	 else
    	 {
    	driver=new FirefoxDriver();
    	 }
    
    wlib.toMaximize(driver);  //Maximizing the Browser
    wlib.waitForPageToLoad(driver); // Implicit Wait
	

// To create login page

loginPage login=new loginPage(driver);
login.qtalkLoginPage(URL,UN,PWD);

//



}
}
