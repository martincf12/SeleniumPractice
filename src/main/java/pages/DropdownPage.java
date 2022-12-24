package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends TheInternetHomePage {

    @FindBy(id = "dropdown")
    WebElement dropdownMenu;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectOptionByText(String option){
        new Select(dropdownMenu).selectByVisibleText(option);
    }

    public String getDropdownActualValueText(){
        return new Select(dropdownMenu).getFirstSelectedOption().getText();
    }
}
