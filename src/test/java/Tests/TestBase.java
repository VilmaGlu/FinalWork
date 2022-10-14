package Tests;

import lt.pages.Lemodus.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class TestBase {

    @BeforeMethod
    public void setUp() {
        HomePage.setUp();
        HomePage.open("https://www.lemodus.lt/");

    }
    @AfterMethod
    public void tearDown() {
        HomePage.close();
    }
}
