package org.example.lesson7;
import org.example.lesson6.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage extends AbstractPage {

    public ShopPage(WebDriver driver){
        super(driver);
    }

    @FindBy(linkText = "Все стили")
    private WebElement allstyles;

    public void navigateToAllStyles(){
        this.allstyles.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("?cat=all"));
    }

    @FindBy(linkText = "Тёплые цвета")
    private WebElement warmcolors;

    public void navigateToWarmColorsStyle(){
        this.warmcolors.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("?cat=warm"));
    }

    @FindBy(linkText = "Иллюстрированные")
    private WebElement illustrated;

    public void navigateToIllustratedStyle(){
        this.illustrated.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("?cat=illustrated"));
    }

    @FindBy(linkText = "Увлечения")
    private WebElement hobbies;

    public void navigateToHobbiesStyle(){
        this.hobbies.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("?cat=hobbies"));
    }

    @FindBy(linkText = "Запись")
    private WebElement writing;

    public void navigateToWritingStyle(){
        this.writing.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("?cat=writing"));
    }

    @FindBy(linkText = "Холодные цвета")
    private WebElement coolcolors;

    public void navigateToCoolColorsStyle(){
        this.coolcolors.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("?cat=cool"));
    }

}
