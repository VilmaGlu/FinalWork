package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class LoginPage {
    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                Locators.Lemodus.Login.inputExpectedEmail);
    }

    public static void enterPaswordLogin(String negativePassword) {
        Common.sendKeysToElement(
                negativePassword,Locators.Lemodus.Login.inputNegativePasword
        );
    }

    public static void clickPrisijungtiButton() {
        Common.cickPrisijungti(Locators.Lemodus.Login.inputPrisijungtiButton);
    }

    public static void enterCorrectPasword(String correctPassword) {
        Common.sendKeysToElement(correctPassword,Locators.Lemodus.Login.inputCorrectPasword
        );


    }

    public static void clickPersonButtonIcon() {
        Common.clickOnElement(Locators.Lemodus.Home.headerPersonButton);
    }
}

