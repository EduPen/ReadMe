package com.library.pages;

import com.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.NoSuchElementException;

public class BorrowPage {

    @FindBy(xpath = "//th [@class=\"sorting_asc\"]")
    public WebElement BorrowedBy;

    @FindBy(xpath = "//*[@id=\"books\"]/div[1]/div[2]")
    public  WebElement BorrowBook;




    public void BorrowedBy(){

        BorrowedBy.click();

    }
    public void BorrowedBook(){
        BorrowBook.click();
    }


}