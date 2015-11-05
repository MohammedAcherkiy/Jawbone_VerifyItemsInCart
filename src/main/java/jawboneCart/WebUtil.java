package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtil {
	static final int WAIT_TIME_OUT = 30;

	public static JawboneHomePage goToJawboneHomePage(WebDriver driver) {
		driver.get("http://www.jawbone.com");
		driver.manage().window().maximize();

		return PageFactory.initElements(driver, JawboneHomePage.class);
	}

	public static void clickButton(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		element.click();

	}

	public static void waitForElementVisible(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME_OUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}

}
