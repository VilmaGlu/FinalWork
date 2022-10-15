package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class NegativeLogintPage {
    public static void clickPersonButtonIcon() {
        Common.clickOnElement(Locators.Lemodus.Home.headerPersonButton);
    }

    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                Locators.Lemodus.PositiveLogin.inputExpectedEmail);
    }

    public static void enterPaswordLogin(String expectedNegativePassword) {
        Common.sendKeysToElement(expectedNegativePassword,
                Locators.Lemodus.NegativeLogint.inputNegativePasword);
    }

    public static void clickPrisijungtiButton() {
        Common.clickOnElement(Locators.Lemodus.PositiveLogin.inputPrisijungtiButton);
    }

    public static void open(String url) {
        Common.openUrl(url);
    }
}
