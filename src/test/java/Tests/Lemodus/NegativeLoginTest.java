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
        String expectedEmail = "vilmaautotest@gmail.com";
        String actualEmail;
        String expectedNegativePassword = "Kamuoliukas006";
        String actualNegativePassword;
        NegativeLogintPage.clickPersonButtonIcon();
        NegativeLogintPage.enterEmailLogin(expectedEmail);
        NegativeLogintPage.enterPaswordLogin(expectedNegativePassword);
        NegativeLogintPage.clickPrisijungtiButton();


        actualEmail = NegativeLogintPage.readEmail();
        Assert.assertEquals(actualEmail,expectedNegativePassword);

        actualNegativePassword = NegativeLogintPage.readPassword();
        Assert.assertEquals(actualNegativePassword,expectedEmail);

        HomePage.sleep(2000);
    }


}
