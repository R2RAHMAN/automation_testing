package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CityWeatherPage;
import pages.MainPage;

import static io.qameta.allure.Allure.step;


public class WeatherTest extends BaseTest {
    private final MainPage mainPage = new MainPage();
    private final CityWeatherPage cityWeatherPage = new CityWeatherPage();

    @Test
    public void searchCity() {
        step("Main page open & search");
        mainPage.searchCity("New York");
        Assert.assertTrue(mainPage.isSuggestionsDisplayed(), "Suggestions list should be displayed");
        step("Click on First Suggestion");
        mainPage.clickFirstSuggestion();
        String cityName = cityWeatherPage.getCityName();
        Assert.assertTrue(cityName.contains("New York"), "City weather page header should contain 'New York'");
    }
}
