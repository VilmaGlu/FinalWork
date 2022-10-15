package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
import lt.pages.Lemodus.LoginPositivePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPositiveTest extends TestBase {
    @Test
    private void loginWhitPositiveInfo() {
        String expectedCorrectPassword = "Kamuoliukas003";
        String actualCorrectPassword = null;
        String expectedEmail = "marius@acheta.lt";
        String actualEmail = null;
        LoginPositivePage.clickPersonButtonIcon();
        LoginPositivePage.enterEmailLogin(expectedEmail);
        LoginPositivePage.enterCorrectPasword(expectedCorrectPassword);
        LoginPositivePage.clickPrisijungtiButton();

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

}
