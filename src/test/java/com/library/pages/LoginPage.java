package com.library.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "inputEmail")
    public WebElement usernameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(tagName = "button")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMessage;


    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


}
