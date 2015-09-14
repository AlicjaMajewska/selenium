package selenium_ala.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_ala.selenium_test.AbstractPageObject;

public class EditBookPage extends AbstractPageObject {

	public EditBookPage(WebDriver driver) {
		super(driver);
	}

	private WebElement newTitle;
	@FindBy(id = "SaveNewTitle")
	private WebElement editBookButton;

	public EditBookPage setTitle(String title) {
		this.newTitle.sendKeys(title);
		return this;
	}

	public BookPage clickEditBookButton() {
		this.editBookButton.click();
		return PageFactory.initElements(driver, BookPage.class);
	}

}
