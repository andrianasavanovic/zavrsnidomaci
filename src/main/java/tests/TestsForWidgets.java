package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForWidgets extends BaseTests{

    @Test(priority = 1)
    public void testClickWidgets() {
        getHomePage().waitForHomePage();
        getHomePage().clickWidgets();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/widgets");
        Assert.assertEquals(getHomePage().textWidgets(), "Widgets");
    }
}
