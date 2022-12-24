package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TheInternetHomePage {

    WebDriver driver;

    public TheInternetHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
