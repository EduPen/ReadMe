package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.pages.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class SearchBox_StepDefs {

    @Then("categories list should have following names:")
    public void categories_list_should_have_following_names(List<String> Categories) {
        BooksPage booksPage = new BooksPage();
        booksPage.BookCategories.click();



    }

    @When("search by {string}")
    public void search_by(String string) {
        BooksPage booksPage = new BooksPage();
        booksPage.Search.sendKeys("12345");
        booksPage.Search.sendKeys("Selenium Book");
        booksPage.Search.sendKeys("Jamal D");

    }

    @Then("verify the search with following column information")
    public void verify_the_search_with_following_column_information() {
    }






}
