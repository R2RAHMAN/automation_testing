package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class UploadedFilePage extends Form {
    private static final String NAME = "file Uploaded";
    private final By uploadedFile = By.id("uploaded-files");
    private final ILabel uploadedFileLabel = AqualityServices.getElementFactory().getLabel(uploadedFile, "Uploaded file label");

    public UploadedFilePage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, NAME)), NAME);
    }
    public String getUploadedFileName() {
        return uploadedFileLabel.getText();
    }
}
