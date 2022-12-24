package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends TheInternetHomePage{

    @FindBy(id = "hot-spot")
    WebElement contextMenu;

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void rightClickInContextMenu(){
        new Actions(driver).contextClick(contextMenu).perform();
    }

    public String getAlertMessageText(){
        return driver.switchTo().alert().getText();
    }
}
