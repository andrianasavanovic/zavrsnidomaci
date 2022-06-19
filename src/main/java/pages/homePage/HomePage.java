package pages.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class HomePage extends BasePage {

    private By elements = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]");
    private By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]");
    private By alertsFrameWindows = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[2]");
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[2]");
    private By interactions = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[2]");
    private By bookStoreApplication = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[2]");


    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickElements(){
        getDriver().findElement(elements).click();
    }
    public String textElements(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
    public void waitForHomePage(){
        getDriverWait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div")));
    }
    public void clickForms(){
        getDriver().findElement(forms).click();
    }
    public String textForms(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
    public void clickAlertsFrameWindows(){
        getDriver().findElement(alertsFrameWindows).click();
    }
    public String textAlerts(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
    public void clickWidgets(){
        getDriver().findElement(widgets).click();
    }
    public String textWidgets(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
    public void clickInteractions(){
        getDriver().findElement(interactions).click();
    }
    public String textInteractions(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
    public void waitBookStoreApplication(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)", "");
    }
    public void clickBookStoreApplications(){
        getDriver().findElement(bookStoreApplication).click();
    }
    public String textBooks(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
}
