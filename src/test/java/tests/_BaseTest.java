package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class _BaseTest {

    @BeforeEach
    public void beforeEach() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());

    }

    @AfterEach
    public void afterEach() {
        SelenideLogger.removeListener("allure");
        closeWebDriver();
    }

    @AfterEach
    public void clearCookies() {
        Selenide.clearBrowserCookies();
    }


}
