package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTest1 {

    public static void main(String[] args) {

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

        //Thread.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();
    }
}

