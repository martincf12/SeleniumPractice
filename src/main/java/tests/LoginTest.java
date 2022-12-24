package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TheInternetHomePage;

public class LoginTest extends BaseTest{

    String EXPECTED_SUCCESS_LOGIN_MESSAGE = "Welcome to the Secure Area. When you are done click logout below.";
    String EXPECTED_FAILURE_LOGIN_MESSAGE = "This is where you can log into the secure area. Enter tomsmith for the " +
            "username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.";

    @Test(priority = 1)
    public void loginSuccess() {
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        LoginPage loginPage = theInternetHomePage.goToLoginPage();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickInLoginButton();
        Assert.assertEquals(EXPECTED_SUCCESS_LOGIN_MESSAGE,loginPage.getLoginMessageText(),"The login message is not the expected one");
    }

    @Test(priority = 2)
    public void loginFailure() {
        TheInternetHomePage theInternetHomePage = new TheInternetHomePage(driver);
        LoginPage loginPage = theInternetHomePage.goToLoginPage();
        loginPage.enterUsername("tomsmith_fail");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickInLoginButton();
        Assert.assertEquals(EXPECTED_FAILURE_LOGIN_MESSAGE,loginPage.getLoginMessageText(),"The login message is not the expected one");
    }
}
