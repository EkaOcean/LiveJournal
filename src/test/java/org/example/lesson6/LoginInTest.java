package org.example.lesson6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginInTest extends AbstractTest {

    @Test
    void loginIn(){
        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .setLogin("GreyKoala99")
                .setPassword("G12jhg562jj")
                .loginIn();
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

    }

}