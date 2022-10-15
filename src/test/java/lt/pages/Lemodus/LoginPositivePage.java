package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class LoginPositivePage {
    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(
                Locators.Lemodus.PositiveLogin.inputExpectedEmail);
    }

    public static void enterPaswordLogin(String negativePassword) {
        Common.sendKeysToElement(
                Locators.Lemodus.PositiveLogin.inputNegativePasword
        );
    }

    public static void clickPrisijungtiButton() {
        Common.cickPrisijungti(Locators.Lemodus.PositiveLogin.inputPrisijungtiButton);
    }

    public static void enterCorrectPasword(String correctPassword) {
        Common.sendKeysToElement(Locators.Lemodus.PositiveLogin.inputCorrectPasword
        );


    }

    public static void clickPersonButtonIcon() {
        Common.clickOnElement(Locators.Lemodus.Home.headerPersonButton);
    }
}

