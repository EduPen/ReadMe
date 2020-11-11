package com.library.step_definitions;

import com.library.pages.Logout;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logout_StepDef {


    @Then("titles contains {string}")
    public void titles_contains(String string) {
        String actualTitle = Driver.get().getTitle();

       Assert.assertTrue(actualTitle.contains("Library"));
        System.out.println(actualTitle);
    }

    @Then("user click {string}")
    public void user_click(String string) {
        Logout logout =new Logout ();
        logout.userTypeClick();

    }



    @When("user click log out")
    public void user_click_log_out() {
        Logout logout = new Logout();
        logout.clickLogout();



    }

    @Then("user is on the login page")
    public void user_is_on_the_login_page() {
        String actualTitle = Driver.get().getTitle();

        Assert.assertTrue(actualTitle.contains("Login"));

    }
}
