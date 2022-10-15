package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
import lt.pages.Lemodus.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    private void loginWhitPositiveInfo() {
        String expectedCorrectPassword = "Kamuoliukas003";
        String actualCorrectPassword = null;
        String expectedEmail = "marius@acheta.lt";
        String actualEmail = null;
        LoginPage.clickPersonButtonIcon();
        LoginPage.enterEmailLogin(expectedEmail);
        LoginPage.enterCorrectPasword(expectedCorrectPassword);
        LoginPage.clickPrisijungtiButton();

        Assert.assertTrue(
                actualCorrectPassword.contains(expectedCorrectPassword),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualCorrectPassword,
                        expectedCorrectPassword

                ));
        Assert.assertTrue(
                actualEmail.contains(expectedEmail),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualEmail,
                        expectedEmail

                ));
        HomePage.sleep(2000);
    }
    @Test
    private void loginWhitNegativeInfo() {
        String expectedEmail = "marius@acheta.lt";
        String actualEmail = null;
        String expectedNegativePassword = "Kamuoliukas006";
        String actualNegativePassword = null;
        LoginPage.clickPersonButtonIcon();
        LoginPage.enterEmailLogin(expectedEmail);
        LoginPage.enterPaswordLogin(expectedNegativePassword);
        LoginPage.clickPrisijungtiButton();

        Assert.assertTrue(
                actualEmail.contains(expectedEmail),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualEmail,
                        expectedEmail

                ));
        Assert.assertTrue(
                actualNegativePassword.contains(expectedNegativePassword),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualNegativePassword,
                        expectedNegativePassword

                ));
        HomePage.sleep(2000);
    }


}
