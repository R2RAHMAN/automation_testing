package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static aquality.selenium.browser.AqualityServices.getElementFactory;

public class CityWeatherPage extends Form {
    private ILabel lblCityHeader = null;

    public CityWeatherPage() {
        super(By.xpath("//div[contains(@class, 'city-weather-page')]"), "City Weather Page");
    }

    public void backToLandingPage() {
        getBrowser().goBack();
    }

    public String getCityName() {

        lblCityHeader = getElementFactory().getLabel(By.className("header-loc"), "City Header");
        String cityName = lblCityHeader.getText();
        lblCityHeader = null;
        return cityName;
    }
}
