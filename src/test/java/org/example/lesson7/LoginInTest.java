package org.example.lesson7;

import io.qameta.allure.*;
import org.example.lesson6.AbstractTest;
import org.example.lesson6.LoginPage;
import org.example.lesson6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class LoginInTest extends AbstractTest {

    @Test
    @DisplayName("Авторизация на сайте")
    @Description("Проверка выполнения авторизации")
    @Severity(SeverityLevel.CRITICAL)
    void loginIn(){
        new MainPage(getWebDriver()).goToSingInPage();
        new LoginPage(getWebDriver())
                .setLogin("GreyKoala99")
                .setPassword("G12jhg562jj")
                .loginIn();
        Assertions.assertTrue(getWebDriver().getTitle().contains("ЖЖ"), "страница входа недоступна");


    }

    void testFalse() throws InterruptedException, IOException {
        Thread.sleep(1000);
        File file = MyUtils.makeScreenshot(getWebDriver(),"failure- org.example.livejournal.LoginInTest.testFalse" + System.currentTimeMillis() + ".png");
        saveScreenshot(Files.readAllBytes(file.toPath()));
        Assertions.assertTrue(true);
    }

    @Step("Степ 1")
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

}