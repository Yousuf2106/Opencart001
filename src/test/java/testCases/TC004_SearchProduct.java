package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC004_SearchProduct extends BaseClass {
	
	@Test
	public void searchProductName()
	{
		//HomePage Objects calling
		HomePage hp=new HomePage(driver);
		logger.info("****** Search Function started *********");
		hp.searchBox(p.getProperty("product1"));//user input value from properties file
		logger.info("*******Clicking search button *******");
		hp.clickSearch();
		logger.info("******Search button clicked *******");
		hp.productDisplayMsg();
		
	}
	public void verifyExistingProduct()
	{
		String actualURL=driver.getCurrentUrl();
		String expectedUrl="https://tutorialsninja.com/demo/index.php?route=product/search&search=Mac";
		Assert.assertEquals(actualURL, expectedUrl);
	}
	public void verifyNonExistingProduct()
	{
		String actualURL=driver.getCurrentUrl();
		String expectedUrl="https://tutorialsninja.com/demo/index.php?route=product/search&search=Toothpaste";
		Assert.assertEquals(actualURL, expectedUrl);
	}

}
