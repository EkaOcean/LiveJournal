package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProfilePageTest extends AbstractTest {

    @Test
    void changeJournalDescriptionTest(){
        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .loginIn("GreyKoala99","G12jhg562jj");
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

        new MainPage(getWebDriver()).goToAccountPage();
        new AccountPage(getWebDriver()).goToProfilePage();
        Assertions.assertTrue(getWebDriver().getTitle().contains("Заполните свой профиль"), "страница входа недоступна");

        new ProfilePage(getWebDriver())
                .setYourName("Екатерина")
                .setJournalTitle("Самый лучший в мире блог")
                .setJournalSubTitle("Блог с котиками и кошечками")
                .setSavechanges();
        Assertions.assertEquals("Заполните свой профиль",getWebDriver().getTitle(),"Не та страница");
    }
}
