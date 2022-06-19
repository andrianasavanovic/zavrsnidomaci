package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class Buttons extends BasePage {
    private By buttons = By.id("item-4");
    private By doubleClick = By.xpath("//*[@id=\"doubleClickBtn\"]");
    private By rightClick = By.xpath("//*[@id=\"rightClickBtn\"]");
    private By click = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");

    Actions actions = new Actions(getDriver());

    public Buttons(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait);
        this.actions = actions;
    }

    public Buttons(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickButtons(){
        getDriver().findElement(buttons).click();
    }

    public void clickDoubleClick(){
        actions.doubleClick(getDriver().findElement(doubleClick)).perform();
    }
    public String assertDoubleClick(){
       return getDriver().findElement(By.xpath("//*[@id=\"doubleClickMessage\"]")).getText();
    }

    public void clickRightClick(){
        actions.contextClick(getDriver().findElement(rightClick)).perform();
    }

    public String assertRightClick(){
        return getDriver().findElement(By.xpath("//*[@id=\"rightClickMessage\"]")).getText();
    }

    public void clickClick(){
        getDriver().findElement(click).click();
    }
    public String assertClickClick(){
        return getDriver().findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).getText();
    }
}
