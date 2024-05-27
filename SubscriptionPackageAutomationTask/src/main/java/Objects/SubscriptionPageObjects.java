package Objects;

import org.openqa.selenium.By;

public class SubscriptionPageObjects {


    private By countryBtn= By.xpath("//a[@id='country-btn']");
    private By countrySelect=By.id("country-selct");
    private By bahrainCountryLink=By.id("bh");
    private By kuwaitCountryLink=By.id("kw");
    private By saudiCountryLink =By.id("sa");

    private By litePlanType=By.id("name-lite");
    private By currencyLite=By.xpath("//div[@id='currency-lite']/i");
    private By priceLite=By.xpath("//div[@id='currency-lite']/b");
    private By classicPlanType=By.id("name-classic");
    private By currencyClassic=By.xpath("//div[@id='currency-classic']/i");
    private By priceClassic=By.xpath("//div[@id='currency-classic']/b");
    private By premiumPlanType=By.id("name-premium");
    private By currencyPremium=By.xpath("//div[@id='currency-premium']/i");
    private By pricePremium=By.xpath("//div[@id='currency-premium']/b");

    public By getCountryBtn() {
        return countryBtn;
    }

    public By getCountrySelect() {
        return countrySelect;
    }

    public By getBahrainCountryLink() {
        return bahrainCountryLink;
    }

    public By getKuwaitCountryLink() {
        return kuwaitCountryLink;
    }

    public By getSaudiCountryLink() {
        return saudiCountryLink;
    }

    public By getLitePlanType() {
        return litePlanType;
    }


    public By getClassicPlanType() {
        return classicPlanType;
    }


    public By getPremiumPlanType() {
        return premiumPlanType;
    }

    public By getCurrencyLite() {
        return currencyLite;
    }

    public By getPriceLite() {
        return priceLite;
    }

    public By getCurrencyClassic() {
        return currencyClassic;
    }

    public By getPriceClassic() {
        return priceClassic;
    }

    public By getCurrencyPremium() {
        return currencyPremium;
    }

    public By getPricePremium() {
        return pricePremium;
    }
}
