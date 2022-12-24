package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends TheInternetHomePage {

    @FindBy(id = "column-a")
    WebElement elementA;

    @FindBy(css = "#column-a > header")
    WebElement elementAText;

    @FindBy(id = "column-b")
    WebElement elementB;

    @FindBy(css = "#column-b > header")
    WebElement elementBText;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void dragElementADropOnElementB(){
        new Actions(driver).dragAndDrop(elementA, elementB).build().perform();
    }

    public String getTextFromFirstElement(){
        return elementAText.getText();
    }

    public String getTextFromSecondElement(){
        return elementBText.getText();
    }
}
