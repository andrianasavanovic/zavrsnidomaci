package pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

public class TextForms extends BasePage {

    private By practiceForm = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By genderM = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]");
    private By genderF = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]");
    private By genderO = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]");
    private By mobileNumber = By.id("userNumber");
    private By dateOfBirth = By.id("dateOfBirthInput");
    private By subject = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]");
    private By hobbieSport = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]");
    private By hobbieReading= By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]");
    private By hobbieMusic = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]");
    private By picture = By.id("uploadPicture");
    private By currentAddress = By.id("currentAddress");



    public TextForms(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void clickPracticeForm(){
        getDriver().findElement(practiceForm).click();
    }
    public boolean assertPracticeForm(){
        return getDriver().findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]")).isDisplayed();
    }

    public void enterFirstName(String name){
        getDriver().findElement(this.firstName).sendKeys(name);
    }
    public void enterLastName(String lastName){
        getDriver().findElement(this.lastName).sendKeys(lastName);
    }
    public void enterEmail(String email){
        getDriver().findElement(this.email).sendKeys(email);
    }
    public void clickGender(String gender){
        switch (gender){
            case "M":
                getDriver().findElement(genderM).click();
                break;
            case "F":
                getDriver().findElement(genderF).click();
                break;
            case "O":
                getDriver().findElement(genderO).click();
                break;
        }
    }
    public void enterMobileNumber(String mobile){
        getDriver().findElement(this.mobileNumber).sendKeys(mobile);
    }
    public void enterDateOfBirth(String date){
        getDriver().findElement(this.dateOfBirth).sendKeys(date);
    }
    public void enterSubject(String subject){
        getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]")).sendKeys(subject);
    }
    public void enterHobbie(String hobbie){
        switch (hobbie){
            case "sport":
                getDriver().findElement(hobbieSport).click();
                break;
            case "reading":
                getDriver().findElement(hobbieReading).click();
                break;
            case "music":
                getDriver().findElement(hobbieMusic).click();
                break;
        }
    }
    //to do
    public void choosePicture(){

    }
    public void enterCurrentAddres(String address){
        getDriver().findElement(this.currentAddress).sendKeys(address);
    }
}
