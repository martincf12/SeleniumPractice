package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends TheInternetHomePage{

    @FindBy(css = "input:nth-child(1)")
    WebElement checkboxOne;
    @FindBy(css = "input:nth-child(3)")
    WebElement checkboxTwo;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckboxOne(){
        checkboxOne.click();
    }

    public void clickCheckboxTwo(){
        checkboxTwo.click();
    }

    public boolean checkboxOneIsSelected(){
        return checkboxOne.isSelected();
    }

    public boolean checkboxTwoIsSelected(){
        return checkboxTwo.isSelected();
    }
}
