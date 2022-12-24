package tests;

import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.TheInternetHomePage;

public class DragAndDropTest extends BaseTest{

    @Test
    public void dragAndDrop(){
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        DragAndDropPage dragAndDropPage = theInternetHomePage.goToDragAndDropPage();
    }
}
