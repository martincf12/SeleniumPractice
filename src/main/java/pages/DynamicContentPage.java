package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DynamicContentPage extends TheInternetHomePage {

    @FindBy(css = "#content >div .large-10 .row")
    List<WebElement> dynamicElementMessages;

    public DynamicContentPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> actualContent(){
        return dynamicElementMessages;
    }
}
