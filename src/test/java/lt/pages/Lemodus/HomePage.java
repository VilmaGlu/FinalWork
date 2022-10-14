package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class HomePage {



    public static void setUp() {
        Common.setUp();

    }

    public static void open(String url) {
        Common.openUrl(url);

    }

    public static void close() {
        Common.close();
    }

    public static void enterName(String expectedName) {
        Common.sendKeysToElement(expectedName,
                Locators.Lemodus.Home.inputName);
    }

    public static void clickPersonButtonIcon() {
        Common.clicPersonIcon(Locators.Lemodus.Home.headerPersonButton);
    }

    public static void clickRegisruotisButton() {
        Common.clickRegistrokis(Locators.Lemodus.Home.loginRegistruokisButton);
    }

    public static void enterLastName(String expectedLastName) {
        Common.sendKeysToElement(expectedLastName,
               Locators.Lemodus.Home.inputLastName);
    }

    public static void enterEmail(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
               Locators.Lemodus.Home.inputEmail);
    }

    public static void enterPasword(String realPassword) {
        Common.sendKeysToElement(realPassword,
                Locators.Lemodus.CustomerAccont.realPassword);
    }

    public static void enterPaswordConfirm(String realPassword) {
        Common.sendKeysToElement(realPassword,
               Locators.Lemodus.Home.inputPasword);
    }

    public static void confirmButton() {
        Common.clickConfirm(Locators.Lemodus.Home.inputConfirmPasword);
    }

    public static void clickFinalRegistruokisButton() {
        Common.clickFinalRegistruokis(Locators.Lemodus.Home.inputValidateForm);
    }


    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                Locators.Lemodus.Home.inputExpectedEmail);
    }

    public static void enterPaswordLogin(String negativePassword) {
        Common.sendKeysToElement(
                negativePassword,Locators.Lemodus.Home.inputNegativePasword
               );
    }

    public static void clickPrisijungtiButton() {
        Common.cickPrisijungti(Locators.Lemodus.Home.inputPrisijungtiButton);
    }

    public static void enterCorrectPasword(String correctPassword) {
        Common.sendKeysToElement(correctPassword,Locators.Lemodus.Home.inputCorrectPasword
        );


    }
}
