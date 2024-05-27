import Pages.KuwaitSubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KuwaitSubscriptionPackagesTests extends BaseTests
{

    public KuwaitSubscriptionPage kuwaitSubscriptionPage;

    @BeforeClass
    public void goToKuwaitSubscriptionPage() {
        kuwaitSubscriptionPage = homePage.goToKuwaitSubscription();
    }

    @Test(priority = 1)
    public void validatePlanType() {
        String classicPlan = kuwaitSubscriptionPage.getClassicPlanType();
        String litePlan = kuwaitSubscriptionPage.getLitePlanType();
        String premiumPlan = kuwaitSubscriptionPage.getPremiumPlanType();
        Assert.assertEquals(classicPlan, "CLASSIC");
        Assert.assertEquals(litePlan, "LITE");
        Assert.assertEquals(premiumPlan, "PREMIUM");
    }

    @Test(priority = 2)
    public void validatePriceOfEachPlan() {
        String classicPrice = kuwaitSubscriptionPage.getClassicPlanPrice();
        String litePrice = kuwaitSubscriptionPage.getLitePlanPrice();
        String premiumPrice = kuwaitSubscriptionPage.getPremiumPlanPrice();
        Assert.assertEquals(classicPrice, "2.5");
        Assert.assertEquals(litePrice, "1.2");
        Assert.assertEquals(premiumPrice, "4.8");
    }

    @Test(priority = 3)
    public void validateCurrencyOfTheCountry() {
        String classicCurrency = kuwaitSubscriptionPage.getClassicPlanCurrency();
        String liteCurrency = kuwaitSubscriptionPage.getLitePlanCurrency();
        String premiumCurrency = kuwaitSubscriptionPage.getPremiumPlanCurrency();
        Assert.assertTrue(classicCurrency.contains("KWD"));
        Assert.assertTrue(liteCurrency.contains("KWD"));
        Assert.assertTrue(premiumCurrency.contains("KWD"));
    }
}
