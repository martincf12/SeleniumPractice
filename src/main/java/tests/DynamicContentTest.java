package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicContentPage;
import pages.TheInternetHomePage;

import java.util.ArrayList;
import java.util.List;

public class DynamicContentTest extends BaseTest {

    List<String> actualDynamicElementMessages = new ArrayList<>();

    List<String> previousDynamicElementMessages = new ArrayList<>();

    @Test
    public void dynamicContentComparison(){
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        DynamicContentPage dynamicContentPage = theInternetHomePage.goToDynamicContentPage();
        for (int i = 0; i < 3; i++){
            previousDynamicElementMessages = getStringValuesFromWebElement(dynamicContentPage.actualContent());
            dynamicContentPage.refreshPage();
            actualDynamicElementMessages = getStringValuesFromWebElement(dynamicContentPage.actualContent());
            Assert.assertNotEquals(actualDynamicElementMessages,previousDynamicElementMessages,"The content of the page is the same\n");
        }
    }

    private List<String> getStringValuesFromWebElement(List<WebElement> webElementsList){
        List<String> dynamicElementMessagesList = new ArrayList<>();
        for (WebElement webElement:webElementsList) {
            dynamicElementMessagesList.add(webElement.getText());
        }
        return dynamicElementMessagesList;
    }
}
