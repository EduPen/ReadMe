package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage {


    @FindBy(xpath = "//*[@id='navbarCollapse']/ul[2]/li")

    public WebElement usertype;


    @FindBy (xpath = "//div//a[@class='dropdown-item']")
public WebElement logout;


    public void userTypeClick () {
        usertype.click();
    }

    public void clickLogout () {
        logout.click();
    }

}
