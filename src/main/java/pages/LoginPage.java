package pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TheInternetHomePage {

    @FindBy(id = "username")
    @Getter @Setter WebElement usernameInput;

    @FindBy(id = "password")
    @Getter @Setter WebElement passwordInput;

    @FindBy(css = "#login > button")
    @Getter @Setter WebElement loginButton;

    @FindBy(css = ".subheader")
    @Getter @Setter WebElement loginMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickInLoginButton() {
        loginButton.click();
    }

    public String getLoginMessageText() {
        return loginMessage.getText();
    }
}
