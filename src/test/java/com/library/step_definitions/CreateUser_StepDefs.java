package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CreateUser_StepDefs {

    BooksPage booksPage=new BooksPage();
    UserPage userPage =new UserPage();


    @When("navigate to {string} module")
    public void navigate_to_user_module() {

        booksPage.usersModule.click();
    }

    @When("click Add User")
    public void click_Add_User() {
       userPage.AddUser.click();
    }

    @When("creates new user using following information")
    public void creates_new_user_using_following_information(Map<String,String> informations) {
        userPage.fullName.sendKeys(informations.get("Full Name"));
        userPage.email.sendKeys(informations.get("Email"));
        userPage.password.sendKeys(informations.get("Password"));
        userPage.userGroup().selectByVisibleText(informations.get("User Group"));
        userPage.status().selectByVisibleText(informations.get("Status"));
        userPage.startDate.sendKeys(informations.get("Start Date"));
        userPage.endDate.sendKeys(informations.get("End Date"));
        userPage.address.sendKeys(informations.get("Address"));
        userPage.saveChanges.click();

    }

    @Then("the message  {string} should be displayed")
    public void the_message_should_be_displayed(String string) {
        Assert.assertTrue(userPage.message.isDisplayed());
    }

    @When("click close button")
    public void click_close_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify closing the “adding”")
    public void verify_closing_the_adding() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("click Edit User")
    public void click_Edit_User() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("do some valid changes")
    public void do_some_valid_changes(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify editing")
    public void verify_editing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify closing the editing")
    public void verify_closing_the_editing() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
