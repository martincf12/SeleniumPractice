package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public static WebDriver driver;
    String BASE_URL = "http://localhost:7080";

    @BeforeSuite
    public void initialize(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Martin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @BeforeMethod
    public void initializeBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void teardownTest()
    {
        BaseTest.driver.quit();
    }
}
