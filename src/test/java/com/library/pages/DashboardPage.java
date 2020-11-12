package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends BasePage {

    public DashboardPage(){

        PageFactory.initElements(Driver.get(),
                this);
    }

    @FindBy(css = "a>img")
    public WebElement logo;

    @FindBy(id = "user_count")
    public WebElement userCount;

    @FindBy(id= "book_count")
    public WebElement booksCount;

    @FindBy(id = "borrowed_books")
    public WebElement BorrowedBooksCount;

    @FindBy(linkText = "Users")
    public WebElement userText;

    @FindBy(xpath = "Books")
    public WebElement bookText;

    @FindBy(xpath = "Borrowed Books")
    public WebElement borrowedBooksText;



}

