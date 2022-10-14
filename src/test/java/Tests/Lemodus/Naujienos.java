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
    private  void toBaySomeDress(){
    String expectedDress = "Moteriska suknele (ESPRIT Collection)";
    String actualDress = null;
        NaujienosPage.clickOnChooseDress();
        NaujienosPage.clickOnSize();
        NaujienosPage.clickOnIKrepseli();
        Assert.assertEquals(actualDress,expectedDress);


    }
}