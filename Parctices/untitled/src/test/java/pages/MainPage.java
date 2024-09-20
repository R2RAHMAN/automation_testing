package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.List;

public class MainPage extends Form {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ITextBox txtSearch = elementFactory.getTextBox(By.className("search-input"), "Search Input");
    private final IButton firstSuggestion = elementFactory.getButton(By.xpath("/html/body/div/div[1]/div[3]/div/div[1]/div[2]/div[2]/div[1]"), "First Suggestion");
    private final List<IButton> elements = elementFactory.findElements(By.className("results-container"), ElementType.BUTTON);

    public MainPage() {
        super(By.xpath("//div[contains(@class, 'main-page')]"), "Main Page");
    }

    public void openMainPage() {
         this.state().waitForDisplayed();
    }

    public void clickSearchButton(){
        txtSearch.click();
    }

    public void searchCity(String cityName) {
        txtSearch.clearAndType(cityName);
    }

    public boolean isSuggestionsDisplayed() {
        return elements.stream().allMatch(button -> button.state().isDisplayed());
    }

    public void clickFirstSuggestion() {
        firstSuggestion.click();
    }
}
