package lt.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Lemodus{

        public static class Home{
            public static By inputName =  By.xpath("//input[@id='firstname']");
            public static By headerPersonButton = By.xpath("//div[@class ='header-account']");
            public static By loginRegistruokisButton =
                    By.xpath("//*[@id='login-form']/div[1]/div[3]/div/div");
            public static By inputLastName =  By.xpath("//*[@id='lastname']");
            public static By inputEmail = By.xpath("//*[@id='email_address']");
            public static By inputPasword = By.xpath("//*[@id='password-confirmation']");
            public static By inputConfirmPasword = By.xpath("//*[@id='custom_terms']");
            public static By inputValidateForm = By.xpath("//*[@id='form-validate']/div[1]/div[1]/button");
            public static By inputExpectedEmail =  By.xpath("//*[@id='email']");
            public static By inputNegativePasword =  By.xpath("//*[@id='pass']");
            public static By inputPrisijungtiButton = By.xpath("//*[@id='send2']");
            public static By inputCorrectPasword = By.xpath("//*[@id='pass']");





        }

        public static class CustomerAccont{
            public static By searchField = By.xpath("//*[@id='search']");
            public static By autocompletePosition = By.xpath("//*[@id='search_autocomplete']");

            public static By realPassword =  By.xpath("//*[@id='password']");
            public static By enterProduct = By.xpath("//*[@id='search']");
        }

        public static class Naujienos{
            public static By clickOnDress =
                    By.xpath("//*[@id='product-item-info_353647']/div[1]/a[2]");
            public static By clickLabelSize = By.xpath("//*[@id='option-label-size-144-item-24']");
            public static By clickOnButtonAddToCart = By.xpath("//*[@id='product-addtocart-button']");
        }
    }

}
