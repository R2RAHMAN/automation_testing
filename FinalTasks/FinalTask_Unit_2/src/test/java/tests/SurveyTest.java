package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SurveyTest {
    private WebDriver driver;
    protected WebDriverWait wait;
    protected final int MAX_WAIT = 60;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://demoqa.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void survey1() {

        List<WebElement> cards = driver.findElements(By.xpath("//*[@class='card mt-4 top-card']"));
        int number_of_cards = cards.size();
        Assert.assertTrue(number_of_cards > 5, "we didn't got the expected results.");

    }

    @Test
    public void survey2() {

        WebElement alertFrameWin = driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertFrameWin);
        alertFrameWin.click();

        WebElement browserWin = driver.findElement(By.xpath("//*[text()='Browser Windows']"));
        browserWin.click();

        WebElement newTabBtn = driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
        Assert.assertTrue(newTabBtn.isDisplayed(), "The New Tab button should be here");
        newTabBtn.click();

        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;

            }
        }
        String expectedText = "This is a sample page";
        String actualText = driver.findElement(By.id("sampleHeading")).getText();
        Assert.assertEquals(actualText, expectedText, " A New tab was not opened");
    }
}
