package com.library.pages;

import com.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class BorrowPage extends  BasePage {


    @FindBy(linkText = "Borrow Books")
    public  WebElement bookReturn;

    @FindBy(xpath = "//table[@id='tbl_books']/tbody/tr[1]/td[1]/a")
    public WebElement bookBorrow;

    @FindBy(className = "toast-message")
    public  WebElement borrowingMessage;

    @FindBy(className = "toast-message")
    public  WebElement returningMessage;

    @FindBy( xpath= "//a[@href='#borrowing-books']")
    public  WebElement BorrowingBook;

}
