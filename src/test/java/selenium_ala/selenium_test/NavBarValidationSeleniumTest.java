package selenium_ala.selenium_test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import selenium_ala.pages.AuthorsPage;
import selenium_ala.pages.BookPage;
import selenium_ala.pages.DialogAPage;
import selenium_ala.pages.DialogBPage;
import selenium_ala.pages.DialogCPage;
import selenium_ala.selenium_test.AbstractSelenium;

public class NavBarValidationSeleniumTest  extends AbstractSelenium {

	private BookPage booksPage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		booksPage = openLibrary().clickBooksDialog();
	}

	@Test
	public void dialogAShouldBeAvailable() {
		DialogAPage dialogA = booksPage.navigationBar.clickDialogA();
		Assert.assertFalse(booksPage.hasError());
		Assert.assertFalse(dialogA.hasError());
	}

	@Test
	public void dialogBShouldBeAvailable() {
		DialogBPage dialogB = booksPage.navigationBar.clickDialogB();
		Assert.assertFalse(booksPage.hasError());
		Assert.assertFalse(dialogB.hasError());
	}

	@Test
	public void dialogCShouldBeAvailable() {
		DialogCPage dialogC = booksPage.navigationBar.clickDialogC();
		Assert.assertFalse(booksPage.hasError());
		Assert.assertFalse(dialogC.hasError());
	}

	@Test
	public void authorsDialogShouldBeAvailable() {
		AuthorsPage authorsDialog = booksPage.navigationBar.clickAuthorsDialog();
		Assert.assertFalse(booksPage.hasError());
		Assert.assertFalse(authorsDialog.hasError());
	}
	@Test
	public void booksDialogShouldBeAvailable() {
		BookPage booksDialog = booksPage.navigationBar.clickBooksDialog();
		Assert.assertFalse(booksPage.hasError());
		Assert.assertFalse(booksDialog.hasError());
	}

}
