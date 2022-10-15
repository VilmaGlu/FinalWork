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

    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
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

    public static void cickPrisijungti(By Locators) {
        getElement(Locators).click();
    }


    public static void clickOnElement(By xpath) {
        getElement(xpath).click();
    }

    public static void waitForElementShow(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void sendKeysToElement(String keys, By locator) {
        getElement(locator).sendKeys(keys);

    }
}


