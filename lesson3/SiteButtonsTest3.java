package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SiteButtonsTest3 {

    public static void main (String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");


        WebElement webElement1 = driver.findElement(By.xpath(".//a[contains(text(),'Новые лица')]"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath(".//a[contains(text(),'Медиа в ЖЖ')]"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath(".//a[contains(text(),'#делобылоосенью')]"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath(".//a[contains(text(),'путешествия')]"));
        webElement4.click();

        WebElement webElement5 = driver.findElement(By.xpath(".//a[contains(text(),'психология')]"));
        webElement5.click();

        WebElement webElement6 = driver.findElement(By.xpath(".//a[contains(text(),'работа')]"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath(".//a[contains(text(),'Еда')]"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.xpath(".//a[contains(text(),'дети')]"));
        webElement8.click();

        WebElement webElement9 = driver.findElement(By.xpath(".//a[contains(text(),'дача')]"));
        webElement9.click();

        WebElement webElement10 = driver.findElement(By.xpath(".//a[contains(text(),'Кино')]"));
        webElement10.click();

        WebElement webElement11 = driver.findElement(By.xpath(".//a[contains(text(),'знаменитости')]"));
        webElement11.click();

        WebElement webElement12 = driver.findElement(By.xpath(".//a[contains(text(),'Ещё')]"));
        webElement12.click();

        //read.sleep(10000l);
        //Завершаем работу с ресурсом
        // driver.quit();
    }

}
