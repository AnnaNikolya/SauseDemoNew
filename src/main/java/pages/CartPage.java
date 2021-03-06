package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage  extends BasePage{
        public CartPage(WebDriver driver) {
    super(driver);
}

        private static final String CART_URL = "/cart.html";
        private static final String PRODUCT_PRICE = "//*[text()='%s']/ancestor::*[@class='cart_item']//*[@class='inventory_item_price']";



        public String getProductPrice(String productName) {
            return driver.findElement(By.xpath(String.format(PRODUCT_PRICE, productName))).getText();
        }
        @Step
        public void openPage(){
            openPage(BASE_URL + CART_URL);
            return this;
        }
}

