package com.qspy.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qtalkHelp 
{
	WebDriver driver;
public qtalkHelp(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

// to click on help
@FindBy(xpath="//a[.='Help']")
private WebElement clickHelp;
public WebElement getClickHelp() {
	return clickHelp;
}

@FindBy()
private WebElement hh;
{
	
}
}

