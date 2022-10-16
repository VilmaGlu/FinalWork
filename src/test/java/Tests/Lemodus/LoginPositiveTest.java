package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.LoginPositivePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPositiveTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        LoginPositivePage.open("https://www.lemodus.lt/customer/account/login/");
    }

    @Test
    public void loginWhitPositiveInfo() {

        String expectedTextMessage = "";
        String actualTextMessage;

        LoginPositivePage.clickPersonButtonIcon();
        LoginPositivePage.enterEmailLogin("Vilmaboga@gmail.com");
        LoginPositivePage.enterCorrectPasword("Kamuoliukas003");
        LoginPositivePage.clickPrisijungtiButton();
        LoginPositivePage.clickLogOutButton();
        LoginPositivePage.submitFormPage();
        LoginPositivePage.clickCancelButton();
        LoginPositivePage.readLogo();

        actualTextMessage = LoginPositivePage.sucsesfulLogin();
        Assert.assertEquals(actualTextMessage, expectedTextMessage);
    }

}
