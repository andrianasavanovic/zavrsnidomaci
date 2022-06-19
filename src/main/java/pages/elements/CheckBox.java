package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class CheckBox extends BasePage {
    private By checkBox = By.id("item-1");
    private By firstButtonDown = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");
    private By homeBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label");
    private By desktopBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]");
    private By documentsBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]");
    private By downloadsBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]");



    public CheckBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickCheckBox(){
        getDriver().findElement(checkBox).click();
    }
    public String asserCheckBox(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
    public void clickFirstBtnDown(){
        getDriver().findElement(firstButtonDown).click();
    }
    public void clickHomeBox(){
        getDriver().findElement(homeBox).click();
    }

    public String isNoteDisplayed(){
        return getDriver().findElement(By.xpath("//*[@id=\"result\"]")).getText();
    }
    public void clickDesktopBox(){
        getDriver().findElement(desktopBox).click();
    }
    public void clickDocumentsBox(){
        getDriver().findElement(documentsBox).click();
    }
    public void clickDownloadBox(){
        getDriver().findElement(downloadsBox).click();
    }
    public WebElement lastCheckBox(){
        return getDriver().findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg"));
    }
}
