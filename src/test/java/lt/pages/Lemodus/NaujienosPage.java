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
        Common.sleep(millis);}
}
