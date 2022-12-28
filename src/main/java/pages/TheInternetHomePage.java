package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TheInternetHomePage {

    @FindBy(css = "li:nth-child(6) > a")
    WebElement checkboxesHrefLink;

    @FindBy(css = "li:nth-child(7) > a")
    WebElement contextMenuHrefLink;

    @FindBy(css = "li:nth-child(10) > a")
    WebElement dragAndDropHrefLink;

    @FindBy(css = "li:nth-child(11) > a")
    WebElement dropdownHrefLink;

    @FindBy(css = "li:nth-child(12) > a")
    WebElement dynamicContentHrefLink;

    @FindBy(css = "li:nth-child(13) > a")
    WebElement dynamicControlHrefLink;

    WebDriver driver;

    public TheInternetHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage goToLoginPage(){
        this.driver.navigate().to(driver.getCurrentUrl()+"/login");
        return new LoginPage(driver);
    }

    public CheckboxesPage goToCheckboxesPage(){
        checkboxesHrefLink.click();
        return new CheckboxesPage(driver);
    }

    public ContextMenuPage goToContextMenuPage(){
        contextMenuHrefLink.click();
        return new ContextMenuPage(driver);
    }

    public DragAndDropPage goToDragAndDropPage(){
        dragAndDropHrefLink.click();
        return new DragAndDropPage(driver);
    }

    public DropdownPage goToDropdownPage(){
        dropdownHrefLink.click();
        return new DropdownPage(driver);
    }

    public DynamicContentPage goToDynamicContentPage(){
        dynamicContentHrefLink.click();
        return new DynamicContentPage(driver);
    }

    public DynamicControlsPage goToDynamicControlsPage(){
        dynamicControlHrefLink.click();
        return new DynamicControlsPage(driver);
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }
}
