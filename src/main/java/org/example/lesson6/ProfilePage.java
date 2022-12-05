package org.example.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ProfilePage extends AbstractPage {

    public ProfilePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement username;

    public ProfilePage setYourName(String accountname){
        this.username.clear();
        this.username.sendKeys(accountname);
        return this;
    }


    @FindBy(id = "journaltitle")
    private WebElement journaltitle;

    public ProfilePage setJournalTitle(String journaltitle){
        this.journaltitle.clear();
        this.journaltitle.sendKeys(journaltitle);
        return this;
    }

    @FindBy(id = "journalsubtitle")
    private WebElement journalsubtitle;

    public ProfilePage setJournalSubTitle(String journalsubtitle){
        this.journalsubtitle.clear();
        this.journalsubtitle.sendKeys(journalsubtitle);
        return this;
    }

    @FindBy(name = "tojournal")
    private WebElement savechanges;

    public void setSavechanges(){
        this.savechanges.click();
    }


}
