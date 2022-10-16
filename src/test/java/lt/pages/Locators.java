package lt.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Lemodus {


        public static class Home {
            public static By inputName = By.xpath("//input[@id='firstname']");
            public static By headerPersonButton = By.xpath("//div[@class ='header-account']");
            public static By forgetPassword = By.xpath("//*[@id='login-form']/fieldset/div[3]/div[2]/a");
            public static By inputEmail = By.xpath("//*[@id='email_address']");
            public static By submitButton = By.xpath("//*[@id='form-validate']/div[1]/div[1]/button");
            public static By acceptCookie =
                    By.xpath("//*[@id='omnisend-form-63243c3f018728915f150995-close-button']");


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
                    By.xpath("//*[@id='product-item-info_353647']/div[1]/a[2]");
            public static By clickLabelSize = By.xpath("//*[@id='option-label-size-144-item-24']");
            public static By clickOnButtonAddToCart = By.xpath("//*[@id='product-addtocart-button']");
            public static By openShowcart = By.xpath(
                    "//*[@id='html-body']/div[4]/header/div[2]/div/div/div/div/div[3]/div[2]/a");
            public static By checkCart = By.xpath(
                    "//*[@id='minicart-content-wrapper']/div[2]/div[5]/div");
            public static By deleteCart = By.xpath(
                    "//*[@id='shopping-cart-table']/tbody/tr[2]/td/div/a[2]");

            public static By pageTitle = By.xpath("//*[@id='html-body']");
        }

        public static class PositiveLogin {
            public static By inputExpectedEmail = By.xpath("//*[@id='email']");
            public static By inputPrisijungtiButton = By.xpath("//*[@id='send2']");
            public static By inputCorrectPasword = By.xpath("//*[@id='pass']");
            public static By clickLogOut = By.xpath("//*[@id='block-collapsible-nav']/div/a");
            public static By pageSubmit = By.xpath(
                    "//*[@id='omnisend-form-63243c3f018728915f150995-submit-form']");
            public static By pageSubmitCancel = By.xpath(
                    "//*[@id='omnisend-form-63243c3f018728915f150995-close-action']");
            public static By paragraphCurrentPassword = By.xpath(
                    "//*[@id='pass']");
            public static By paragraphEmail = By.xpath("//*[@id='email']");
        }

        public static class NegativeLogin {
            public static By inputNegativePassword = By.xpath("//*[@id='pass']");

        }

    }

}
