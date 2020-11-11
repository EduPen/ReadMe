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


    @FindBy(id="inputEmail-error")
    public WebElement invalidemailaddress;
    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/div")
    public WebElement invalidpassword;


    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


}
