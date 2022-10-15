package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
import lt.pages.Lemodus.NegativeLogintPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        NegativeLogintPage.open("https://www.lemodus.lt/customer/account/login/");
    }

    @Test
    private void loginWhitNegativeInfo() {
        String expectedEmail = "glubogavilma@gmail.com";
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
