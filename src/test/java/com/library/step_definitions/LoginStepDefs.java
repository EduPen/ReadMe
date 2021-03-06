package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user enter {string} and enter {string}")
    public void user_enter_and_enter(String email, String password) {
        loginPage.login(email, password);
        BrowserUtils.waitFor(3);
    }

    @When("Users login with invalid {string} and {string}")
    public void users_login_with_invalid_and(String email2, String password2) {
        loginPage.login(email2, password2);
        BrowserUtils.waitFor(3);
    }


    @Then("title verify login page")
    public void title_verify_login_page() {
        if(user_login_as("student")){
            BrowserUtils.waitFor(3);
            Assert.assertTrue(Driver.get().getCurrentUrl().contains("books"));
        } else if(user_login_as("librarian")){
            BrowserUtils.waitFor(3);
            Assert.assertTrue(Driver.get().getCurrentUrl().contains("dashboard"));
        }

    }

    @When("user login as {string}")
    public boolean user_login_as(String usertype) {

        Driver.get().get(ConfigurationReader.get("url"));
        String username = null;
        String password = null;
        if (usertype.equals("students")) {
            username = ConfigurationReader.get("student_username");
            password = ConfigurationReader.get("student_password");
        } else if (usertype.equals("librarian")) {
            username = ConfigurationReader.get("librarian_username");
            password = ConfigurationReader.get("librarian_password");

        }
        new LoginPage().login(username,password);
        return false;
    }

    @Then("Error {string} display")
    public void error_display(String message) {
        BrowserUtils.waitFor(2);
        String actualMessage=loginPage.errorMessage.getText();
        Assert.assertTrue(actualMessage.equals(message));

    }

}