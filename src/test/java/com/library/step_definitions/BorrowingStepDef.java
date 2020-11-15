package com.library.step_definitions;

import com.library.pages.BorrowPage;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class BorrowingStepDef {


    BorrowPage borrow= new BorrowPage ();


    @When("Click borrow book button")
    public void click_borrow_book_button() {

        borrow.BorrowedBy.click();
        borrow.BorrowBook.click();

    }

    @Then("the message “The book has been borrowed” is displayed")
    public void the_message_The_book_has_been_borrowed_is_displayed() {

        boolean flag = true;


        while (flag) {
            try {
                WebElement myMessage=  Driver.get().findElement(By.xpath("//div[@class='toast-message']")) ;
                String popUp=  myMessage.getText();
                flag=false;
                Assert.assertEquals("\"The book has been borrowed...\"",popUp);

            }
            catch (NoSuchElementException E) {


            }

        }

    }

    @When("navigate to borrowing book page")
    public void navigate_to_borrowing_book_page() {

    }

    @When("click return button")
    public void click_return_button() {

    }

    @Then("verify that borrowed book returned")
    public void verify_that_borrowed_book_returned() {

    }



}

