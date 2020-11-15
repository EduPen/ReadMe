package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BooksStepDefs {

    BooksPage booksPage=new BooksPage();

    @Then("the default record shows {string}")
    public void the_default_record_shows(String expectedRecord) {
        Select record=new Select(booksPage.showRecord);

        String actualRecord = record.getFirstSelectedOption().getAttribute("value");
        Assert.assertEquals(expectedRecord,actualRecord);
        System.out.println("actualRecord = " + actualRecord);


    }



    @Then("records options have these numbers")
    public void records_options_have_these_numbers(List<String> expectedRecords) {
        BrowserUtils.waitFor(1);

        List<WebElement> recordsList= booksPage.recordsDropdown;
        List<String> actualRecordsList= BrowserUtils.getElementsText(recordsList);

        Assert.assertEquals("verify that all categories", expectedRecords , actualRecordsList );


    }




}
