package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExamTest {
    private WebDriver driver;
    protected WebDriverWait wait;
    protected final int MAX_WAIT = 60;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://the-internet.herokuapp.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void test1(){
        WebElement jsAlertBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[29]/a"));
        jsAlertBtn.click();
        WebElement jsPromptBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        Assert.assertTrue(jsPromptBtn.isDisplayed(),"The page is not open");
        jsPromptBtn.click();
        Alert alert = driver.switchTo().alert();
        String actiualString ="random text";
        alert.sendKeys(actiualString);
        alert.accept();
        WebElement resultText = driver.findElement(By.id("result"));
        String revivingText = resultText.getText();
        Assert.assertTrue(revivingText.contains(actiualString),"these are not same");
    }
}
