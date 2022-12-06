package org.example.lesson7;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.lesson6.AbstractTest;
import org.example.lesson6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MainPageTest extends AbstractTest {

    @Test
    @DisplayName("Кнопка Новые лица")
    @Description("Проверка работы кнопки Новые лица")
    @Severity(SeverityLevel.NORMAL)
    void clickToNewFaces(){
        new MainPage(getWebDriver()).navigateToNewFaces();
        Assertions.assertEquals("https://www.livejournal.com/media/novye_lica/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Медиа в ЖЖ")
    @Description("Проверка работы кнопки Медиа в ЖЖ")
    @Severity(SeverityLevel.NORMAL)
    void clickToMedia(){
        new MainPage(getWebDriver()).navigateToMedia();
        Assertions.assertEquals("https://www.livejournal.com/media/media_v_zhzh/",getWebDriver().getCurrentUrl());
    }

/*    @Test
    @DisplayName("Кнопка Медиа в ЖЖ")
    @Description("Проверка работы кнопки Медиа в ЖЖ")
    void clickToAutumn(){
        new MainPage(getWebDriver()).navigateToAutumn();
        Assertions.assertEquals("https://www.livejournal.com/category/delo_bylo_osenyu/",getWebDriver().getCurrentUrl());
    }*/

    @Test
    @DisplayName("Кнопка Путешествия")
    @Description("Проверка работы кнопки Путешествия")
    @Severity(SeverityLevel.NORMAL)
    void clickToTravel(){
        new MainPage(getWebDriver()).navigateToTravel();
        Assertions.assertEquals("https://www.livejournal.com/category/puteshestviya/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Психология")
    @Description("Проверка работы кнопки Психология")
    @Severity(SeverityLevel.NORMAL)
    void clickToPsychology(){
        new MainPage(getWebDriver()).navigateToPsychology();
        Assertions.assertEquals("https://www.livejournal.com/category/psihologiya/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Работа")
    @Description("Проверка работы кнопки Работа")
    @Severity(SeverityLevel.NORMAL)
    void clickToWork(){
        new MainPage(getWebDriver()).navigateToWork();
        Assertions.assertEquals("https://www.livejournal.com/category/rabota/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Еда")
    @Description("Проверка работы кнопки Еда")
    @Severity(SeverityLevel.NORMAL)
    void clickToFood(){
        new MainPage(getWebDriver()).navigateToFood();
        Assertions.assertEquals("https://www.livejournal.com/category/eda/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Дети")
    @Description("Проверка работы кнопки Дети")
    @Severity(SeverityLevel.NORMAL)
    void clickToChildren(){
        new MainPage(getWebDriver()).navigateToChildren();
        Assertions.assertEquals("https://www.livejournal.com/category/deti/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Дача")
    @Description("Проверка работы кнопки Дача")
    @Severity(SeverityLevel.NORMAL)
    void clickToSummerCottage(){
        new MainPage(getWebDriver()).navigateToSummerCottage();
        Assertions.assertEquals("https://www.livejournal.com/category/dacha/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Кино")
    @Description("Проверка работы кнопки Кино")
    @Severity(SeverityLevel.NORMAL)
    void clickToMovie(){
        new MainPage(getWebDriver()).navigateToMovie();
        Assertions.assertEquals("https://www.livejournal.com/category/kino/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Знаменитости")
    @Description("Проверка работы кнопки Знаменитости")
    @Severity(SeverityLevel.NORMAL)
    void clickToCelebrities(){
        new MainPage(getWebDriver()).navigateToCelebrities();
        Assertions.assertEquals("https://www.livejournal.com/category/znamenitosti/",getWebDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Кнопка Ещё")
    @Description("Проверка работы кнопки Ещё")
    @Severity(SeverityLevel.NORMAL)
    void clickToAll(){
        new MainPage(getWebDriver()).navigateToAll();
        Assertions.assertEquals("https://www.livejournal.com/category/all/",getWebDriver().getCurrentUrl());
    }

}