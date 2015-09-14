package selenium_ala.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium_ala.selenium_test.AbstractPageObject;

public class DialogAPage extends AbstractPageObject {

	@FindBy(tagName = "img")
	WebElement image;
	@FindBy(tagName = "h2")
	WebElement header;

	public DialogAPage(WebDriver driver) {
		super(driver);
	}
	
	

}
