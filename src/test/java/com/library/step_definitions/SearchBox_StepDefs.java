package com.library.step_definitions;

import com.library.pages.BooksPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchBox_StepDefs {

    BooksPage booksPage = new BooksPage();

    @Then("categories list should have following names:")
    public void categories_list_should_have_following_names(List<String> Categories) {

        List<WebElement> categories = booksPage.bookCategoriesList;
        List<String> expectedCategories = BrowserUtils.getElementsText(categories);

        Assert.assertEquals("verify that all categories", expectedCategories , Categories );

    }



    @Then("verify the search with following {string} information")
    public void verify_the_search_with_following_information(String bookInfo) {

        booksPage.searchBook.sendKeys(bookInfo);

        if (bookInfo=="The Idiot "){
            Assert.assertEquals(booksPage.bookNameBox.getText(),"The Idiot ");
        }else if(bookInfo=="Fyodor Dostoevsky"){
            Assert.assertEquals(booksPage.authorNAmeBox.getText(),"Fyodor Dostoevsky");
        }



    }






}
