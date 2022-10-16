package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
import lt.pages.Lemodus.LoginPositivePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        HomePage.open("https://www.lemodus.lt/)");


    }


    @Test
    public void passwordReminder() {

        String expectedEmail = "Vilmaboga@gmail.com";
        String actualEmail;


        HomePage.clickPersonButtonIcon();
        HomePage.clickOnForgotPassword();
        HomePage.enterEmail(expectedEmail);
        HomePage.confirmButton();
        HomePage.submitFormPage();
        HomePage.clickCancelButton();

        actualEmail = HomePage.readMessage();
        Assert.assertTrue(actualEmail.contains(expectedEmail));


        HomePage.sleep(2000);

    }
}

