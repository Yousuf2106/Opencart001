package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver; //WebDriver variable
	
	public BasePage(WebDriver driver)//constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}

/* contains WebDriver variable and constructor
 * this BasePage is extended to every class
 * parent of all page object classes
 * CONSTRUCTOR is same for all page Object classes
 * 
 */