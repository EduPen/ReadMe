package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends BasePage {

    public DashboardPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//img[@class='d-inline-block align-top']")
    public WebElement logo;

}

