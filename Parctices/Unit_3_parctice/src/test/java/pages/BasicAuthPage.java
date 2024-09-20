package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class BasicAuthPage extends Form {
    private static final String NAME = "Basic Auth";
    private final By successMessage = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "Congratulations! You must have the proper credentials."));
    private ILabel successLbl = AqualityServices.getElementFactory().getLabel(By.xpath("//*[@id=\"content\"]/div/p"), "Success");
    public BasicAuthPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }

    public boolean isSuccessMsgDisplayed() {
        return successLbl.state().isDisplayed();
    }
}
