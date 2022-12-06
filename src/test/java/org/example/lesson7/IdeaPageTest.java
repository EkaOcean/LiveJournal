package org.example.lesson7;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.example.lesson6.AbstractTest;
import org.example.lesson6.IdeaPage;
import org.example.lesson6.LoginPage;
import org.example.lesson6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IdeaPageTest extends AbstractTest {

    @Test
    @DisplayName("Кнопки меню Идей")
    @Description("Проверка работы кнопок меню Идей")
    @Severity(SeverityLevel.MINOR)
    void ideaButtonsTest (){

        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .loginIn("GreyKoala99","G12jhg562jj");
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

        new MainPage(getWebDriver()).goToIdeaPage();
        Assertions.assertTrue(getWebDriver().getTitle().contains("Чеклист"), "страница входа недоступна");

        new IdeaPage(getWebDriver()).openMoreMenu();
        new  IdeaPage(getWebDriver()).navigateToAutumnTogether();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Чеклист автора"), "страница входа недоступна");

        new  IdeaPage(getWebDriver()).navigateToMySpring();

        new  IdeaPage(getWebDriver()).navigateToStayWinter();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Чеклист автора"), "страница входа недоступна");
    }
}
