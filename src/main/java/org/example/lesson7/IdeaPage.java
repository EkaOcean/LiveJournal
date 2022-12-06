package org.example.lesson7;

import org.example.lesson6.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IdeaPage extends AbstractPage {

    public IdeaPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = ".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[2]/a")
    private WebElement more;

    public void openMoreMenu(){
        this.more.click();
    }

    @FindBy(xpath = ".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[2]/a")
    private WebElement autumntogether;

    public void navigateToAutumnTogether(){
        this.autumntogether.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("autumn2022"));
    }

    @FindBy(xpath = ".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[3]/a")
    private WebElement myspring;

    public void navigateToMySpring(){
        this.myspring.click();
    }

    @FindBy(xpath = ".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[4]/a")
    private WebElement staywinter;

    public void navigateToStayWinter(){
        this.staywinter.click();
    }
}
