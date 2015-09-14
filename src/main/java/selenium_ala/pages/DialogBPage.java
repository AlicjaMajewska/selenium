package selenium_ala.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium_ala.selenium_test.AbstractPageObject;

public class DialogBPage extends AbstractPageObject {

	@FindBy(tagName = "h2")
	WebElement header;

	public DialogBPage(WebDriver driver) {
		super(driver);
	}
}
	
	
