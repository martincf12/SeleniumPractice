package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControlsPage;
import pages.TheInternetHomePage;

public class DynamicControlsTest extends BaseTest{

    @Test
    public void dynamicControls(){
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        DynamicControlsPage dynamicControlsPage = theInternetHomePage.goToDynamicControlsPage();
        dynamicControlsPage.clickRemoveButton();
        dynamicControlsPage.waitForLoadingMessageToDisappear();
        Assert.assertTrue(dynamicControlsPage.isCheckboxMessagePresentAndItsGone(),"The message is not displayed or is not the correct message");
    }

}
