package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;


public class CityWeatherPage extends Form {

    public CityWeatherPage() {
        super(By.xpath("//div[contains(@class, 'city-weather-page')]"), "City Weather Page");
    }


    public String getCityName() {

        ILabel lblCityHeader = getElementFactory().getLabel(By.className("header-loc"), "City Header");
        return lblCityHeader.getText();
    }
}
