package Tests.Lemodus;

import Tests.TestBase;
import lt.pages.Lemodus.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {


    @Test
    private void registrationWhitPositiveInfo() {
        String expectedName = "Vilma";
        String expectedLastName = "Glusauske";
        String expectedEmail = "Vilmaboga@gmail.com";
        String realPassword = "Kamuoliukas003";

        HomePage.clickPersonButtonIcon();
        HomePage.clickRegisruotisButton();
        HomePage.enterName(expectedName);
        HomePage.enterLastName(expectedLastName);
        HomePage.enterEmail(expectedEmail);
        HomePage.enterPasword(realPassword);
        HomePage.enterPaswordConfirm(realPassword);
        HomePage.confirmButton();
        HomePage.clickFinalRegistruokisButton();
    }

    @Test
    private void loginWhitNegativeInfo() {
        String expectedEmail = "Vilmaboga@gmail.com";
        String negativePassword = "Kamuoliukas006";
        HomePage.clickPersonButtonIcon();
        HomePage.enterEmailLogin(expectedEmail);
        HomePage.enterPaswordLogin(negativePassword);
        HomePage.clickPrisijungtiButton();
    }

    @Test
    private void loginWhitPositiveInfo() {
        String correctPassword = "Kamuoliukas003";;
        String expectedEmail = "Vilmaboga@gmail.com";
        HomePage.clickPersonButtonIcon();
        HomePage.enterEmailLogin(expectedEmail);
        HomePage.enterCorrectPasword(correctPassword);
        HomePage.clickPrisijungtiButton();
    }
}

