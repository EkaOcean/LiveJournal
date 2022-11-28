package org.example.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class LiveJournalTest extends AbstractTest {

    @Test
    void login() {

        Actions search = new Actions(getDriver());

        search.click(getDriver().findElement(By.cssSelector(".s-header-item__link--login")))
                .sendKeys(getDriver().findElement(By.id("user")),"GreyKoala99")
                .sendKeys(getDriver().findElement(By.id("lj_loginwidget_password")),"G12jhg562jj")
                .click(getDriver().findElement(By.cssSelector(".b-loginform-checkbox__control")))
                .click(getDriver().findElement(By.name("action:login")))
                .build()
                .perform();
        Assertions.assertTrue(getDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

    }

    @Test
    void siteButtonsTest (){


        WebElement webElement1 = getDriver().findElement(By.xpath(".//a[contains(text(),'Новые лица')]"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath(".//a[contains(text(),'Медиа в ЖЖ')]"));
        webElement2.click();

        WebElement webElement3 = getDriver().findElement(By.xpath(".//a[contains(text(),'#делобылоосенью')]"));
        webElement3.click();

        WebElement webElement4 = getDriver().findElement(By.xpath(".//a[contains(text(),'путешествия')]"));
        webElement4.click();

        Assertions.assertTrue(getDriver().getTitle().contains("о путешествиях"), "страница входа недоступна");

        WebElement webElement5 = getDriver().findElement(By.xpath(".//a[contains(text(),'психология')]"));
        webElement5.click();

        WebElement webElement6 = getDriver().findElement(By.xpath(".//a[contains(text(),'работа')]"));
        webElement6.click();

        Assertions.assertTrue(getDriver().getTitle().contains("про работу"), "страница входа недоступна");

        WebElement webElement7 = getDriver().findElement(By.xpath(".//a[contains(text(),'Еда')]"));
        webElement7.click();

        WebElement webElement8 = getDriver().findElement(By.xpath(".//a[contains(text(),'дети')]"));
        webElement8.click();

        WebElement webElement9 = getDriver().findElement(By.xpath(".//a[contains(text(),'дача')]"));
        webElement9.click();

        WebElement webElement10 = getDriver().findElement(By.xpath(".//a[contains(text(),'Кино')]"));
        webElement10.click();

        WebElement webElement11 = getDriver().findElement(By.xpath(".//a[contains(text(),'знаменитости')]"));
        webElement11.click();

        WebElement webElement12 = getDriver().findElement(By.xpath(".//a[contains(text(),'Ещё')]"));
        webElement12.click();

        Assertions.assertTrue(getDriver().getTitle().contains("Все категории"), "страница входа недоступна");

    }

    @Test
    void changeViewSettingsTest(){

        login();

        WebElement webElement1 = getDriver().findElement(By.cssSelector(".s-nav-item__name"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.cssSelector(".s-header-toggle__button-desktop"));
        webElement2.click();

        WebElement webElement3 = getDriver().findElement(By.linkText("Редактировать профиль"));
        webElement3.click();

        WebElement webElement4 = getDriver().findElement(By.linkText("настройки просмотра"));
        webElement4.click();

        Assertions.assertEquals("Настройки аккаунта",getDriver().getTitle(),"Не та страница");

        WebElement webElement5 = getDriver().findElement(By.id("LJ__Setting__TimeZone_timezone"));
        webElement5.click();

        WebElement webElement6 = getDriver().findElement(By.id("LJ__Setting__TimeZone_timezone"));
        webElement6.sendKeys("Europe/Moscow");

        WebElement webElement7 = getDriver().findElement(By.id("LJ__Setting__ImagePlaceholders_check1"));
        webElement7.click();

        WebElement webElement8 = getDriver().findElement(By.id("LJ__Setting__EmbedPlaceholders_check1"));
        webElement8.click();

        WebElement webElement9 = getDriver().findElement(By.id("LJ__Setting__EmailFormat_emailformat_plaintext"));
        webElement9.click();

        WebElement webElement10 = getDriver().findElement(By.id("LJ__Setting__Post2017_post2017"));
        webElement10.click();

        WebElement webElement11 = getDriver().findElement(By.id("LJ__Setting__MobAdaptive_cmobadv"));
        webElement11.click();

        WebElement webElement12 = getDriver().findElement(By.id("LJ__Setting__EndlessScroll_endscrl"));
        webElement12.click();

        WebElement webElement13 = getDriver().findElement(By.id("LJ__Setting__StyleMine_stylemine"));
        webElement13.click();

        WebElement webElement14 = getDriver().findElement(By.id("LJ__Setting__AdultContent_adultcontent"));
        webElement14.click();

        WebElement webElement15 = getDriver().findElement(By.id("LJ__Setting__ViewingAdultContent_viewingadultcontent"));
        webElement15.click();

        WebElement webElement16 = getDriver().findElement(By.id("LJ__Setting__SafeSearch_safesearch"));
        webElement16.click();

        WebElement webElement17 = getDriver().findElement(By.id("LJ__Setting__HideFriendsReposts_hidefriendsreposts"));
        webElement17.click();

        WebElement webElement18 = getDriver().findElement(By.id("LJ__Setting__TheEye_the_eye_show"));
        webElement18.click();

        WebElement webElement19 = getDriver().findElement(By.id("LJ__Setting__CyrillicServices_cyrillicservices"));
        webElement19.click();

        WebElement webElement20 = getDriver().findElement(By.id("LJ__Setting__LikesToComments_likes2comments"));
        webElement20.click();

        WebElement webElement21 = getDriver().findElement(By.cssSelector(".b-flatbutton"));
        webElement21.click();

        Assertions.assertEquals("Настройки аккаунта",getDriver().getTitle(),"Не та страница");

    }

        @Test
    void changeJournalDescriptionTest(){

        login();

        WebElement webElement1 = getDriver().findElement(By.cssSelector(".s-nav-item__name"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.cssSelector(".s-header-extra-menu-item--edit-inf span"));
        webElement2.click();

        Assertions.assertTrue(getDriver().getTitle().contains("Заполните свой профиль"), "страница входа недоступна");

        WebElement webElement3 = getDriver().findElement(By.id("username"));
        webElement3.clear();
        webElement3.sendKeys("Екатерина");

        WebElement webElement4 = getDriver().findElement(By.id("journaltitle"));
        webElement4.clear();
        webElement4.sendKeys("Самый лучший в мире блог");

        WebElement webElement5 = getDriver().findElement(By.id("journalsubtitle"));
        webElement5.clear();
        webElement5.sendKeys("Блог с котиками и кошечками");

        WebElement webElement6 = getDriver().findElement(By.name("tojournal"));
        webElement6.click();

        Assertions.assertEquals("Заполните свой профиль",getDriver().getTitle(),"Не та страница");
}

    @Test
    void shopButtonsTest (){

       // login();

        WebElement webElement1 = getDriver().findElement(By.cssSelector(".s-header-item__link--shop"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.linkText("Все стили"));
        webElement2.click();

        WebElement webElement3 = getDriver().findElement(By.linkText("Тёплые цвета"));
        webElement3.click();

        WebElement webElement4 = getDriver().findElement(By.linkText("Иллюстрированные"));
        webElement4.click();

        Assertions.assertTrue(getDriver().getTitle().contains("Стили журнала"), "страница входа недоступна");

        WebElement webElement5 = getDriver().findElement(By.linkText("Увлечения"));
        webElement5.click();

        WebElement webElement6 = getDriver().findElement(By.linkText("Запись"));
        webElement6.click();

        WebElement webElement7 = getDriver().findElement(By.linkText("Холодные цвета"));
        webElement7.click();

        Assertions.assertTrue(getDriver().getTitle().contains("Стили журнала"), "страница входа недоступна");

    }


    @Test
    void ideaButtonsTest (){

        login();

        WebElement webElement1 = getDriver().findElement(By.cssSelector(".s-header-item__link--235ideas"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath(".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[2]/a"));
        webElement2.click();

        WebElement webElement3 = getDriver().findElement(By.xpath(".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[2]/a"));
        webElement3.click();

        Assertions.assertTrue(getDriver().getTitle().contains("Чеклист автора"), "страница входа недоступна");

        WebElement webElement4 = getDriver().findElement(By.xpath(".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[3]/a"));
        webElement4.click();

        WebElement webElement5 = getDriver().findElement(By.xpath(".//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/ul/li[4]/a"));
        webElement5.click();

        Assertions.assertTrue(getDriver().getTitle().contains("Чеклист автора"), "страница входа недоступна");

    }
}
