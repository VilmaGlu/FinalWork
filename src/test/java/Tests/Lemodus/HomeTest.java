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
    private void passwordReminder() {

        String expectedResult = "";
        String actualResult;

        HomePage.clickPersonButtonIcon();
        HomePage.clickOnForgotPassword();
        HomePage.enterEmail("Vilmaboga@gmail.com");

        actualResult = HomePage.readMessage();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}

