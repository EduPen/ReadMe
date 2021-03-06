package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


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

    @FindBy(css = "h6.text-muted")
    public List<WebElement> moduleNames;

    public void goModule(String moduleName){

        Driver.get().findElement(By.xpath("//span[text()='"+moduleName+"']")).click();



    }



}

