package lt.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Lemodus {


        public static class Home {
            public static By headerPersonButton = By.xpath(
                    "//*[contains(@class,'header-account')]");
            public static By forgetPassword = By.xpath(
                    "//*[contains(@class,'action remind')]");
            public static By inputEmail = By.xpath("//*[@id='email_address']");
            public static By submitButton = By.xpath("//*[contains(@class,'action submit primary')]");
            public static By acceptCookie =
                    By.xpath("//*[@id='omnisend-form-63243c3f018728915f150995-close-icon']");
            public static By readMessageEmailBox = By.xpath("//*[@id='email_address']");
        }

        public static class CustomerAccont {
            public static By searchField = By.xpath("//*[@id='search']");
            public static By autocompletePosition = By.xpath("//*[@id='search_autocomplete']");

            public static By realPassword = By.xpath("//*[@id='password']");
            public static By enterProduct = By.xpath("//*[@id='search']");
            public static By selectProductList = By.xpath(
                    "//*[@id='amasty-shopby-product-list']/div[1]/div[3]/div/div[1]");
            public static By selectpPriseLow = By.xpath(
                    "//*[@id='amasty-shopby-product-list']/div[1]/div[3]/div/div[2]/div[3]");
            public static By listOfRole = By.xpath(
                    "//*[@id='narrow-by-list']/div[1]/div[2]/form/ul/li[2]/a/span[1]");
            public static By paragraphBox = By.xpath("//*[@id='search_mini_form']/div[1]");
        }

        public static class Naujienos {
            public static By clickOnDress =
                    By.xpath("//*[contains(@class,'product-image-wrapper')]");
            public static By clickLabelSize = By.xpath("//*[@id='option-label-size-144-item-27']");
            public static By clickOnButtonAddToCart = By.xpath("//*[@id='product-addtocart-button']");
            public static By openShowcart = By.xpath(
                    "//*[contains(@class,'action showcart')]");
            public static By checkCart = By.xpath(
                    "//*[contains(@class,'action viewcart button button--full-width button--secondary')]");
            public static By deleteCart = By.xpath(
                    "//*[contains(@class, 'action action-delete')]");

            public static By pageTitle = By.xpath("//*[@id='maincontent']/div[1]/h1/span");
        }

        public static class PositiveLogin {
            public static By inputExpectedEmail = By.xpath("//*[@id='email']");
            public static By inputCorrectPasword = By.xpath("//*[@id='pass']");
            public static By inputPrisijungtiButton = By.xpath("//*[@id='send2']");
            public static By pageSubmitCancel = By.xpath(
                    "//*[@id='omnisend-form-63243c3f018728915f150995-close-action']");
            public static By paragraphCurrentPassword = By.xpath(
                    "//*[@id='pass']");
            public static By paragraphEmail = By.xpath("//*[@id='email']");
            public static By logocheck = By.xpath("//*[contains(@class,'base')]");
            public static By loginpage = By.xpath("//*[contains(@class,'page-title-wrapper')]");
        }

        public static class NegativeLogin {
            public static By inputNegativePassword = By.xpath("//*[@id='pass']");
            public static By messageError = By.xpath("//*[@id='maincontent']/div[1]/div[2]");
        }
    }
}
