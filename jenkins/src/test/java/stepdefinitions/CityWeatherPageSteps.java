package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CityWeatherPage;

import static io.qameta.allure.Allure.step;

public class CityWeatherPageSteps {
    CityWeatherPage cityWeatherPage = new CityWeatherPage();

    @Then("the city weather page header contains city name {string}")
    public void theCityWeatherPageHeaderContainsCityName(String cityName) {
        step("Check that city weather page header contains city name");
        String header = cityWeatherPage.getCityName();
        Assert.assertTrue(header.contains(cityName), "City name is not present in the header");
    }

    @Then("I print {string}")
    public void iPrint(String arg0) {
        step("Print " + arg0);
        System.out.println(arg0);
    }

    @Then("I print {int}")
    public void iPrint(int number) {
        step("Print " + number);
        System.out.println(number);

    }
}
