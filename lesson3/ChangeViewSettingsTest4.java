package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChangeViewSettingsTest4 {

    public static void main (String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");


        WebElement webElement1 = driver.findElement(By.cssSelector(".s-header-item__link--login"));
        WebElement webElement2 = driver.findElement(By.id("user"));
        WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
        WebElement webElement4 = driver.findElement(By.cssSelector(".b-loginform-checkbox__control"));
        WebElement webElement5 = driver.findElement(By.name("action:login"));

        webElement1.click();
        webElement2.sendKeys("GreyKoala99");
        webElement3.sendKeys("G12jhg562jj");
        webElement4.click();
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.cssSelector(".s-nav-item__name"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.cssSelector(".s-header-toggle__button-desktop"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.linkText("Редактировать профиль"));
        webElement8.click();

        WebElement webElement9 = driver.findElement(By.linkText("настройки просмотра"));
        webElement9.click();

        WebElement webElement10 = driver.findElement(By.id("LJ__Setting__TimeZone_timezone"));
        webElement10.click();

        WebElement webElement11 = driver.findElement(By.id("LJ__Setting__TimeZone_timezone"));
        webElement11.sendKeys("Europe/Moscow");

        WebElement webElement12 = driver.findElement(By.id("LJ__Setting__ImagePlaceholders_check1"));
        webElement12.click();

        WebElement webElement13 = driver.findElement(By.id("LJ__Setting__EmbedPlaceholders_check1"));
        webElement13.click();

        WebElement webElement14 = driver.findElement(By.id("LJ__Setting__EmailFormat_emailformat_plaintext"));
        webElement14.click();

        WebElement webElement15 = driver.findElement(By.id("LJ__Setting__Post2017_post2017"));
        webElement15.click();

        WebElement webElement16 = driver.findElement(By.id("LJ__Setting__MobAdaptive_cmobadv"));
        webElement16.click();

        WebElement webElement17 = driver.findElement(By.id("LJ__Setting__EndlessScroll_endscrl"));
        webElement17.click();

        WebElement webElement18 = driver.findElement(By.id("LJ__Setting__StyleMine_stylemine"));
        webElement18.click();

        WebElement webElement19 = driver.findElement(By.id("LJ__Setting__AdultContent_adultcontent"));
        webElement19.click();

        WebElement webElement20 = driver.findElement(By.id("LJ__Setting__ViewingAdultContent_viewingadultcontent"));
        webElement20.click();

        WebElement webElement21 = driver.findElement(By.id("LJ__Setting__SafeSearch_safesearch"));
        webElement21.click();

        WebElement webElement22 = driver.findElement(By.id("LJ__Setting__HideFriendsReposts_hidefriendsreposts"));
        webElement22.click();

        WebElement webElement23 = driver.findElement(By.id("LJ__Setting__TheEye_the_eye_show"));
        webElement23.click();

        WebElement webElement24 = driver.findElement(By.id("LJ__Setting__CyrillicServices_cyrillicservices"));
        webElement24.click();

        WebElement webElement25 = driver.findElement(By.id("LJ__Setting__LikesToComments_likes2comments"));
        webElement25.click();

        WebElement webElement26 = driver.findElement(By.cssSelector(".b-flatbutton"));
        webElement26.click();

        //read.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();
    }
}
