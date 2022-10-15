package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class LoginPositivePage {
    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                Locators.Lemodus.PositiveLogin.inputExpectedEmail);

    }

    public static void clickPrisijungtiButton() {
        Common.cickPrisijungti(Locators.Lemodus.PositiveLogin.inputPrisijungtiButton);
    }

    public static void enterCorrectPasword(String correctPassword) {
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

    public static void clickLogOutButton() {
        Common.clickOnElement(Locators.Lemodus.PositiveLogin.clickLogOut);
    }

    public static void submitFormPage() {
        Common.waitForElementShow(Locators.Lemodus.PositiveLogin.pageSubmit);
    }

    public static void clickCancelButton() {
        Common.clickOnElement(Locators.Lemodus.PositiveLogin.pageSubmitCancel);
    }
}

