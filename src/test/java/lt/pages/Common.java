package lt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class Common {


    public static void setUp() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.openUrl(url);
    }

    public static void closeDriver() {
        Driver.close();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }


    public static void clicPersonIcon(By Locators) {
        getElement(Locators).click();
    }

    public static void clickRegistrokis(By Locators) {
        getElement(Locators).click();
    }

    public static void clickConfirm(By Locators) {
        getElement(Locators).click();
    }

    public static void clickFinalRegistruokis(By Locators) {
        getElement(Locators).click();
    }

    public static void cickPrisijungti(By Locators) {
        getElement(Locators).click();
    }


    public static void clickOnElement(By Locators) {
        getElement(Locators).click();
    }

    public static void waitForElementShow(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);

    }

    public static String getElementText( By locator) {
        return getElement(locator).getText();
    }
}


