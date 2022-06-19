package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class BrokenLinks extends BasePage {
    private By brokenLinks = By.id("item-6");
    private By validLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]");
    private By brokenLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]");
    public BrokenLinks(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickBrokenLinks(){
        getDriver().findElement(brokenLinks).click();
    }
    public void clickValidLink(){
        getDriver().findElement(validLink).click();
    }

    public void clickBrokenLink(){
        getDriver().findElement(brokenLink).click();
    }
}
