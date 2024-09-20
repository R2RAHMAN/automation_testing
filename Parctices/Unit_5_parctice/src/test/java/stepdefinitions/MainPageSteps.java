package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Given("I go to {string} on the main page")
    public void i_go_to_on_the_main_page(String page) {
        step("Go to " + page + " on the main page");
        mainPage.clickNavigationLink(page);
    }
}
