package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @When("user enter {string} and enter {string}")
    public void user_enter_and_enter(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginBtn.click();
        //loginPage.login();
        BrowserUtils.waitFor(3);


    }

    @When("Users login with invalid {string} and {string}")
    public void users_login_with_invalid_and(String email2, String password2) {

        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(email2);
        loginPage.passwordInput.sendKeys(password2);
        loginPage.loginBtn.click();
        //loginPage.login();
        BrowserUtils.waitFor(3);


    }

    @Then("title contains {string}")
    public void title_contains(String string) {

        String actualpage = Driver.get().getTitle();
        String expectedpage = "Login - Library";
        System.out.println(actualpage);
        Assert.assertEquals(expectedpage, actualpage);
        Driver.closeDriver();

    }

    @Then("user logged in page")
    public void user_logged_in_page() {
        String actualpage = Driver.get().getTitle();
        String expectedpage = "Library";
        System.out.println(actualpage);

        Assert.assertEquals(expectedpage, actualpage);
        Driver.closeDriver();
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

    @When("title contains {string}")
    public void titles_contains(String url) {

               /* if () {
                  String url = Driver.get().getCurrentUrl();
                    Assert.assertTrue(url.contains("dashboard"));
                } else if () {
                    String url = Driver.get().getCurrentUrl();
                    Assert.assertTrue(url.contains("books"));

                }
                 }*/}




   /* @Then("user gets error messages")
    public void user_gets_error_messages(List<String> errorMessages) {
        String actualpage = Driver.get().findElement(By.id("inputEmail-error")).getText();
        for (int i = 0; i < errorMessages.size(); i++) {

            if (errorMessages.get(i).equals(actualpage)) {
                Assert.assertEquals(errorMessages.get(i), actualpage);
        break;
            } else {
                Assert.assertEquals(errorMessages.get(i), actualpage);

            }
        }
     }
    */
    }