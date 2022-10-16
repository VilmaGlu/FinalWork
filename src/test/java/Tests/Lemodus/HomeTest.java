package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
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
    public void registrationWhitPositiveInfo() {

        String expectedEmail = "vilmaautotest@gmail.com";
        String actualEmail = null;


        HomePage.clickPersonButtonIcon();
        HomePage.clickOnForgotPassword();
        HomePage.enterEmail(expectedEmail);
        HomePage.confirmButton();
        HomePage.cancelOnSubmit();


        Assert.assertEquals(actualEmail,expectedEmail);


        HomePage.sleep(2000);

    }
}

