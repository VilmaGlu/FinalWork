package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.CustomerAccountPage;
import lt.pages.Lemodus.NaujienosPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Naujienos extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CustomerAccountPage.open("https://www.lemodus.lt/moterims/naujienos");

    }

    @Test
    private void toBaySomeDress() {
        String xpectedChooseProduct  = "Prekių krepšelis";
        String actualChooseProduct;

        NaujienosPage.clickOnChooseDress();
        NaujienosPage.clickOnSize();
        NaujienosPage.clickOnIKrepseli();
        NaujienosPage.clickOnShowcart();
        NaujienosPage.clickOnCheckCart();
        NaujienosPage.clickOnDeleteCart();
        NaujienosPage.submitFormPage();
        NaujienosPage.clickCancelButton();


        actualChooseProduct = NaujienosPage.readMessage();
        Assert.assertEquals(actualChooseProduct, xpectedChooseProduct);

    }
}
