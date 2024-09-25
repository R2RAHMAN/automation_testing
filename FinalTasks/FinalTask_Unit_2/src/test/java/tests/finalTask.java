package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;
import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class finalTask {

  private WebDriver driver;
  protected WebDriverWait wait;
  protected final int MAX_WAIT = 60; // Increase max wait time
  protected final String RELATIVE_RESOURCE_PATH = "src/test/resources/";
  private final String FILE_NAME = "Albert_Einstein.pdf";
  private final String FILE_PATH = RELATIVE_RESOURCE_PATH + FILE_NAME;
  private final File downloadedFile = new File(FILE_PATH);

  @BeforeMethod
  public void setUp() {
    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
    chromePrefs.put("download.default_directory", new File(RELATIVE_RESOURCE_PATH).getAbsolutePath());
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", chromePrefs);
    driver = new ChromeDriver(options);
    driver.get("https://www.wikipedia.org/");
    driver.manage().window().fullscreen();
    wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
  }

  @AfterMethod
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void testWikipediaSearch() throws InterruptedException {
    WebElement searchInput = driver.findElement(By.name("search"));
    searchInput.sendKeys("Albert Einstein");
    searchInput.submit();
    WebElement toolsMenu = driver.findElement(By.xpath("//*[@id=\"vector-page-tools-dropdown-checkbox\"]"));
    toolsMenu.click();
    WebElement downloadAsPDF = driver.findElement(By.xpath("//*[@id=\"coll-download-as-rl\"]/a/span"));
    downloadAsPDF.click();
    WebElement downloadButton = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/form/div/span/span/button"));
    downloadButton.click();
    Assert.assertTrue(isFileDownloaded(downloadedFile), "The file was not downloaded successfully.");
  }

  private boolean isFileDownloaded(File file) {
    try {
      Awaitility.await().atMost(60, TimeUnit.SECONDS).until(file::exists);
    } catch (ConditionTimeoutException exception) {
      return false;
    }
    return true;
  }
}
