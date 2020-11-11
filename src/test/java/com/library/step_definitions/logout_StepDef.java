package com.library.step_definitions;

import com.library.pages.Logout;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logout_StepDef {
    Logout logout =new Logout ();

    @Then("titles contains {string}")
    public void titles_contains(String string) {
        String actualTitle = Driver.get().getTitle();
       Assert.assertTrue(actualTitle.contains("Library"));
    }

    @Then("user click {string}")
    public void user_click(String string) {
        logout.userTypeClick();
    }



    @When("user click log out")
    public void user_click_log_out() {
        logout.clickLogout();
    }

    @Then("user is on the login page")
    public void user_is_on_the_login_page() {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains("Login"));
    }
}
