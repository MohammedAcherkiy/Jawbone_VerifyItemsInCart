package jawboneCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JawboneCartItems {
	// driver = new HtmlUnitDriver();

	WebDriver driver;
	JawboneHomePage jawboneHomePage;

	@BeforeMethod
	public void SetUp() {
		// go to Jawbone url
		driver = new FirefoxDriver();
		jawboneHomePage = WebUtil.goToJawboneHomePage(driver);

	}

	@Test
	public void VerifyItemsInCart() {
		// Click on Shop Link
		MarketPlacePage marketPlacePage = jawboneHomePage.shoplink(driver);

		// Assert that we are in the marketPlacePage
		Assert.assertTrue(marketPlacePage.isElementExist(driver));

		// Click add to cart to add"UP2: Oat Spectrum Lightweight Thin Strap"

		marketPlacePage.clickButton(driver);

		// Assert that View cart link is visible

		Assert.assertTrue(marketPlacePage.isElementExist2(driver));

		// Click on view Cart

		CheckOutPage checkOutPage = marketPlacePage.clickViewCart(driver);
		// Assert that UP2 by Jawbone -Oat Spectrum Rope is visible on
		// CheckoutPage
		Assert.assertEquals(checkOutPage.getText(driver), "UP2 by Jawbone - Oat Spectrum Rope");

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
