package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WaitForElement;

public class DynamicControlsPage extends TheInternetHomePage {

    String EXPECTED_CHECKBOX_NOT_VISIBLE_MESSAGE = "It's gone!";

    @FindBy (css = "#checkbox-example > button")
    WebElement removeButton;

    @FindBy (css = "#checkbox > input")
    WebElement aCheckbox;

    @FindBy (css = "#checkbox-example #message")
    WebElement aCheckboxItsGoneMessage;

    @FindBy (css = "#checkbox-example > #loading")
    WebElement loadingBar;

    public void clickRemoveButton(){
        removeButton.click();
    }

    public void waitForLoadingMessageToDisappear(){
        new WaitForElement().waitForElementInvisibility(driver,loadingBar);
    }

    public boolean isCheckboxMessagePresentAndItsGone(){
        return aCheckboxItsGoneMessage.isDisplayed() &&
                aCheckboxItsGoneMessage.getText().contentEquals(EXPECTED_CHECKBOX_NOT_VISIBLE_MESSAGE) ;
    }

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }
}
