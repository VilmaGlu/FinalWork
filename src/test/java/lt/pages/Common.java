package lt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Common {


    public static void setUp() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.openUrl(url);
    }

    public static void close() {
        Driver.close();
    }
    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static WebElement getElement(By locator){
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(String expectedName, By xpath) {
        getElement(xpath).sendKeys(expectedName);

    }

    public static void clicPersonIcon(By xpath) {
        getElement(xpath).click();
    }

    public static void clickRegistrokis(By xpath) {
        getElement(xpath).click();
    }

    public static void clickConfirm(By xpath) {
        getElement(xpath).click();
    }

    public static void clickFinalRegistruokis(By xpath) {
        getElement(xpath).click();
    }

    public static void cickPrisijungti(By xpath) {
        getElement(xpath).click();
    }


    public static void clickOnElement(By xpath) {
        getElement(xpath).click();
    }
}

