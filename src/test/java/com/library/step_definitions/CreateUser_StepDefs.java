package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.pages.UserPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateUser_StepDefs {
    UserPage userPage = new UserPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }


    @When("navigate to {string} module")
    public void navigate_to_module(String string) {
        new DashboardPage().usersLink.click();
    }

    @When("click Add User")
    public void click_Add_User() {
       new UserPage().AddUs.click();
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

    }

    @Then("the message  {string} should be displayed")
    public void the_message_should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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
