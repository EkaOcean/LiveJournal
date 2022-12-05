package org.example.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ViewSettingsPageTest extends AbstractTest {

    @Test
    void changeViewSettingsTest() {

        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .loginIn("GreyKoala99", "G12jhg562jj");
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");

        new MainPage(getWebDriver()).goToAccountPage();
        new AccountPage(getWebDriver()).openAndMoreMenu();
        new AccountPage(getWebDriver()).goToEditProfile();

        Assertions.assertTrue(getWebDriver().getTitle().contains("Редактор профиля"), "страница входа недоступна");

        new EditProfilePage(getWebDriver()).goToViewSettingsPage();

        Assertions.assertEquals("Настройки аккаунта",getWebDriver().getTitle(),"Не та страница");

        new ViewSettingsPage(getWebDriver()).changeTimeZone("Europe/Moscow");
        new ViewSettingsPage(getWebDriver()).imageReplacement();
        new ViewSettingsPage(getWebDriver()).videoReplacement();
        new ViewSettingsPage(getWebDriver()).setLettersFormat();
        new ViewSettingsPage(getWebDriver()).setCurrentEditor();
        new ViewSettingsPage(getWebDriver()).setAdaptationForMobile();
        new ViewSettingsPage(getWebDriver()).setPostPage();
        new ViewSettingsPage(getWebDriver()).setCommentsPage();
        new ViewSettingsPage(getWebDriver()).setAdultsContent();
        new ViewSettingsPage(getWebDriver()).setViewingAdultsContent();
        new ViewSettingsPage(getWebDriver()).setSafeSearch();
        new ViewSettingsPage(getWebDriver()).setFriendsReposts();
        new ViewSettingsPage(getWebDriver()).setEyesShow();
        new ViewSettingsPage(getWebDriver()).setCyrillicServices();
        new ViewSettingsPage(getWebDriver()).setLikes2Comments();
        new ViewSettingsPage(getWebDriver()).saveSettingPage();

        Assertions.assertEquals("Настройки аккаунта",getWebDriver().getTitle(),"Не та страница");
    }

}
