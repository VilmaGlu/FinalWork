package lt.pages.Lemodus;

import lt.pages.Common;
import lt.pages.Locators;

public class CustomerAccountPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickSearchField() {
        Common.clickOnElement(Locators.Lemodus.CustomerAccont.searchField);
    }

    public static void clickAutcoplete() {
        Common.clickOnElement(Locators.Lemodus.CustomerAccont.autocompletePosition);
    }

    public static void enterProductSuknele(String expectedMesage) {
        Common.sendKeysToElement(expectedMesage,
                Locators.Lemodus.CustomerAccont.enterProduct);
    }
}

