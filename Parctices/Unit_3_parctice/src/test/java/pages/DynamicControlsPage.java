package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class DynamicControlsPage extends Form {
    private static final String NAME = "Dynamic Controls";
    private IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By ENABLE = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Enable"));
    private final By INPUT = By.xpath("//*[@id='input-example']//input");
    private IButton enableBtn = elementFactory.getButton(ENABLE, "Enable");
    private ITextBox inputField = elementFactory.getTextBox(INPUT, "Input field");
    public DynamicControlsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }
    public void clickEnableBtn() {
        enableBtn.click();
    }
    public boolean isInputFieldEnabled() {
        return inputField.state().waitForEnabled();
    }
    public void inputText(String text) {
        inputField.clearAndTypeSecret(text);
    }
    public String getInputFieldValue() {
        return inputField.getValue();
    }
}