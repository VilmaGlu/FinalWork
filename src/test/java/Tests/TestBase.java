package Tests;

import lt.pages.Lemodus.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
