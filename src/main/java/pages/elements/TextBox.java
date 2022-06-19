package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class TextBox extends BasePage {
    private By textBox = By.id("item-0");
    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submit = By.id("submit");
    public TextBox(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickTextBox(){
        getDriver().findElement(textBox).click();
    }
    public String textTextBox(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText();
    }
    public void enterFullName(String fullName){
        getDriver().findElement(this.fullName).sendKeys(fullName);
    }
    public void enterEmail(String email){
        getDriver().findElement(this.email).sendKeys(email);
    }
    public void enterCurrentAddress(String cAddress){
        getDriver().findElement(this.currentAddress).sendKeys(cAddress);
    }
    public void enterPermanentAddress(String pAddress){
        getDriver().findElement(this.permanentAddress).sendKeys(pAddress);
    }
    public void clickSubmit(){
        getDriver().findElement(submit).click();
    }


    public boolean assertInputData(){

       return getDriver().findElement(By.xpath("//*[@id=\"output\"]/div")).isDisplayed();

    }



}
