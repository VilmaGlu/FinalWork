package lt.pages.Lemodus;

import lt.pages.Common;
import org.openqa.selenium.By;

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
                By.xpath("//input[@id='firstname']"));
    }

    public static void clickPersonButtonIcon() {
        Common.clicPersonIcon(
                By.xpath("//div[@class ='header-account']"));
    }

    public static void clickRegisruotisButton() {
        Common.clickRegistrokis(By.xpath("//*[@id='login-form']/div[1]/div[3]/div/div"));
    }

    public static void enterLastName(String expectedLastName) {
        Common.sendKeysToElement(expectedLastName,
                By.xpath("//*[@id='lastname']"));
    }

    public static void enterEmail(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                By.xpath("//*[@id='email_address']"));
    }

    public static void enterPasword(String realPassword) {
        Common.sendKeysToElement(realPassword,
                By.xpath("//*[@id='password']"));
    }

    public static void enterPaswordConfirm(String realPassword) {
        Common.sendKeysToElement(realPassword,
                By.xpath("//*[@id='password-confirmation']"));
    }

    public static void confirmButton() {
        Common.clickConfirm(By.xpath("//*[@id='custom_terms']"));
    }

    public static void clickFinalRegistruokisButton() {
        Common.clickFinalRegistruokis(By.xpath("//*[@id='form-validate']/div[1]/div[1]/button"));
    }


    public static void enterEmailLogin(String expectedEmail) {
        Common.sendKeysToElement(expectedEmail,
                By.xpath("//*[@id='email']"));
    }

    public static void enterPaswordLogin(String negativePassword) {
        Common.sendKeysToElement(negativePassword,
                By.xpath("//*[@id='pass']"));
    }

    public static void clickPrisijungtiButton() {
        Common.cickPrisijungti(By.xpath("//*[@id='send2']"));
    }

    public static void enterCorrectPasword(String correctPassword) {
        Common.sendKeysToElement(correctPassword,
        By.xpath("//*[@id='pass']"));


    }
}
