package selenium_ala.selenium_test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import selenium_ala.pages.AuthorsPage;
import selenium_ala.pages.BookPage;
import selenium_ala.pages.DialogAPage;
import selenium_ala.pages.DialogBPage;
import selenium_ala.pages.DialogCPage;
import selenium_ala.pages.HomePage;
import selenium_ala.selenium_test.AbstractSelenium;

public class MainPageFormValidationSeleniumTest extends AbstractSelenium {

	private HomePage homePage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		homePage = openLibrary();
	}

	@Test
	public void dialogAShouldBeAvailable() {
		DialogAPage dialogA = homePage.clickDialogA();
		Assert.assertFalse(homePage.hasError());
		Assert.assertFalse(dialogA.hasError());
	}

	@Test
	public void dialogBShouldBeAvailable() {
		DialogBPage dialogB = homePage.clickDialogB();
		Assert.assertFalse(homePage.hasError());
		Assert.assertFalse(dialogB.hasError());
	}

	@Test
	public void dialogCShouldBeAvailable() {
		DialogCPage dialogC = homePage.clickDialogC();
		Assert.assertFalse(homePage.hasError());
		Assert.assertFalse(dialogC.hasError());
	}

	@Test
	public void authorsDialogShouldBeAvailable() {
		AuthorsPage authorsDialog = homePage.clickAuthorsDialog();
		Assert.assertFalse(homePage.hasError());
		Assert.assertFalse(authorsDialog.hasError());
	}

	@Test
	public void booksDialogShouldBeAvailable() {
		BookPage booksDialog = homePage.clickBooksDialog();
		Assert.assertFalse(homePage.hasError());
		Assert.assertFalse(booksDialog.hasError());
	}

}
