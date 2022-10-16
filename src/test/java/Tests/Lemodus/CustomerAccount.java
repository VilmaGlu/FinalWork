package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.CustomerAccountPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerAccount extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CustomerAccountPage.open("https://www.lemodus.lt/customer/account/index/");

    }

    @Test
    private void searchField() {
        String expectedMessage = "Suknele esprit casual";
        String actualMessage;

        CustomerAccountPage.clickSearchField();
        CustomerAccountPage.enterProductSuknele(expectedMessage);
        CustomerAccountPage.clickAutcoplete();
        CustomerAccountPage.clickOnForYou();
        CustomerAccountPage.clickOnPriseLowest();
        CustomerAccountPage.clickCategoryForMan();

        actualMessage = CustomerAccountPage.readMessageFromCustomerPage();
        Assert.assertEquals(actualMessage, expectedMessage);
        CustomerAccountPage.sleep(3000);



    }

}
