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

    public static void closeDrive() {
        Common.closeDriver();
    }
    public static void sleep(int millis) {
        Common.sleep(millis);}

    public static void clickPersonButtonIcon() {
        Common.clicPersonIcon(Locators.Lemodus.Home.headerPersonButton);
    }

    public static void clickOnForgotPassword() {
        Common.clickRegistrokis(Locators.Lemodus.Home.forgetPassword);
    }



    public static void enterEmail(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                Locators.Lemodus.Home.inputEmail);
    }


    public static void confirmButton() {
        Common.clickConfirm(Locators.Lemodus.Home.submitButton);
    }


    public static void cancelOnSubmit() {
        Common.waitForElementShow(Locators.Lemodus.Home.acceptCookie);

    }


    public static String readMessage() {
        return  Common.getElementText(Locators.Lemodus.Home.readMessageEmailBox);
    }
}




