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
    private void loginWhitNegativePasswordInfo() {
        String expectedNegativePassword = "";
        String actualNegativePassword = "";

        NegativeLogintPage.clickPersonButtonIcon();
        NegativeLogintPage.enterEmailLogin("VilmaBoga@gmail.com");
        NegativeLogintPage.enterPaswordLogin("Kamuoliukas006");
        NegativeLogintPage.clickPrisijungtiButton();
        NegativeLogintPage.errorMessageShow();


        actualNegativePassword = NegativeLogintPage.readPassword();
        Assert.assertEquals(actualNegativePassword, expectedNegativePassword);
    }


}
