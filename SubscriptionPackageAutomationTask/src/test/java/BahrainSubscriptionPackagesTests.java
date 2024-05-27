import Pages.BahrainSubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BahrainSubscriptionPackagesTests extends BaseTests {

    public BahrainSubscriptionPage bahrainSubscriptionPage;

    @BeforeClass
    public void goToBahrainSubscriptionPage() {
        bahrainSubscriptionPage = homePage.goToBahrainSubscription();
    }

    @Test(priority = 1)
    public void validatePlanType() {
        //bahrainSubscriptionPage = homePage.goToBahrainSubscription();
        String classicPlan = bahrainSubscriptionPage.getClassicPlanType();
        String litePlan = bahrainSubscriptionPage.getLitePlanType();
        String premiumPlan = bahrainSubscriptionPage.getPremiumPlanType();
        Assert.assertEquals(classicPlan, "CLASSIC");
        Assert.assertEquals(litePlan, "LITE");
        Assert.assertEquals(premiumPlan, "PREMIUM");
    }

    @Test(priority = 2)
    public void validatePriceOfEachPlan() {
        //bahrainSubscriptionPage = homePage.goToBahrainSubscription();
        String classicPrice = bahrainSubscriptionPage.getClassicPlanPrice();
        String litePrice = bahrainSubscriptionPage.getLitePlanPrice();
        String premiumPrice = bahrainSubscriptionPage.getPremiumPlanPrice();
        Assert.assertEquals(classicPrice, "3");
        Assert.assertEquals(litePrice, "2");
        Assert.assertEquals(premiumPrice, "6");
    }

    @Test(priority = 3)
    public void validateCurrencyOfTheCountry() {
        //bahrainSubscriptionPage = homePage.goToBahrainSubscription();
        String classicCurrency = bahrainSubscriptionPage.getClassicPlanCurrency();
        String liteCurrency = bahrainSubscriptionPage.getLitePlanCurrency();
        String premiumCurrency = bahrainSubscriptionPage.getPremiumPlanCurrency();
        Assert.assertTrue(classicCurrency.contains("BHD"));
        Assert.assertTrue(liteCurrency.contains("BHD"));
        Assert.assertTrue(premiumCurrency.contains("BHD"));
    }
}
