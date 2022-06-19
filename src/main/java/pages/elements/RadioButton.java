package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class RadioButton extends BasePage {
    private By radioButton = By.id("item-2");
    private By yesBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impressiveBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]");
    private By noBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]");

    public RadioButton(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickRadioBtn(){
        getDriver().findElement(radioButton).click();
    }
    public void clickYesBtn(){
        getDriver().findElement(yesBtn).click();
    }
    public String assertYesImpressive(){
       return getDriver().findElement(By.className("mt-3")).getText();
    }
    public void waitForYesBtn(){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(yesBtn));
    }
    public void clickImpressiveBtn(){
        getDriver().findElement(impressiveBtn).click();
    }

    public boolean isNoButnEnabled(){
        return getDriver().findElement(noBtn).isEnabled();
    }
}
