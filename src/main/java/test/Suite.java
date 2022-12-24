package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

public class Suite {

    String EXPECTED_SUCCESS_LOGIN_MESSAGE = "Welcome to the Secure Area. When you are done click logout below.";
    String EXPECTED_FAILURE_LOGIN_MESSAGE = "This is where you can log into the secure area. Enter tomsmith for the " +
            "username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.";

    final String BASE_URL = "http://localhost:7080/login";
    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Martin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @BeforeMethod
    public void openSession(){
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void loginSuccess() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickInLoginButton();
        Assert.assertEquals(EXPECTED_SUCCESS_LOGIN_MESSAGE,loginPage.getLoginMessageText(),"The login message is not the expected one");
    }

    @Test(priority = 2)
    public void loginFailure() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tomsmith_fail");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickInLoginButton();
        Assert.assertEquals(EXPECTED_FAILURE_LOGIN_MESSAGE,loginPage.getLoginMessageText(),"The login message is not the expected one");
    }

    @AfterMethod
    public void endSession(){
        driver.quit();
    }

}
