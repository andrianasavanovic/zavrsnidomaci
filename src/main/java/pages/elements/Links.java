package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class Links extends BasePage {
    private By links = By.id("item-5");
    private By created = By.id("created");
    private By noContent = By.id("no-content");
    private By moved = By.id("moved");
    private By badRequest = By.id("bad-request");
    private By unauthorized = By.id("unauthorized");
    private By forbidden = By.id("forbidden");
    private By notFound = By.id("invalid-url");
    public Links(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickLinks(){
        getDriver().findElement(links).click();
    }

    public void clickCreated(){
        getDriver().findElement(created).click();
    }
    public void clickNoContent(){
        getDriver().findElement(noContent).click();
    }
    public void clickMoved(){
        getDriver().findElement(moved).click();
    }
    public void clickBadRequest(){
        getDriver().findElement(badRequest).click();
    }
    public void clickUnauthorized(){
        getDriver().findElement(unauthorized).click();
    }
    public void clickForiden(){
        getDriver().findElement(forbidden).click();
    }
    public void clickNotFound(){
        getDriver().findElement(notFound).click();
    }
    public String assertMsg(){
        return getDriver().findElement(By.id("linkResponse")).getText();
    }
}
