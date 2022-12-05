package org.example.lesson6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class MainPageTest extends AbstractTest {

    @Test
    void clickToNewFaces(){
        new MainPage(getWebDriver()).navigateToNewFaces();
        Assertions.assertEquals("https://www.livejournal.com/media/novye_lica/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToMedia(){
        new MainPage(getWebDriver()).navigateToMedia();
        Assertions.assertEquals("https://www.livejournal.com/media/media_v_zhzh/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToAutumn(){
        new MainPage(getWebDriver()).navigateToAutumn();
        Assertions.assertEquals("https://www.livejournal.com/category/delo_bylo_osenyu/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToTravel(){
        new MainPage(getWebDriver()).navigateToTravel();
        Assertions.assertEquals("https://www.livejournal.com/category/puteshestviya/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToPsychology(){
        new MainPage(getWebDriver()).navigateToPsychology();
        Assertions.assertEquals("https://www.livejournal.com/category/psihologiya/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToWork(){
        new MainPage(getWebDriver()).navigateToWork();
        Assertions.assertEquals("https://www.livejournal.com/category/rabota/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToFood(){
        new MainPage(getWebDriver()).navigateToFood();
        Assertions.assertEquals("https://www.livejournal.com/category/eda/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToChildren(){
        new MainPage(getWebDriver()).navigateToChildren();
        Assertions.assertEquals("https://www.livejournal.com/category/deti/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToSummerCottage(){
        new MainPage(getWebDriver()).navigateToSummerCottage();
        Assertions.assertEquals("https://www.livejournal.com/category/dacha/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToMovie(){
        new MainPage(getWebDriver()).navigateToMovie();
        Assertions.assertEquals("https://www.livejournal.com/category/kino/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToCelebrities(){
        new MainPage(getWebDriver()).navigateToCelebrities();
        Assertions.assertEquals("https://www.livejournal.com/category/znamenitosti/",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToAll(){
        new MainPage(getWebDriver()).navigateToAll();
        Assertions.assertEquals("https://www.livejournal.com/category/all/",getWebDriver().getCurrentUrl());
    }

}