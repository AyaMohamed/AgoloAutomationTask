package Pages;

import Objects.SubscriptionPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BahrainSubscriptionPage {

    SubscriptionPageObjects objects = new SubscriptionPageObjects();
    WebDriver driver;

    public BahrainSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }


    public String getLitePlanPrice() {
        String price = "";
        price = driver.findElement(objects.getPriceLite()).getText();
        return price;
    }
    public String getClassicPlanPrice() {
        String price = "";
        price = driver.findElement(objects.getPriceClassic()).getText();
        return price;
    }

    public String getPremiumPlanPrice() {
        String price = "";
        price = driver.findElement(objects.getPricePremium()).getText();
        return price;
    }

    public String getLitePlanCurrency() {
        String currency = "";
        currency = driver.findElement(objects.getCurrencyLite()).getText();
        return currency;
    }


    public String getClassicPlanCurrency() {
        String currency = "";
        currency = driver.findElement(objects.getCurrencyClassic()).getText();
        return currency;
    }

    public String getPremiumPlanCurrency() {
        String currency = "";
        currency = driver.findElement(objects.getCurrencyPremium()).getText();
        return currency;
    }

    public String getLitePlanType() {
        String planType = "";
        planType = driver.findElement(objects.getLitePlanType()).getText();
        return planType;
    }

    public String getClassicPlanType() {
        String planType = "";
        planType = driver.findElement(objects.getClassicPlanType()).getText();
        return planType;
    }

    public String getPremiumPlanType() {
        String planType = "";
        planType = driver.findElement(objects.getPremiumPlanType()).getText();
        return planType;
    }


}
