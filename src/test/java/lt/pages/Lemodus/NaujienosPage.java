package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class NaujienosPage {
    public static void clickOnChooseDress() {
        Common.clickOnElement(Locators.Lemodus.Naujienos.clickOnDress);
    }

    public static void clickOnSize() {
        Common.clickOnElement(Locators.Lemodus.Naujienos.clickLabelSize);
    }

    public static void clickOnIKrepseli() {
        Common.clickOnElement(Locators.Lemodus.Naujienos.clickOnButtonAddToCart);
    }

    public static void sleep(int millis) {
        Common.sleep(millis);
    }

    public static void clickOnShowcart() {
        Common.clickOnElement(Locators.Lemodus.Naujienos.openShowcart);
    }

    public static void clickOnCheckCart() {
        Common.clickOnElement(Locators.Lemodus.Naujienos.checkCart);
    }

    public static void clickCancelButton() {
        Common.clickOnElement(Locators.Lemodus.PositiveLogin.pageSubmitCancel);
    }

    public static void clickOnDeleteCart() {
        Common.clickOnElement(Locators.Lemodus.Naujienos.deleteCart);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.Lemodus.Naujienos.pageTitle);
    }
}
