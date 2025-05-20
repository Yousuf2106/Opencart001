package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver)//CONSTRUCTOR
	{
	    super(driver);
	}

	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement txtSearchBox;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement btnSearch;
	

	public void clickMyAccount()
	{
	    lnkMyaccount.click();
	}

	public void clickRegister()
	{
	    lnkRegister.click();
	}
	
	public void clickLogin()
	{
		lnkLogin.click();
	}
	
	public void searchBox()
	{
		txtSearchBox.sendKeys("Mac");
	}
	
	public void clickSearch()
	{
		btnSearch.click();
		
	}

}
