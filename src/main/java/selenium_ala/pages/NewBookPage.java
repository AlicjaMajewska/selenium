package selenium_ala.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium_ala.selenium_test.AbstractPageObject;

public class NewBookPage extends AbstractPageObject {

	public NewBookPage(WebDriver driver) {
		super(driver);
	}

	private WebElement title;
	private WebElement firstName0;
	private WebElement lastName0;
	private WebElement firstName1;
	private WebElement lastName1;
	private WebElement firstName2;
	private WebElement lastName2;
	@FindBy(id = "submit")
	private WebElement adBookButton;
	@FindBy(name = "addAuthor")
	private WebElement adNextAuthorButton;
	@FindBy(name = "deleteAuthor0")
	private WebElement deleteNextAuthorButton0;
	@FindBy(name = "deleteAuthor1")
	private WebElement deleteNextAuthorButton1;

	public NewBookPage setTitle(String title) {
		this.title.sendKeys(title);
		return this;
	}

	public NewBookPage setFirstName(String firstName) {
		this.firstName0.sendKeys(firstName);
		return this;
	}

	public NewBookPage setLastName(String lastName) {
		this.lastName0.sendKeys(lastName);
		return this;
	}
	public NewBookPage setFirstName1(String firstName) {
		this.firstName1.sendKeys(firstName);
		return this;
	}
	
	public NewBookPage setLastName1(String lastName) {
		this.lastName1.sendKeys(lastName);
		return this;
	}
	public NewBookPage setFirstName2(String firstName) {
		this.firstName2.sendKeys(firstName);
		return this;
	}
	
	public NewBookPage setLastName2(String lastName) {
		this.lastName2.sendKeys(lastName);
		return this;
	}

	public NewBookPage clickDeleteNextAuthor0() {
		this.deleteNextAuthorButton0.click();
		return this;
	}
	public NewBookPage clickDeleteNextAuthor1() {
		this.deleteNextAuthorButton1.click();
		return this;
	}

	public NewBookPage clickAddNextAuthor() {
		this.adNextAuthorButton.click();
		return this;
	}

	public BookPage clickAddBookButton() {
		adBookButton.click();
		return PageFactory.initElements(driver, BookPage.class);
	}

}
