package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForForms extends BaseTests{


    @Test(priority = 1)
    public void testClickForm() {
        getHomePage().waitForHomePage();
        getHomePage().clickForms();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/forms");
        Assert.assertEquals(getHomePage().textForms(), "Forms");
    }


    @Test(priority = 2)
    public void testClickPracticeForm(){
        getHomePage().clickForms();
        getTextForms().clickPracticeForm();
        Assert.assertTrue(getTextForms().assertPracticeForm());
    }
    @Test(priority = 3)
    public void fillTextForm(){
        getHomePage().clickForms();
        getTextForms().clickPracticeForm();
        getTextForms().enterFirstName("Marko");
        getTextForms().enterLastName("Markovic");
        getTextForms().enterEmail("marko@gmail.com");
        getTextForms().clickGender("M");
        getTextForms().enterMobileNumber("066558822");
        //getTextForms().enterDateOfBirth("17 jun 1999");
        //getTextForms().enterSubject("idk sta");
        getTextForms().enterHobbie("music");
        getTextForms().enterCurrentAddres("Novi Sad");

    }


}
