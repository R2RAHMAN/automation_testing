package stepdefinitions;

import io.cucumber.java.en.Then;
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
}
