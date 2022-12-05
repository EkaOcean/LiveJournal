package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends AbstractPage {

    @FindBy(id = "user")
    private WebElement login;

    @FindBy(id = "lj_loginwidget_password")
    private WebElement password;

    @FindBy(css = ".b-loginform-checkbox__control")
    private WebElement loginCheckBox;

    @FindBy(name = "action:login")
    private WebElement submit;

    public LoginPage(WebDriver driver){

        super(driver);
    }

    public void loginIn(){
        this.submit.click();
    }

    public LoginPage setLogin(String login){
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        this.password.sendKeys(password);
        return this;
    }

    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.login,login)
                .click(this.password)
                .sendKeys(password)
                .click(this.submit)
                .build()
                .perform();
    }
}