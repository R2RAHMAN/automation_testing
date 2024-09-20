package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import org.openqa.selenium.By;

public class AddRemovePage {
    private final IButton addElementButton = AqualityServices.getElementFactory().getButton(new By.ByXPath("//button[@onclick=\"addElement()\"]"), "Add Element button");

    private final IButton deleteElementButton = AqualityServices.getElementFactory().getButton(new By.ByXPath("//button[@onclick='deleteElement()']"), "Delete Element button");


    public void clickAddElementButton(){
        addElementButton.click();
    }
    public void clickDeleteElementButton(){
        deleteElementButton.click();
    }
    public boolean isDeleteElementButtonDisplayed(){
        return deleteElementButton.state().isDisplayed();
    }

    public boolean isDeleteElementButtonExist(){
        return deleteElementButton.state().isExist();
    }
}
