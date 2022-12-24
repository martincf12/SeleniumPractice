package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends TheInternetHomePage {

    @FindBy(id = "column-a")
    WebElement elementA;

    @FindBy(css = "#columns > div:first-child")
    WebElement firstElementText;

    @FindBy(id = "column-b")
    WebElement elementB;

    @FindBy(css = "#columns > div:last-child")
    WebElement secondElementText;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void dragElementADropOnElementB(){
        new Actions(driver).dragAndDrop(elementA, elementB).build().perform();
    }

    public String getTextFromFirstElement(){
        return firstElementText.getText();
    }

    public String getTextFromSecondElement(){
        return secondElementText.getText();
    }
}
