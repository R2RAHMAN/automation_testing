package tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
    Browser browser = AqualityServices.getBrowser();

    @BeforeMethod
    public void setup() {
        browser.maximize();
        browser.goTo("https://www.accuweather.com/");
    }

    @AfterMethod
    public void tearDown() {
        browser.quit();
    }
}
