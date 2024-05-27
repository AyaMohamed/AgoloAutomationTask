import Pages.SubscriptionHomePage;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

import java.io.File;
import java.nio.file.*;

public class BaseTests {

    WebDriver driver;
    protected static SubscriptionHomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goToSubscriptionPage();
    }

    public void goToSubscriptionPage() {
        driver.get("https://subscribe.stctv.com/sa-en");
        homePage = new SubscriptionHomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


    //take a screenshot of failed TCs
    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("src/main/resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
