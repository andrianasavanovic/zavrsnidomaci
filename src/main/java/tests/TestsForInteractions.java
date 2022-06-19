package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForInteractions extends BaseTests{

    @Test(priority = 1)
    public void testClickInteractions() {
        getHomePage().waitForHomePage();
        getHomePage().clickInteractions();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/interaction");
        Assert.assertEquals(getHomePage().textInteractions(), "Interactions");
    }
}
