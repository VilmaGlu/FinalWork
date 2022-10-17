package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPage.open("https://www.lemodus.lt/customer/account/login/");
    }

    @Test
    private void loginWhitPositiveInfo() {

        String expectedTextMessage = "";
        String actualTextMessage = "";

        LoginPage.clickPersonButtonIcon();
        LoginPage.enterEmailLogin("Vilmaboga@gmail.com");
        LoginPage.enterCorrectPassword("Kamuoliukas003");
        LoginPage.clickPrisijungtiButton();

        actualTextMessage = LoginPage.successfulLogin();
        Assert.assertEquals(actualTextMessage, expectedTextMessage);
    }

    @Test
    public void loginWhitNegativePasswordInfo() {
        String expectedNegativePassword = "";
        String actualNegativePassword = "";

        LoginPage.clickPersonButtonIcon();
        LoginPage.enterEmailLogin("VilmaBoga@gmail.com");
        LoginPage.enterPasswordLogin("Kamuoliukas006");
        LoginPage.clickPrisijungtiButton();
        LoginPage.errorMessageShow();

        actualNegativePassword = LoginPage.readPassword();
        Assert.assertEquals(actualNegativePassword, expectedNegativePassword);
    }
}




