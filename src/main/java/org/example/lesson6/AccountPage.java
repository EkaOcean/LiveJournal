package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AccountPage extends AbstractPage {

    public AccountPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".s-header-extra-menu-item--edit-inf span")
    private WebElement changeJournalDescription;

    public void goToProfilePage(){
        this.changeJournalDescription.click();
    }

    @FindBy(css = ".s-header-toggle__button-desktop")
    private WebElement andMore;

    public void openAndMoreMenu(){
        this.andMore.click();
    }

    @FindBy(linkText = "Редактировать профиль")
    private WebElement editprofile;

    public void goToEditProfile(){
        this.editprofile.click();
    }
}