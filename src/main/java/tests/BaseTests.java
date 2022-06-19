package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.alerts.frame.windows.BrowserWindow;
import pages.elements.*;
import pages.forms.TextForms;
import pages.homePage.HomePage;

import java.time.Duration;

public class BaseTests {


    private WebDriver driver;
    private WebDriverWait driverWait;
    private HomePage homePage;
    private TextBox textBox;
    private CheckBox checkBox;
    private RadioButton radioButton;
    private WebTables webTables;
    private Buttons buttons;
    private Links links;
    private BrokenLinks brokenLinks;
    private TextForms textForms;
    private BrowserWindow browserWindow;

    @BeforeClass
    public void befforeClass(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        homePage = new HomePage(driver, driverWait);
        textBox = new TextBox(driver, driverWait);
        checkBox = new CheckBox(driver, driverWait);
        radioButton = new RadioButton(driver, driverWait);
        webTables = new WebTables(driver, driverWait);
        buttons = new Buttons(driver, driverWait);
        links = new Links(driver, driverWait);
        brokenLinks = new BrokenLinks(driver, driverWait);
        textForms = new TextForms(driver, driverWait);
        browserWindow = new BrowserWindow(driver,driverWait);

    }
    @BeforeMethod
    public void befforeMethod(){
        driver.navigate().to("https://demoqa.com/");

    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public TextBox getTextBox() {
        return textBox;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public RadioButton getRadioButton() {
        return radioButton;
    }

    public WebTables getWebTables() {
        return webTables;
    }

    public Buttons getButtons() {
        return buttons;
    }

    public Links getLinks() {
        return links;
    }

    public BrokenLinks getBrokenLinks() {
        return brokenLinks;
    }

    public TextForms getTextForms() {
        return textForms;
    }
    public BrowserWindow getBrowserWindow() {
        return browserWindow;
    }
    // @AfterClass
   // public void afterclass(){
     //   driver.close();
   // }
}
