package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JawboneHomePage {

	public MarketPlacePage shoplink(WebDriver driver) {

		// Click on the shop Button
		WebElement shopButton = driver
				.findElement(By.cssSelector(".jawbone-nav-item.nav-store>a[data-ga-label='desktop']"));
		shopButton.click();
		// wait for the free shipping text to be visible
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".store-policy-bar >li[class='free-shipping']")));

		return PageFactory.initElements(driver, MarketPlacePage.class);
	}

}
