package lt.pages;

public class NegativeLogintPage {
    public static void clickPersonButtonIcon() {
        Common.clickOnElement(Locators.Lemodus.Home.headerPersonButton);
    }

    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(Locators.Lemodus.PositiveLogin.inputExpectedEmail);
    }

    public static void enterPaswordLogin(String expectedNegativePassword) {
        Common.clickOnElement(Locators.Lemodus.NegativeLogint.inputNegativePasword);
    }

    public static void clickPrisijungtiButton() {
        Common.clickOnElement(Locators.Lemodus.PositiveLogin.inputPrisijungtiButton);
    }
}
