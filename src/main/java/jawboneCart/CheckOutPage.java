package jawboneCart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	WebDriver driver;

	public String getText(WebDriver driver) {

		return driver.findElement(By.cssSelector(".left.prod-name>b")).getText();
	}

	public NewJawboneBrowser termsOfUse(WebDriver driver) {

		WebUtil.clickButton(driver, By.cssSelector(".columns.copyRightTxt>a "));

		// Switching to new Jawbone Window.

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> id = ids.iterator();
		String parent = id.next();
		String newWindow = id.next();
		driver.switchTo().window(newWindow);

		return PageFactory.initElements(driver, NewJawboneBrowser.class);
	}

}
