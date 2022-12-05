package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EditProfilePage extends AbstractPage {

    public EditProfilePage(WebDriver driver){
        super(driver);
    }

    @FindBy(linkText = "настройки просмотра")
    private WebElement viewSettings;

    public void goToViewSettingsPage(){
        this.viewSettings.click();
    }

}
