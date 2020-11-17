package com.library.step_definitions;

import com.library.pages.BooksPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dashboardInformation_StepDef {

    BooksPage booksPage=new BooksPage();

    @When("navigate to books module")
    public void navigate_to_books_module() {
        booksPage.booksModule.click();
    }

    @When("calculate total borrowed books number")
    public void calculate_total_borrowed_books_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("navigate to dashboard module")
    public void navigate_to_dashboard_module() {
        booksPage.dashboardModule.click();
    }

    @Then("verify the borrowed books number are equal")
    public void verify_the_borrowed_books_number_are_equal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("calculate total books number")
    public void calculate_total_books_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify the users  number are equal")
    public void verify_the_users_number_are_equal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("calculate total \\(active and inactive ) users")
    public void calculate_total_active_and_inactive_users() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify the books numbers are equal")
    public void verify_the_books_numbers_are_equal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
