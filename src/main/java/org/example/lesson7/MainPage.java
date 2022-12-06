package org.example.lesson7;

import org.example.lesson6.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {

    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".s-header-item__link--login")
    private WebElement signIn;

    public void goToSingInPage(){
        signIn.click();
    }

    @FindBy(css = ".s-nav-item__name")
    private WebElement username;

    public void goToAccountPage(){
        this.username.click();
    }

    @FindBy(css = ".s-header-item__link--shop")
    private WebElement shop;

    public void goToShopPage(){
        this.shop.click();
    }

    @FindBy(css = ".s-header-item__link--235ideas")
    private WebElement idea;

    public void goToIdeaPage(){
        this.idea.click();
    }




    @FindBy(xpath = ".//a[contains(text(),'Новые лица')]")
    private WebElement newfaces;

    @FindBy(xpath = ".//a[contains(text(),'Медиа в ЖЖ')]")
    private WebElement media;

    @FindBy(xpath = ".//a[contains(text(),'#делобылоосенью')]")
    private WebElement autumn;

    @FindBy(xpath = ".//a[contains(text(),'путешествия')]")
    private WebElement travel;

    @FindBy(xpath = ".//a[contains(text(),'психология')]")
    private WebElement psychology;

    @FindBy(xpath = ".//a[contains(text(),'работа')]")
    private WebElement work;

    @FindBy(xpath = ".//a[contains(text(),'Еда')]")
    private WebElement food;

    @FindBy(xpath = ".//a[contains(text(),'дети')]")
    private WebElement children;

    @FindBy(xpath = ".//a[contains(text(),'дача')]")
    private WebElement summercottage;

    @FindBy(xpath = ".//a[contains(text(),'Кино')]")
    private WebElement movie;

    @FindBy(xpath = ".//a[contains(text(),'знаменитости')]")
    private WebElement celebrities;

    @FindBy(xpath = ".//a[contains(text(),'Ещё')]")
    private WebElement all;






    public void navigateToNewFaces(){
        this.newfaces.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("novye_lica"));
    }

    public void navigateToMedia(){
        this.media.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("media_v_zhzh"));
    }

    public void navigateToAutumn(){
        this.autumn.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("delo_bylo_osenyu"));
    }

    public void navigateToTravel(){
        this.travel.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("puteshestviya"));
    }

    public void navigateToPsychology(){
        this.psychology.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("psihologiya"));
    }

    public void navigateToWork(){
        this.work.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("rabota"));
    }

    public void navigateToFood(){
        this.food.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("eda"));
    }

    public void navigateToChildren(){
        this.children.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("deti"));
    }

    public void navigateToSummerCottage(){
        this.summercottage.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("dacha"));
    }

    public void navigateToMovie(){
        this.movie.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("kino"));
    }

    public void navigateToCelebrities(){
        this.celebrities.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("znamenitosti"));
    }

    public void navigateToAll(){
        this.all.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("all"));
    }

}