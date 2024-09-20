package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Then("The main page is opened")
    public void i_open_the_main_page() {
        step("Open the main page");
        mainPage.openMainPage();
    }

    @When("I click on search field")
    public void iClickOnSearchField() {
        step("Click on search field");
        mainPage.clickSearchButton();
    }

    @When("I input {string} in the search field")
    public void iInputInTheSearchField(String cityName) {
        step("Input city name in the search field");
        mainPage.searchCity(cityName);
    }

    @Then("the search results list is displayed")
    public void theSearchResultsListIsDisplayed() {
        step("Check that search results list is displayed");
        Assert.assertTrue(mainPage.isSuggestionsDisplayed(), "Search results list is not displayed");
    }

    @When("I click on the first search result")
    public void iClickOnTheFirstSearchResult() {
        step("Click on the first search result");
        mainPage.clickFirstSuggestion();
    }
}