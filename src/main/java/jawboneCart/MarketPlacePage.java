package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MarketPlacePage {

	public void clickButton(WebDriver driver) {

		// Add item to card
		WebUtil.clickButton(driver, By.cssSelector("a[data-title='UP2: Oat Spectrum Lightweight Thin Strap']"));

		// wait for the item to be added
		WebUtil.waitForElementVisible(driver, By.linkText("VIEW CART"));

	}

	public CheckOutPage clickViewCart(WebDriver driver) {
		WebUtil.clickButton(driver, By.linkText("VIEW CART"));

		// wait
		WebUtil.waitForElementVisible(driver, By.cssSelector(".left.prod-name>b"));

		return PageFactory.initElements(driver, CheckOutPage.class);
	}

	public boolean isElementExist(WebDriver driver) {

		return driver.findElement(By.cssSelector(".store-policy-bar >li[class='free-shipping']")).isDisplayed();

	}

	public boolean isElementExist2(WebDriver driver) {

		return driver.findElement(By.linkText("VIEW CART")).isDisplayed();
	}

}
