package Tests.Lemodus;

import lt.pages.Lemodus.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest {

    @BeforeMethod
    private void setUp() {
        HomePage.setUp();
        HomePage.open("https://www.lemodus.lt/");

    }

    @Test
    private void test() {

    }

    @AfterMethod
    private void tearDown() {
        HomePage.close();
    }
}

