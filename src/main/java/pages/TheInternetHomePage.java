package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TheInternetHomePage {

    WebDriver driver;

    public TheInternetHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage goToLoginPage(){
        String url = driver.getCurrentUrl()+"/login";
        this.driver.navigate().to(url);
        return new LoginPage(driver);
    }

    public CheckboxesPage goToCheckboxesPage(){
        String url = driver.getCurrentUrl()+"/checkboxes";
        this.driver.navigate().to(url);
        return new CheckboxesPage(driver);
    }
}
