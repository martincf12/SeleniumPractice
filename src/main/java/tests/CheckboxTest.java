package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.CheckboxesPage;
import pages.TheInternetHomePage;

public class CheckboxTest extends BaseTest{

    @Test
    public void CheckAndUncheckBoxes(){
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        CheckboxesPage checkboxesPage = theInternetHomePage.goToCheckboxesPage();
        checkboxesPage.clickCheckboxOne();
        checkboxesPage.clickCheckboxTwo();
        Assert.assertTrue(checkboxesPage.checkboxOneIsSelected(),"The checkbox status didn't change");
        Assert.assertFalse(checkboxesPage.checkboxTwoIsSelected(),"The checkbox status didn't change");
    }
}
