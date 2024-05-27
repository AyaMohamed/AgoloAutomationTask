import Pages.KuwaitSubscriptionPage;
import Pages.SaudiSubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SaudiSubscriptionPackagesTests extends BaseTests{
    public SaudiSubscriptionPage saudiSubscriptionPage;

    @BeforeClass
    public void goToSaudiSubscriptionPage() {
        saudiSubscriptionPage = homePage.goToSaudiSubscription();
    }

    @Test(priority = 1)
    public void validatePlanType() {
        String classicPlan = saudiSubscriptionPage.getClassicPlanType();
        String litePlan = saudiSubscriptionPage.getLitePlanType();
        String premiumPlan = saudiSubscriptionPage.getPremiumPlanType();
        Assert.assertEquals(classicPlan, "CLASSIC");
        Assert.assertEquals(litePlan, "LITE");
        Assert.assertEquals(premiumPlan, "PREMIUM");
    }

    @Test(priority = 2)
    public void validatePriceOfEachPlan() {
        String classicPrice = saudiSubscriptionPage.getClassicPlanPrice();
        String litePrice = saudiSubscriptionPage.getLitePlanPrice();
        String premiumPrice = saudiSubscriptionPage.getPremiumPlanPrice();
        Assert.assertEquals(classicPrice, "25");
        Assert.assertEquals(litePrice, "15");
        Assert.assertEquals(premiumPrice, "60");
    }

    @Test(priority = 3)
    public void validateCurrencyOfTheCountry() {
        String classicCurrency = saudiSubscriptionPage.getClassicPlanCurrency();
        String liteCurrency = saudiSubscriptionPage.getLitePlanCurrency();
        String premiumCurrency = saudiSubscriptionPage.getPremiumPlanCurrency();
        Assert.assertTrue(classicCurrency.contains("SAR"));
        Assert.assertTrue(liteCurrency.contains("SAR"));
        Assert.assertTrue(premiumCurrency.contains("SAR"));
    }
}
