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
    private void registrationWhitPositiveInfo() {
        String expectedName = "Vilma";
        String expectedLastName = "Glusauske";
        String expectedEmail = "glubogavilma@gmail.com";
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
        HomePage.cancelOnSubmit();
        HomePage.cickOnLogOut();

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
}

