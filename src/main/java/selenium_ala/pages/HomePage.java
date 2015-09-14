package selenium_ala.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import selenium_ala.selenium_test.AbstractPageObject;

public class HomePage extends AbstractPageObject {
	@FindBys({ @FindBy(tagName = "p"), @FindBy(linkText = "Books dialog") })
	private WebElement booksDialog;
	@FindBys({ @FindBy(tagName = "p"), @FindBy(linkText = "Authors dialog") })
	private WebElement authorsDialog;
	@FindBys({ @FindBy(tagName = "p"), @FindBy(linkText = "Dialog A") })
	private WebElement dialogA;
	@FindBys({ @FindBy(tagName = "p"), @FindBy(linkText = "Dialog B") })
	private WebElement dialogB;
	@FindBys({ @FindBy(tagName = "p"), @FindBy(linkText = "Dialog C") })
	private WebElement dialogC;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver.get("http://localhost:9721/workshop/");
	}

	public BookPage clickBooksDialog() {
		booksDialog.click();
		return PageFactory.initElements(driver, BookPage.class);
	}

	public AuthorsPage clickAuthorsDialog() {
		authorsDialog.click();
		return PageFactory.initElements(driver, AuthorsPage.class);
	}

	public DialogAPage clickDialogA() {
		dialogA.click();
		return PageFactory.initElements(driver, DialogAPage.class);
	}

	public DialogBPage clickDialogB() {
		dialogC.click();
		return PageFactory.initElements(driver, DialogBPage.class);
	}

	public DialogCPage clickDialogC() {
		dialogC.click();
		return PageFactory.initElements(driver, DialogCPage.class);
	}

}
