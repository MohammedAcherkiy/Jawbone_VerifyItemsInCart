package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		// go to jawbon website
		driver = new FirefoxDriver();
		jawboneHomePage = WebUtil.goToJawboneHomePage(driver);

	}

	@Test
	public void VerifyItemsInCart() {
		MarketPlacePage marketPlacePage = jawboneHomePage.shoplink(driver);

		// wait for the free shipping text to be visible
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".store-policy-bar >li[class='free-shipping']")));

		// Assert that we are in the marketPlacePage
		Assert.assertTrue(
				driver.findElement(By.cssSelector(".store-policy-bar >li[class='free-shipping']")).isDisplayed());
		// Click add to cart to add"UP2: Oat Spectrum Lightweight Thin Strap"

		marketPlacePage.clickButton(driver);

		// Assert that View cart link is visible
		Assert.assertTrue(driver.findElement(By.linkText("VIEW CART")).isDisplayed());

		// Click on view Cart

		CheckOutPage checkOutPage = marketPlacePage.clickViewCart(driver);

		Assert.assertEquals(driver.findElement(By.cssSelector(".left.prod-name>b")).getText(),
				"UP2 by Jawbone - Oat Spectrum Rope");

	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
