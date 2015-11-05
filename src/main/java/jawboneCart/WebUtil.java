package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtil {

	public static JawboneHomePage goToJawboneHomePage(WebDriver driver) {
		driver.get("http://www.jawbone.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shop")));

		return PageFactory.initElements(driver, JawboneHomePage.class);
	}

}
