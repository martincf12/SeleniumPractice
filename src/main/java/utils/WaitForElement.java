package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForElement {

    int WAIT_10_SECONDS = 10;

    public void waitForElementInvisibility(WebDriver webDriver, WebElement webElement){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(WAIT_10_SECONDS));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
