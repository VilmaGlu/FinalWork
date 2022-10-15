package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
import lt.pages.NegativeLogintPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {

    @Test
    private void loginWhitNegativeInfo() {
        String expectedEmail = "marius@acheta.lt";
        String actualEmail = null;
        String expectedNegativePassword = "Kamuoliukas006";
        String actualNegativePassword = null;
        NegativeLogintPage.clickPersonButtonIcon();
        NegativeLogintPage.enterEmailLogin(expectedEmail);
        NegativeLogintPage.enterPaswordLogin(expectedNegativePassword);
        NegativeLogintPage.clickPrisijungtiButton();

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
