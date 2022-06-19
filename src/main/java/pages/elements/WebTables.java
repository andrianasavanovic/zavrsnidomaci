package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class WebTables extends BasePage {
    private By webTables = By.id("item-3");
    private By addBtn = By.xpath("//*[@id=\"addNewRecordButton\"]");
    private By name = By.xpath("//*[@id=\"firstName\"]");
    private By lastName = By.xpath("//*[@id=\"lastName\"]");
    private By email = By.xpath("//*[@id=\"userEmail\"]");
    private By age = By.xpath("//*[@id=\"age\"]");
    private By salary = By.xpath("//*[@id=\"salary\"]");
    private By departement = By.xpath("//*[@id=\"department\"]");
    private By submitBtn = By.xpath("//*[@id=\"submit\"]");
    private By editBtn = By.xpath("//*[@id=\"edit-record-4\"]");
    private By deleteBtn = By.xpath("//*[@id=\"delete-record-4\"]");
    public WebTables(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }
    public void clickWebTables(){
        getDriver().findElement(webTables).click();
    }
    public boolean waitForAddBtn(){
       return getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(addBtn)).isDisplayed();
    }

    public void clickAddBtn(){
        getDriver().findElement(addBtn).click();
    }

    public void clearName(){
        getDriver().findElement(this.name).clear();
    }
    public void enterName(String name){
        getDriver().findElement(this.name).sendKeys(name);
    }
    public void clearLastName(){
        getDriver().findElement(this.lastName).clear();
    }
    public void enterLastName(String lastName){
        getDriver().findElement(this.lastName).sendKeys(lastName);
    }
    public void clearEmail(){
        getDriver().findElement(this.email).clear();
    }
    public void enterEmail(String email){
        getDriver().findElement(this.email).sendKeys(email);
    }
    public void clearAge(){
        getDriver().findElement(this.age).clear();
    }
    public void enterAge(String age){
        getDriver().findElement(this.age).sendKeys(age);
    }
    public void clearSalary(){
        getDriver().findElement(this.salary).clear();
    }
    public void enterSalary(String salary){
        getDriver().findElement(this.salary).sendKeys(salary);
    }
    public void clearDepartement(){
        getDriver().findElement(this.departement).clear();
    }
    public void enterDepartement(String departement){
        getDriver().findElement(this.departement).sendKeys(departement);
    }
    public void clickSubmitBtn(){
        getDriver().findElement(submitBtn).click();
    }
    public String assertNewUserAdded(){
       return getDriver().
               findElement
                       (By.xpath
                               ("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]"))
               .getText();
    }
    public void clickEditBtn(){
        getDriver().findElement(editBtn).click();
    }
    public String assertNewUserEdited(){
        return getDriver().
                findElement
                        (By.xpath
                                ("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[3]"))
                .getText();
    }
    public void clickDeleteBtn(){
        getDriver().findElement(deleteBtn).click();
    }
}
