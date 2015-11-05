package jawboneCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	public String getText(WebDriver driver) {

		return driver.findElement(By.cssSelector(".left.prod-name>b")).getText();
	}

}
