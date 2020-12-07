package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage {

    @FindBy(partialLinkText = "Add Bo")
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


}
