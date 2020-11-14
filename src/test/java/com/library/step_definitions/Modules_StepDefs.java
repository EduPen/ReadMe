package com.library.step_definitions;

import com.library.pages.DashboardPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Modules_StepDefs {


    @Then("users see following modules")
    public void users_see_following_modules(List<String> ModuleNames) {
        BrowserUtils.waitFor(2);

        DashboardPage dashboardPage = new DashboardPage();
        List<WebElement> modNames = dashboardPage.moduleNames;
        List<String> expectedModNames = BrowserUtils.getElementsText(modNames);


        Assert.assertEquals("verify that all the Module Names are matching",expectedModNames,ModuleNames);



    }

}

