package org.example.lesson7;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.lesson6.AbstractTest;
import org.example.lesson6.LoginPage;
import org.example.lesson6.MainPage;
import org.example.lesson6.ShopPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShopPageTest extends AbstractTest {

    @Test
    @DisplayName("Кнопки стилей журнала")
    @Description("Проверка работы кнопок выбора стилей журнала")
    @Severity(SeverityLevel.MINOR)
    void shopJournalStylesButtonsTest (){

        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .loginIn("GreyKoala99","G12jhg562jj");
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

        new MainPage(getWebDriver()).goToShopPage();
        Assertions.assertTrue(getWebDriver().getTitle().contains("Магазин"), "страница входа недоступна");

        new ShopPage(getWebDriver()).navigateToAllStyles();
        new  ShopPage(getWebDriver()).navigateToWarmColorsStyle();
        new  ShopPage(getWebDriver()).navigateToIllustratedStyle();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Стили журнала"), "страница входа недоступна");

        new  ShopPage(getWebDriver()).navigateToHobbiesStyle();
        new  ShopPage(getWebDriver()).navigateToWritingStyle();
        new  ShopPage(getWebDriver()).navigateToCoolColorsStyle();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Стили журнала"), "страница входа недоступна");
    }

}
