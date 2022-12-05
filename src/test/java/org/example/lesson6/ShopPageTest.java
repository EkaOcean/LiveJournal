package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ShopPageTest extends AbstractTest {

    @Test
    void shopJournalStylesButtonsTest (){

        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .loginIn("GreyKoala99","G12jhg562jj");
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

        new MainPage(getWebDriver()).goToShopPage();
        Assertions.assertTrue(getWebDriver().getTitle().contains("Магазин"), "страница входа недоступна");

        new  ShopPage(getWebDriver()).navigateToAllStyles();
        new  ShopPage(getWebDriver()).navigateToWarmColorsStyle();
        new  ShopPage(getWebDriver()).navigateToIllustratedStyle();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Стили журнала"), "страница входа недоступна");

        new  ShopPage(getWebDriver()).navigateToHobbiesStyle();
        new  ShopPage(getWebDriver()).navigateToWritingStyle();
        new  ShopPage(getWebDriver()).navigateToCoolColorsStyle();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Стили журнала"), "страница входа недоступна");
    }

}
