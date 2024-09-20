package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class JavaScriptAlertsPage extends Form {
    private static final String PAGE_NAME = "JavaScript Alerts";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By clickForJsAlertButton = By.xpath("//button[@onclick='jsAlert()']");
    private final By clickForJsPromptButton = By.xpath("//button[@onclick='jsPrompt()']");
    private final By resultText = By.id("result");
    private final By successMessage = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You successfully clicked an alert"));
    private final IButton clickForJsAlertBtn = elementFactory.getButton(clickForJsAlertButton, "Click for JS alert");
    private final IButton clickForJsPromptBtn = elementFactory.getButton(clickForJsPromptButton, "Click for JS prompt");
    private final ILabel successLbl = elementFactory.getLabel(successMessage, "Success");
    private final ILabel resultLbl = elementFactory.getLabel(resultText, "Result");

    public JavaScriptAlertsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickForJsAlertBtn() {
        clickForJsAlertBtn.click();
    }
    public void clickForJsPromptBtn() {
        clickForJsPromptBtn.click();
    }
    public boolean isSuccessLabelDisplayed() {
        return successLbl.state().isDisplayed();
    }
    public String getResultText() {
        return resultLbl.getText();
    }
}
