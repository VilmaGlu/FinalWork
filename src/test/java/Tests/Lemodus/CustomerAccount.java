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
        String expectedMessage = "";
        String actualMessage = "";

        CustomerAccountPage.clickSearchField();
        CustomerAccountPage.enterProductSuknele("Suknele esprit casual");
        CustomerAccountPage.clickAutcoplete();
        CustomerAccountPage.clickOnForYou();
        CustomerAccountPage.clickOnPriseLowest();
        CustomerAccountPage.clickCategoryForMan();

        actualMessage = CustomerAccountPage.readMessageFromCustomerPage();
        Assert.assertTrue(
                actualMessage.contains(expectedMessage),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        expectedMessage
                )
        );
    }

}

