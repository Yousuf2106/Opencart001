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
	
	@FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
	WebElement txtProductNotAvailable;
	

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
	
	public void searchBox(String product2)
	{
		txtSearchBox.sendKeys(product2);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
	public void productDisplayMsg()
	{
		
	try {
		if(txtProductNotAvailable.isDisplayed()) {
			System.out.println("Product not available" + txtProductNotAvailable.getText() );
			}
		}catch(Exception e) {
		 System.out.println("Product available");
		}
	}
}
