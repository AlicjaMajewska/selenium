package selenium_ala.selenium_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import selenium_ala.pages.BookPage;

public class AuthorPageValidationSeleniumTest extends AbstractSelenium {

	private BookPage bookPage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		bookPage = openLibrary().clickBooksDialog();
	}

	@Test
	public void shouldAddNewAuthor() {
		// given
		String title = "title";
		String firstName = "firstName";
		String lastName = "lastName";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddBookButton();
		boolean authorIsFound = bookPage.goToAuthors().findAuthorByName(
				firstName, lastName);
		// then
		assertFalse(bookPage.hasError());
		assertTrue(authorIsFound);
	}

	@Test
	public void shouldAddTowNewAuthors() {
		// given
		String title = "title";
		String firstName = "firstName1";
		String lastName = "lastName1";
		String firstName2 = "firstName2";
		String lastName2 = "lastName2";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddNextAuthor()
				.setFirstName1(firstName2).setLastName1(lastName2)
				.clickAddBookButton();
		boolean authorIsFound = bookPage.goToAuthors().refresh().findAuthorByName(
				firstName, lastName);
		boolean authorIsFound2 = bookPage.goToAuthors().findAuthorByName(
				firstName2, lastName2);
		// then
		assertFalse(bookPage.hasError());
		assertTrue(authorIsFound);
		assertTrue(authorIsFound2);
	}

	@Test
	public void shouldAddThreeNewAuthorsAndDeleteSecondAuthor() {
		// given
		String title = "title";
		String firstName = "firstName1";
		String lastName = "lastName1";
		String firstName2 = "firstNameToDelete";
		String lastName2 = "lastNameToDelete";
		String firstName3 = "firstName3";
		String lastName3 = "lastName3";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddNextAuthor()
				.setFirstName1(firstName2).setLastName1(lastName2)
				.clickAddNextAuthor().setFirstName2(firstName3)
				.setLastName2(lastName3).clickDeleteNextAuthor1()
				.clickAddBookButton();
		boolean authorIsFound = bookPage.goToAuthors().refresh().findAuthorByName(
				firstName, lastName);
		boolean authorIsFound2 = bookPage.goToAuthors().findAuthorByName(
				firstName2, lastName2);
		boolean authorIsFound3 = bookPage.goToAuthors().findAuthorByName(
				firstName3, lastName3);
		// then
		assertFalse(bookPage.hasError());
		assertTrue(authorIsFound);
		assertFalse(authorIsFound2);
		assertTrue(authorIsFound3);
	}

}
