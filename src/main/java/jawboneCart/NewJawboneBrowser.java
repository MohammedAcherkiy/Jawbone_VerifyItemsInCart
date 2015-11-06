package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewJawboneBrowser {
	WebDriver driver;

	public void waitForCartTobeVisible() {
		WebUtil.waitForElementVisible(driver, By.cssSelector(".global-nav-cart-icon._global-nav-cart-icon"));

	}

	public boolean isElementExist3(WebDriver driver) {

		return driver.findElement(By.cssSelector(".global-nav-cart-icon._global-nav-cart-icon")).isDisplayed();
	}

	public void clickOnCartInNewBrowser(WebDriver driver) {

		WebUtil.clickButton(driver, By.cssSelector(".global-nav-cart-icon._global-nav-cart-icon"));
	}

	public void waitForcheckOutLinkToBeVisible(WebDriver driver) {

		WebUtil.waitForElementVisible(driver,
				By.cssSelector(".checkout-button>span[class='button _global-nav-cart-checkout']"));
	}

	public CheckOutPage checkOutLink(WebDriver driver) {
		WebUtil.clickButton(driver, By.cssSelector(".checkout-button>span[class='button _global-nav-cart-checkout']"));
		return PageFactory.initElements(driver, CheckOutPage.class);

	}

}
