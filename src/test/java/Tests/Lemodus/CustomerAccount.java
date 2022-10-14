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
        String expectedMesage = "Suknele esprit casual";
        String actualMesage = null;

        CustomerAccountPage.clickSearchField();
        CustomerAccountPage.enterProductSuknele(expectedMesage);
        CustomerAccountPage.clickAutcoplete();

        Assert.assertEquals(actualMesage,expectedMesage);

    }

}
