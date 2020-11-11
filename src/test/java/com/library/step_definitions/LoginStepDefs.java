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

    @Then("title contains {string}")
    public void title_contains(String string) {

        String actualpage = Driver.get().getTitle();
        String expectedpage = "Login - Library";
        System.out.println(actualpage);
        Assert.assertEquals(expectedpage, actualpage);
    }

    @Then("user logged in page")
    public void user_logged_in_page() {
        String actualpage = Driver.get().getTitle();
        Assert.assertTrue(actualpage.equals("Library"));
    }


    @When("user login as {string}")
    public void user_login_as(String usertype) {

        Driver.get().get(ConfigurationReader.get("url"));
        String username = null;
        String password = null;
        if (usertype.equals("student_username")) {
            username = ConfigurationReader.get("student_username");
            password = ConfigurationReader.get("student_password");
        } else if (usertype.equals("librarian_username")) {
            username = ConfigurationReader.get("librarian_username");
            password = ConfigurationReader.get("librarian_password");

        }
    }

}