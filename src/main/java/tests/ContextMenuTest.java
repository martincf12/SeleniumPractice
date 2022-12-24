package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.TheInternetHomePage;

public class ContextMenuTest extends BaseTest{

    final String EXPECTED_CONTEXT_MENU_MESSAGE = "You selected a context menu";

    @Test
    public void javascriptAlertTextOnRightClick(){
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        ContextMenuPage contextMenuPage = theInternetHomePage.goToContextMenuPage();
        contextMenuPage.rightClickInContextMenu();
        Assert.assertEquals(EXPECTED_CONTEXT_MENU_MESSAGE,contextMenuPage.getAlertMessageText());
    }

}
