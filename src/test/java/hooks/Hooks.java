package hooks;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static io.qameta.allure.Allure.step;


public class Hooks {
    private Browser browser= AqualityServices.getBrowser();

    @Before
    public void setup() {
        step("Open browser");
        browser = AqualityServices.getBrowser();
        step("Maximize browser window");
        browser.maximize();
        step("Navigate to the main page");
        browser.goTo("https://www.accuweather.com/");
    }

    @After
    public void tearDown() {
        if (browser != null) {
            step("Close browser");
            browser.quit();
        }
    }
}
