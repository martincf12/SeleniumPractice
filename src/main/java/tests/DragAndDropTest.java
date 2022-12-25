package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.TheInternetHomePage;

public class DragAndDropTest extends BaseTest{

    String EXPECTED_FIRST_ELEMENT_TEXT = "B";
    String EXPECTED_SECOND_ELEMENT_TEXT = "A";

    @Test
    public void dragAndDropElements(){
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        DragAndDropPage dragAndDropPage = theInternetHomePage.goToDragAndDropPage();
        dragAndDropPage.dragElementADropOnElementB();
        Assert.assertEquals(dragAndDropPage.getTextFromFirstElement(),EXPECTED_FIRST_ELEMENT_TEXT);
        Assert.assertEquals(dragAndDropPage.getTextFromSecondElement(),EXPECTED_SECOND_ELEMENT_TEXT);
    }
}
