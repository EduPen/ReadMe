package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDef {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user enter valid librarian credentials {string} {string}")
    public void the_user_enter_valid_librarian_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @When("the user enter valid student credentials {string} {string}")
    public void the_user_enter_valid_student_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitForVisibility(dashboardPage.logo,5);
        Assert.assertTrue(dashboardPage.logo.isDisplayed());
    }
}

