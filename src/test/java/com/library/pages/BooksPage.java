package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BooksPage extends BasePage {

    @FindBy(css = "a.add_book_btn")
     public WebElement AddBook;

    @FindBy(css = "#book_categories")
     public WebElement BookCategories;

    @FindBy(xpath = "//*[contains(@class, 'form-control input-sm input-xsmall input-inline')]")
     public WebElement Search;
    @FindBy(xpath = "//table[@id='tbl_books']")
     public WebElement Table;
    @FindBy(xpath = "//*[contains(@class, 'btn btn-primary btn-sm')]")
     public WebElement EditBook;
    @FindBy(xpath = "//button[contains(text(),'Save changes')]")
     public WebElement SaveChanges;
    @FindBy(xpath = "//button[contains(text(),'Close')]")
     public WebElement Close;
    @FindBy(name = "name")
     public WebElement BookName;
    @FindBy(name = "isbn")
    public WebElement ISBN;
    @FindBy(name = "year")
    public WebElement Year;
    @FindBy(xpath = "//input[@name='author']")
    public WebElement Author;
    @FindBy(id = "book_group_id")
    public WebElement BookCategory;
    @FindBy(id = "description")
    public WebElement Description;
    @FindBy(css = "div.toast.toast-success")
    public  WebElement verifyMessage;
    @FindBy(css = "div.toast-message")
    public WebElement editVerifymessage;

    @FindBy(css = "#book_categories>option")
    public List<WebElement> bookCategoriesList;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBook;

    @FindBy(xpath = "//table[@id='tbl_books']/tbody/tr[1]/td[3]")
    public WebElement bookNameBox;

    @FindBy(xpath = "//table[@id='tbl_books']/tbody/tr[1]/td[4]")
    public WebElement authorNAmeBox;

    @FindBy(xpath = "//a [@href='#dashboard']/ i")
    public WebElement dashboardModule;

    @FindBy(xpath = "//a [@href='#users']/ i")
    public WebElement usersModule;

    @FindBy(xpath = "//a [@href='#books']/ i")
    public WebElement booksModule;


    public Select bookCategoryOptions(){
       return new Select(BookCategory);
    }


    @FindBy(name = "tbl_books_length")
    public List<WebElement> recordsDropdown;

    @FindBy(name = "tbl_books_length")
    public WebElement showRecord;


}








