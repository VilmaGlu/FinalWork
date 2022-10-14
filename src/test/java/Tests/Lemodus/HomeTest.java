package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {


    @Test
    private void registrationWhitPositiveInfo() {
        String expectedName = "Vilma";
        String expectedLastName = "Glusauske";
        String expectedEmail = "marius@acheta.lt";
        String expectedPassword = "Kamuoliukas003";
        String actualMessage = null;

        HomePage.clickPersonButtonIcon();
        HomePage.clickRegisruotisButton();
        HomePage.enterName(expectedName);
        HomePage.enterLastName(expectedLastName);
        HomePage.enterEmail(expectedEmail);
        HomePage.enterPasword(expectedPassword);
        HomePage.enterPaswordConfirm(expectedPassword);
        HomePage.confirmButton();
        HomePage.clickFinalRegistruokisButton();

        Assert.assertTrue(
                actualMessage.contains(expectedName),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualMessage,
                        expectedName
            ));
        Assert.assertTrue(
                actualMessage.contains(expectedLastName),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualMessage,
                        expectedLastName
                ));
        Assert.assertTrue(
                actualMessage.contains(expectedEmail),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualMessage,
                        expectedEmail
                ));
        Assert.assertTrue(
                actualMessage.contains(expectedPassword),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualMessage,
                        expectedPassword
                ));
        HomePage.sleep(2000);

    }

    @Test
    private void loginWhitNegativeInfo() {
        String expectedEmail = "marius@acheta.lt";
        String actualEmail = null;
        String expectedNegativePassword = "Kamuoliukas006";
        String actualNegativePassword = null;
        HomePage.clickPersonButtonIcon();
        HomePage.enterEmailLogin(expectedEmail);
        HomePage.enterPaswordLogin(expectedNegativePassword);
        HomePage.clickPrisijungtiButton();

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

    @Test
    private void loginWhitPositiveInfo() {
        String expectedCorrectPassword = "Kamuoliukas003";
        String actualCorrectPassword = null;
        String expectedEmail = "marius@acheta.lt";
        String actualEmail = null;
        HomePage.clickPersonButtonIcon();
        HomePage.enterEmailLogin(expectedEmail);
        HomePage.enterCorrectPasword(expectedCorrectPassword);
        HomePage.clickPrisijungtiButton();

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

