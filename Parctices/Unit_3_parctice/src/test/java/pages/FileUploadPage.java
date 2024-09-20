package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class FileUploadPage  extends Form {
    private final static String NAME = "File Upload";
    private final By ChooseFile = By.id("file-upload");
    private final By FileSubmit = By.id("file-submit");
    private ITextBox fileNameInput = AqualityServices.getElementFactory().getTextBox(By.id("file-upload"), "File name input");
    private IButton fileSubmitBtn = AqualityServices.getElementFactory().getButton(By.id("file-submit"), "File submit button");

    public FileUploadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }
    public void uploadFile(String filename) {
        fileNameInput.clearAndType(filename);
    }
    public void clickUploadBtn() {
        fileSubmitBtn.click();
    }

}
