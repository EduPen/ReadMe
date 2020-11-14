package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.DashboardPage;
import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class AddBooksStepDefs {

    @And("navigate to {string} module")
    public void navigateToModule(String module) {

        new DashboardPage().navigatetoModule(module);
    }
    @And("click Add book button")
    public void clickAddBookButton() {
        BrowserUtils.waitFor(2);
        new BooksPage().AddBook.click();
    }

    @And("creates new book using following information")
    public void createsNewBookUsingFollowingInformation(Map<String,String> addBookOptions) {

        BooksPage booksPage=new BooksPage();
        booksPage.BookName.sendKeys(addBookOptions.get("Book Name"));
        booksPage.Author.sendKeys(addBookOptions.get("Author"));
        booksPage.ISBN.sendKeys(addBookOptions.get("ISBN"));
        booksPage.Year.sendKeys(addBookOptions.get("Year"));
        booksPage.bookCategoryOptions().selectByVisibleText(addBookOptions.get("Book Category"));
        booksPage.Description.sendKeys(addBookOptions.get("Description"));

    }

    @Then("the message {string} should be displayed")
    public void theMessageShouldBeDisplayed(String message) {

        new BooksPage().SaveChanges.click();
        Assert.assertEquals(new BooksPage().verifyMessage.getText(),message);

    }


    @And("click Edit Book")
    public void clickEditBook() {
        new BooksPage().EditBook.click();
    }


    @And("do some info changes")
    public void doSomeInfoChanges(Map<String,String> info) {
        BooksPage booksPage=new BooksPage();
        booksPage.BookName.sendKeys(info.get("Book Name"));
        booksPage.Author.sendKeys(info.get("Author"));

    }


    @And("click save changes")
    public void clickSaveChanges() {

        new BooksPage().SaveChanges.click();
    }

    @Then("verify the book info edited")
    public void verifyTheBookInfoEdited() {
        Assert.assertEquals(new BooksPage().editVerifymessage.getText(),"The book has been updated.");
    }

    @Then("verify the closing edit")
    public void verifyTheClosingEdit() {

        Assert.assertTrue(new BooksPage().Close.isEnabled());
    }
    @And("click close button")
    public void clickCloseButton() {
      new BooksPage().Close.click();
    }

    @Then("user is on the Books Module")
    public void userIsOnTheBooksModule() {

        Assert.assertEquals(Driver.get().getCurrentUrl(), "http://library2.cybertekschool.com/#books");
    }




}
