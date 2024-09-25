package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CityWeatherPage;
import pages.MainPage;



public class WeatherTest extends BaseTest {
    private final MainPage mainPage = new MainPage();
    private final CityWeatherPage cityWeatherPage = new CityWeatherPage();

    @Test
    public void searchCity() {
        mainPage.searchCity("New York");
        Assert.assertTrue(mainPage.isSuggestionsDisplayed(), "Suggestions list should be displayed");
        mainPage.clickFirstSuggestion();
        String cityName = cityWeatherPage.getCityName();
        Assert.assertTrue(cityName.contains("New York"), "City weather page header should contain 'New York'");
    }
}
