package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.JavaScriptAlertsPage;

import static io.qameta.allure.Allure.step;

public class JavaScriptAlertPageSteps {
    JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage();
    @When("I generate alert on the JavaScript Alert page")
    public void generateJsAlert() {
        step("Generate alert on the JavaScript Alert page");
        javaScriptAlertsPage.clickForJsAlertBtn();
    }
    @Then("success message is displayed on the page")
    public void acceptJsAlert() {
        step("Check the success message is displayed on the page");
        Assert.assertTrue(javaScriptAlertsPage.isSuccessLabelDisplayed(), "Success message is not displayed");
    }
}
