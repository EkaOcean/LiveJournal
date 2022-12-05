package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class IdeaPageTest extends AbstractTest{

    @Test
    void ideaButtonsTest (){

        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .loginIn("GreyKoala99","G12jhg562jj");
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

        new MainPage(getWebDriver()).goToIdeaPage();
        Assertions.assertTrue(getWebDriver().getTitle().contains("Чеклист"), "страница входа недоступна");

        new  IdeaPage(getWebDriver()).openMoreMenu();
        new  IdeaPage(getWebDriver()).navigateToAutumnTogether();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Чеклист автора"), "страница входа недоступна");

        new  IdeaPage(getWebDriver()).navigateToMySpring();

        new  IdeaPage(getWebDriver()).navigateToStayWinter();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Чеклист автора"), "страница входа недоступна");
    }
}
