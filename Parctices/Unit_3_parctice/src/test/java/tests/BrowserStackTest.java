package tests;
import aquality.selenium.browser.AqualityServices;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserStackTest {
    @BeforeMethod
    public void setup() {
        AqualityServices.getBrowser().goTo("https://www.example.com");
    }

    @Test
    public void testTitle() {
        String pageTitle = AqualityServices.getBrowser().getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains("Example Domain"), "Page title is not as expected.");
    }

    @AfterMethod
    public void teardown() {
        AqualityServices.getBrowser().quit();
    }
}
