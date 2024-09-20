package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import pages.FileUploadPage;
import pages.UploadedFilePage;
import utils.SettingsTestData;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest {
    private FileUploadPage fileUploadPage = new FileUploadPage();
    private UploadedFilePage uploadedFilePage = new UploadedFilePage();
    private final String fileName = SettingsTestData.getFileData().getUploadFile();
    private final String filePath = SettingsTestData.TEST_DATA_PATH + fileName;

    @Test
    public void fileUploadTest() {
        mainPage.clickNavigationLink(MainPageNavigation.FILE_UPLOAD);
        fileUploadPage.uploadFile(new File(filePath).getAbsolutePath());
        fileUploadPage.clickUploadBtn();
        Assert.assertEquals(uploadedFilePage.getUploadedFileName(), fileName, "Uploaded file name is not as expected");
    }
}
