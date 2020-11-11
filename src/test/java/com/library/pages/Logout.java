package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage {




    @FindBy (css = ".dropdown-item")
    public WebElement logout;

    @FindBy (css = "#navbarDropdown>span")
    public WebElement usertype;

    public void userTypeClick () {
        usertype.click();
    }

    public void clickLogout () {
        logout.click();
    }

}
