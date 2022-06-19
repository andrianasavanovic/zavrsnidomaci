package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForBooks extends BaseTests{

    @Test(priority = 1)
    public void clickBookStoreApplication() throws InterruptedException {
        getHomePage().waitForHomePage();
        getHomePage().waitBookStoreApplication();
        getHomePage().clickBookStoreApplications();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/books");
        Assert.assertEquals(getHomePage().textBooks(), "Book Store");
    }
}
