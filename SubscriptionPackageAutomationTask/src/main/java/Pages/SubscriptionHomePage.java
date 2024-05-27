package Pages;

import Objects.SubscriptionPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubscriptionHomePage {

    private WebDriver driver;

    SubscriptionPageObjects objects = new SubscriptionPageObjects();

    public SubscriptionHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCountryBtn() {
        driver.findElement(objects.getCountryBtn()).click();
    }

    public BahrainSubscriptionPage goToBahrainSubscription() {
        clickOnCountryBtn();
        driver.findElement(objects.getBahrainCountryLink()).click();
        return new BahrainSubscriptionPage(driver);
    }

    public KuwaitSubscriptionPage goToKuwaitSubscription() {
        clickOnCountryBtn();
        driver.findElement(objects.getKuwaitCountryLink()).click();
        return new KuwaitSubscriptionPage(driver);
    }

    public SaudiSubscriptionPage goToSaudiSubscription() {
        clickOnCountryBtn();
        driver.findElement(objects.getSaudiCountryLink()).click();
        return new SaudiSubscriptionPage(driver);
    }


}
