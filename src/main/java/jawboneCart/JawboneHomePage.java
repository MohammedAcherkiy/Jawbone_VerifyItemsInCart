package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class JawboneHomePage {

	public MarketPlacePage shoplink(WebDriver driver) {

		// Click on the shop Button
		WebUtil.clickButton(driver, By.cssSelector(".jawbone-nav-item.nav-store>a[data-ga-label='desktop']"));

		// wait for the free shipping text to be visible
		WebUtil.waitForElementVisible(driver, By.cssSelector(".store-policy-bar >li[class='free-shipping']"));

		return PageFactory.initElements(driver, MarketPlacePage.class);
	}

}
