package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.BorrowPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class BorrowingStepDef {

    BorrowPage borrowPage=new BorrowPage();
    BooksPage booksPage=new BooksPage();

    @When("click Borrow book button")
    public void click_Borrow_book_button() {
        booksPage.searchBook.sendKeys("Super Chicken");


        List<WebElement> options =Driver.get().findElements(By.tagName("td"));
        for(WebElement sample: options)
        {
            if(sample.getText().equals(" Borrow Book")){
                sample.click();
                break;
            }
        }

    }

    @Then("the message “The book has been borrowed” is displayed")
    public void the_message_The_book_has_been_borrowed_is_displayed() {

       Assert.assertEquals(new BorrowPage().borrowingMessage.getText(),"The book has been borrowed...");
    }

    @When("navigate to borrowing book page")
    public void navigate_to_borrowing_book_page() {
        borrowPage.BorrowingBook.click();
    }

    @When("click Return book button")
    public void click_Return_book_button() {



    }

        @Then("the message “The book has been returned” is displayed")
        public void the_message_The_book_has_been_returned_is_displayed () {

            Assert.assertEquals(new BorrowPage().returningMessage.getText(), "The book has been returned");
        }


}



