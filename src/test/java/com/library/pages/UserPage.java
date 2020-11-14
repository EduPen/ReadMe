package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{


@FindBy(tagName = "h3")
    public WebElement UserManagement;
@FindBy(partialLinkText = "Add Us")
    public WebElement AddUs;
@FindBy(css = "#user_groups")
    public WebElement Status;
@FindBy(css="#user_groups")
    public WebElement UserGroup;
@FindBy(name = "tbl_users_length")
    public WebElement ShowRecord;
@FindBy(xpath = "//*[contains(@class, 'form-control input-sm input-small input-inline')")
    public WebElement Search;
@FindBy(css ="#tbl_users")
    public WebElement Table;




}