package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestForAlertsFrameWindows extends BaseTests{
    @Test(priority = 1)
    public void testClickAlertsFrameWindows() {
        getHomePage().waitForHomePage();
        getHomePage().clickAlertsFrameWindows();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/alertsWindows");
        Assert.assertEquals(getHomePage().textAlerts(), "Alerts, Frame & Windows");
    }
    @Test(priority = 2)
    public void testBrowserWindow(){
        getHomePage().waitForHomePage();
        getHomePage().clickAlertsFrameWindows();
        getBrowserWindow().clickBrowserWindow();
        getBrowserWindow().clickNewTab();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(getBrowserWindow().assertNewTab(), "This is a sample page");

       // https://demoqa.com/browser-windows

    }


}
