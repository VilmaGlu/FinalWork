package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class LoginPage {
    public static void enterPasswordLogin(String expectedNegativePassword) {
        Common.sendKeysToElement(expectedNegativePassword,
                Locators.Lemodus.NegativeLogin.inputNegativePassword);
    }
    public static String readPassword() {
        return Common.getElementText(
                Locators.Lemodus.PositiveLogin.inputCorrectPasword);
    }
    public static void errorMessageShow() {
        Common.waitForElementShow(Locators.Lemodus.NegativeLogin.messageError);
    }

    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                Locators.Lemodus.PositiveLogin.inputExpectedEmail);
    }
    public static void clickPrisijungtiButton() {
        Common.cickPrisijungti(Locators.Lemodus.PositiveLogin.inputPrisijungtiButton);
    }
    public static void enterCorrectPassword(String correctPassword) {
        Common.sendKeysToElement(correctPassword,
                Locators.Lemodus.PositiveLogin.inputCorrectPasword
        );
    }
    public static void clickPersonButtonIcon() {

        Common.clickOnElement(Locators.Lemodus.Home.headerPersonButton);
    }
    public static void open(String url) {
        Common.openUrl(url);
    }
    public static String successfulLogin() {
        return  Common.waitForElementShow(Locators.Lemodus.PositiveLogin.loginpage);
    }
}



