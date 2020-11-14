package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
