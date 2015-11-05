package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarketPlacePage {

	public void clickButton(WebDriver driver) {

		WebElement addToCart = driver
				.findElement(By.cssSelector("a[data-title='UP2: Oat Spectrum Lightweight Thin Strap']"));
		addToCart.click();
		// wait for the product to be added to the cart.
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW CART")));

	}

	public CheckOutPage clickViewCart(WebDriver driver) {
		WebElement viewCart = driver.findElement(By.linkText("VIEW CART"));
		viewCart.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".left.prod-name>b")));

		return PageFactory.initElements(driver, CheckOutPage.class);
	}

}
