package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static io.qameta.allure.Allure.step;

public class BaseTest {
    Browser browser = AqualityServices.getBrowser();

    @BeforeMethod
    public void setup() {
        step("Browser open & maximize");
        browser.maximize();
        step("Open Url");
        browser.goTo("https://www.accuweather.com/");
    }

    @AfterMethod
    public void tearDown() {
        step("Browser close");
        browser.quit();
    }
}
