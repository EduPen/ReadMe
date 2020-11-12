package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends BasePage {

    public DashboardPage(){

        PageFactory.initElements(Driver.get(),
                this);
    }

    @FindBy(xpath = "//img[@class='d-inline-block align-top']")
    public WebElement logo;


    public void goModule(String moduleName){  //i didnt understand but there is an error about this locator

        Driver.get().findElement(By.xpath("//span[text()='"+moduleName+"']")).click();



    }





}

