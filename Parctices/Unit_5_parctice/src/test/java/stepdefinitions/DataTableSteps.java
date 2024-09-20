package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DataTablesPage;
import utils.StringUtils;

import static io.qameta.allure.Allure.step;

public class DataTableSteps {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("The sum of the Due columns is {double}")
    public void checkSumOfColumn(double sum) {
        step("Check the sum of the Due columns is"+ sum);
        double actualSum = 0.0;
        for (String due : dataTablesPage.getFirstDueList()) {
            actualSum += StringUtils.getDoubleFromString(due);
        }
        Assert.assertEquals(actualSum, sum, "The sum of the Due columns is not correct");
    }
}
