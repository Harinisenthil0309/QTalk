package com.qspy.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage
{
WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	// to enter a username
	
@FindBy(name="username")
private WebElement Un;
public WebElement getUn() {
		return Un;
	}

//to enter password

@FindBy(name="password")
private WebElement Pwd;
public WebElement getPwd() {
	return Pwd;
}

//To click on Login button

@FindBy(xpath="//button[@type='submit']")
private WebElement btn;

public WebElement getBtn() {
	return btn;
}

public void qtalkLoginPage(String Url,String un, String pwd)
{
	driver.get(Url);
	Un.sendKeys(un);
	Pwd.sendKeys(pwd);
	btn.click();	
}


	 
}
