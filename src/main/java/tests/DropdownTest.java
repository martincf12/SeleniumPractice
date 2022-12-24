package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.TheInternetHomePage;

public class DropdownTest extends BaseTest{

    String OPTION_ONE = "Option 1";
    String OPTION_TWO = "Option 2";
    @Test
    public void dragAndDrop(){
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        DropdownPage dropdownPage = theInternetHomePage.goToDropdownPage();
        dropdownPage.selectOptionByText(OPTION_ONE);
        Assert.assertEquals(dropdownPage.getDropdownActualValueText(),OPTION_ONE);
        dropdownPage.selectOptionByText(OPTION_TWO);
        Assert.assertEquals(dropdownPage.getDropdownActualValueText(),OPTION_TWO);
    }
}
