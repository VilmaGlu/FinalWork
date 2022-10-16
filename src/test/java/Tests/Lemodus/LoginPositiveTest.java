package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
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
    private void loginWhitPositiveInfo() {
        String expectedCorrectPassword = "Kamuoliukas003";
        String actualCorrectPassword;
        String expectedEmail = "VilmaBoga@gmail.com";
        String actualEmail;


        LoginPositivePage.clickPersonButtonIcon();
        LoginPositivePage.enterEmailLogin(expectedEmail);
        LoginPositivePage.enterCorrectPasword(expectedCorrectPassword);
        LoginPositivePage.clickPrisijungtiButton();
        LoginPositivePage.clickLogOutButton();
        LoginPositivePage.submitFormPage();
        LoginPositivePage.clickCancelButton();


        actualCorrectPassword = LoginPositivePage.readMessageCorrectPassword();
        Assert.assertEquals(actualCorrectPassword,expectedCorrectPassword);
        actualEmail = LoginPositivePage.readMessageEmail();
        Assert.assertEquals(actualEmail,expectedEmail);

        HomePage.sleep(2000);
    }

}
