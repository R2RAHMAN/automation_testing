package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;


public class AddRemoveTest extends BaseTest {
    AddRemovePage addRemovePage = new AddRemovePage();

    @Test
    public void testAddRemoveElement() {
        mainPage.clickNavigationLink(MainPageNavigation.Add_Remove_Elements);
        addRemovePage.clickAddElementButton();
        Assert.assertTrue(addRemovePage.isDeleteElementButtonDisplayed(), "Delete Element button is not displayed");
        addRemovePage.clickDeleteElementButton();
        Assert.assertFalse(addRemovePage.isDeleteElementButtonExist(), "Delete Element button is still exist");
    }

}
