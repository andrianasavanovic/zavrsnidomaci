package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestsForElements extends BaseTests {


    @Test(priority = 1)
    public void testClickElements() throws InterruptedException {
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/elements");
        Assert.assertEquals(getHomePage().textElements(), "Elements");

    }

    @Test(priority = 2)
    public void clickTextBox() {
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getTextBox().clickTextBox();
        Assert.assertEquals(getTextBox().textTextBox(), "Text Box");
        getTextBox().enterFullName("Marko Markovic");
        getTextBox().enterEmail("marko@gmail.com");
        getTextBox().enterCurrentAddress("Novi Sad");
        getTextBox().enterPermanentAddress("Novi Sad");
        getTextBox().clickSubmit();
        Assert.assertTrue(getTextBox().assertInputData());
    }
    @Test(priority = 3)
    public void clickCheckBox(){
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getCheckBox().clickCheckBox();
        Assert.assertEquals(getCheckBox().asserCheckBox(), "Check Box");
    }
    @Test(priority = 4)
    public void testCheckBoxPage() throws InterruptedException {
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getCheckBox().clickCheckBox();
        Thread.sleep(1000);
        getCheckBox().clickHomeBox();
        Assert.assertEquals(getCheckBox().isNoteDisplayed(), "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
        getCheckBox().clickFirstBtnDown();
        getCheckBox().clickDesktopBox();
        Assert.assertEquals(getCheckBox().isNoteDisplayed(), "You have selected :\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
        getCheckBox().clickDocumentsBox();
        Assert.assertEquals(getCheckBox().isNoteDisplayed(), "You have selected :\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
        getCheckBox().clickDownloadBox();
        Assert.assertEquals(getCheckBox().lastCheckBox().getAttribute("class"), "rct-icon rct-icon-uncheck");
    }
    @Test(priority = 5)
    public void clickRadioButon() throws InterruptedException {
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getRadioButton().clickRadioBtn();
        getRadioButton().waitForYesBtn();
        getRadioButton().clickYesBtn();
        Assert.assertEquals(getRadioButton().assertYesImpressive(), "You have selected Yes");
        getRadioButton().clickImpressiveBtn();
        Assert.assertEquals(getRadioButton().assertYesImpressive(), "You have selected Impressive");
        Assert.assertTrue(getRadioButton().isNoButnEnabled());
    }
    @Test(priority = 6)
    public void testWebTables(){
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getWebTables().clickWebTables();
        Assert.assertTrue(getWebTables().waitForAddBtn());
        getWebTables().clickAddBtn();
        getWebTables().enterName("Marko");
        getWebTables().enterLastName("Markovic");
        getWebTables().enterEmail("marko@gmail.com");
        getWebTables().enterAge("29");
        getWebTables().enterSalary("200");
        getWebTables().enterDepartement("idk");
        getWebTables().clickSubmitBtn();
        Assert.assertEquals(getWebTables().assertNewUserAdded(), "Marko");
        getWebTables().clickEditBtn();
        getWebTables().clearAge();
        getWebTables().enterAge("50");
        getWebTables().clickSubmitBtn();
        Assert.assertEquals(getWebTables().assertNewUserEdited(), "50");
        getWebTables().clickDeleteBtn();
        Assert.assertEquals(getWebTables().assertNewUserAdded(), " ");
    }
    @Test(priority = 7)
    public void testButtons(){
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getButtons().clickButtons();
        getButtons().clickDoubleClick();
        Assert.assertEquals(getButtons().assertDoubleClick(), "You have done a double click");
        getButtons().clickRightClick();
        Assert.assertEquals(getButtons().assertRightClick(), "You have done a right click");
        getButtons().clickClick();
        Assert.assertEquals(getButtons().assertClickClick(), "You have done a dynamic click");

    }
    @Test(priority = 8)
    public void testLinks() throws InterruptedException {
        //IZBACI THREAD SLEEPOVE!!!!
        //Home
        //
        //HomeZzf0b
        //DODAJ I OVO!!!
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getLinks().clickLinks();
        getLinks().clickCreated();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(getLinks().assertMsg(), "Link has responded with staus 201 and status text Created");
        getLinks().clickNoContent();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(getLinks().assertMsg(), "Link has responded with staus 204 and status text No Content");
        getLinks().clickMoved();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(getLinks().assertMsg(), "Link has responded with staus 301 and status text Moved Permanently");
        getLinks().clickBadRequest();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(getLinks().assertMsg(), "Link has responded with staus 400 and status text Bad Request");
        getLinks().clickUnauthorized();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(getLinks().assertMsg(), "Link has responded with staus 401 and status text Unauthorized");
        getLinks().clickForiden();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(getLinks().assertMsg(), "Link has responded with staus 403 and status text Forbidden");
        getLinks().clickNotFound();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(getLinks().assertMsg(), "Link has responded with staus 404 and status text Not Found");

    }

    @Test(priority = 9)
    public void testBrokenLinks(){
        getHomePage().waitForHomePage();
        getHomePage().clickElements();
        getBrokenLinks().clickBrokenLinks();
        getBrokenLinks().clickValidLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/");
        getDriver().navigate().back();
        getBrokenLinks().clickBrokenLink();
        Assert.assertEquals(getDriver().getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
        getDriver().navigate().back();
    }




}
