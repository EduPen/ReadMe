package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserPage extends BasePage{


@FindBy(tagName = "h3")
    public WebElement UserManagement;

@FindBy(partialLinkText = "Add Us")
    public WebElement AddUser;

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
    @FindBy(name = "full_name")
    public WebElement fullName;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(css = "#user_group_id")
    public WebElement addUserGroupDropDown;
    @FindBy(id = "status")
    public WebElement addUserStatus;
    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement startDate;
    @FindBy(xpath = "//input[@name='end_date']")
    public WebElement endDate;
    @FindBy(css = "#address")
    public WebElement address;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChanges;
    @FindBy(css = ".toast-message")
    public WebElement message;
    @FindBy(xpath = "//button[@type='cancel']")
    public WebElement closeBtn;
    @FindBy(xpath = "(//table/tbody/tr/td/a)[1]")
    public  WebElement editUserbtn;

    public Select userGroup() {
        return new Select(addUserGroupDropDown);
    }

    public Select status() {
        return new Select(addUserStatus);

    }



}