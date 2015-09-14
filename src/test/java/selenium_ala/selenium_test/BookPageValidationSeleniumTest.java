package selenium_ala.selenium_test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import selenium_ala.pages.BookPage;
import selenium_ala.pages.EditBookPage;
import selenium_ala.selenium_test.AbstractSelenium;

public class BookPageValidationSeleniumTest extends AbstractSelenium {
	private BookPage bookPage;

	@Override
	@Before
	public void setUp() {
		super.setUp();
		bookPage = openLibrary().clickBooksDialog();
	}

	@Test
	public void shouldEditAddedBook() {
		// given
		String title = "title";
		String firstName = "firstName";
		String lastName = "lastName";
		String newTitle = "newTitle";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddBookButton();
		EditBookPage editPage = bookPage.findBookToEdit(title, firstName,
				lastName);
		bookPage = editPage.setTitle(newTitle).clickEditBookButton();
		boolean editedBookFound = bookPage.findBookByTitleAndName(newTitle,
				firstName, lastName);
		// then
		assertFalse(bookPage.hasError());
		assertTrue(editedBookFound);
	}
	
	@Test
	public void bookShouldStayEditedAfterRefresh() {
		// given
		String title = "title";
		String firstName = "firstName";
		String lastName = "lastName";
		String newTitle = "newTitle";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddBookButton();
		EditBookPage editPage = bookPage.findBookToEdit(title, firstName,
				lastName);
		BookPage bookPageAfterEdit = editPage.setTitle(newTitle)
				.clickEditBookButton();
		bookPageAfterEdit.refresh();
		boolean editedBookFound = bookPageAfterEdit.findBookByTitleAndName(
				newTitle, firstName, lastName);
		// then
		assertFalse(bookPageAfterEdit.hasError());
		assertTrue(editedBookFound);
	}
	
	@Test
	public void shouldDeleteAddedBook() {
		// given
		String title = "deleteMe";
		String firstName = "firstName";
		String lastName = "lastName";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddBookButton();
		boolean deletedBookFound = bookPage.deleteSpecifiedBook(title,
				firstName, lastName).findBookByTitleAndName(title, firstName,
				lastName);
		// then
		assertFalse(bookPage.hasError());
		assertFalse(deletedBookFound);
	}

	@Test
	public void bookShouldStayDeletedAddedAfterRefresh() {
		// given
		String title = "deleteMe";
		String firstName = "firstName";
		String lastName = "lastName";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddBookButton();
		bookPage.deleteSpecifiedBook(title, firstName, lastName).refresh();
		boolean deletedBookFound = bookPage.findBookByTitleAndName(title,
				firstName, lastName);
		// then
		assertFalse(bookPage.hasError());
		assertFalse(deletedBookFound);
	}
	
	@Test
	public void shouldAddedNewBook() {
		// given
		String title = "title";
		String firstName = "firstName";
		String lastName = "lastName";
		// when
		bookPage.clickAddBook().setTitle(title).setFirstName(firstName)
				.setLastName(lastName).clickAddBookButton();
		boolean bookFound = bookPage.findBookByTitleAndName(title, firstName,
				lastName);
		// then
		assertFalse(bookPage.hasError());
		assertTrue(bookFound);
	}
	

}
