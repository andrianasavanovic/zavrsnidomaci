package pages.alerts.frame.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class BrowserWindow extends BasePage {
    private By browserWindow = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1]");
    private By newTab = By.id("tabButton");
    private By newWindow = By.id("windowButton");
    private By newWindowMsg = By.id("messageWindowButton");

    public BrowserWindow(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickBrowserWindow(){
        getDriver().findElement(browserWindow).click();
    }
    public void clickNewTab(){
        getDriver().findElement(newTab).click();
    }
    public String assertNewTab(){
        return getDriver().findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
    }
    public void clickNewWindow(){
        getDriver().findElement(newWindow).click();
    }
    public boolean assertNewWindow(){
        return getDriver().findElement(By.id("sampleHeading")).isDisplayed();
    }
    public void clickNewWindowMsg(){
        getDriver().findElement(newWindowMsg).click();
    }
    public boolean assertNewWmsg(){
        return getDriver().findElement(By.xpath("/html/body/text()")).isDisplayed();
    }
}
