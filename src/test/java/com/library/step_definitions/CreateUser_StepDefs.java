package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.UserPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CreateUser_StepDefs {

    BooksPage booksPage = new BooksPage();
    UserPage userPage = new UserPage();

    @When("navigate to user module")
    public void navigate_to_user_module() {
        booksPage.usersModule.click();
    }

    @When("click Add User")
    public void click_Add_User() {
        userPage.AddUser.click();


    }

    @When("creates new user using following information")
    public void creates_new_user_using_following_information(Map<String, String> informations) {

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
        BrowserUtils.waitFor(2);
        userPage.closeBtn.click();


    }

    @Then("verify closing the adding")
    public void verify_closing_the_adding() {
        Assert.assertTrue(userPage.closeBtn.isEnabled());
    }

    @When("click Edit User")
    public void click_Edit_User() {
        userPage.editUserbtn.click();
    }

    @When("do some valid changes")
    public void do_some_valid_changes(Map<String, String> info) {
        userPage.fullName.clear();
        userPage.fullName.sendKeys(info.get("Full Name"));
        userPage.email.clear();
        userPage.email.sendKeys(info.get("Email"));
        userPage.saveChanges.click();
    }

    @Then("verify editing")
    public void verify_editing() {
        Assert.assertTrue(userPage.message.isDisplayed());
    }

    @Then("verify closing the editing")
    public void verify_closing_the_editing() {
        Assert.assertTrue(userPage.closeBtn.isEnabled());


    }


}
