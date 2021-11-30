package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private static final String ADD_PRODUCT_TO_CART_BUTTON = "//*[text()='%s']/ancestor::*[@class='inventory_item']//button";
    private static final String REMOVE_PRODUCT_TO_CART_BUTTON = "//*[text()='%s']/ancestor::*[@class='inventory_item']//button";


    public void addProductToCart(String productName) {
        waitForElementLocated(driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART_BUTTON, productName))), 10);
        WebElement addProductToCartButton = driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART_BUTTON, productName)));
        addProductToCartButton.click();


        //TODO
        //List <WebElement> removeButtonList = driver.findElements(By.xpath(String.format(ADD_PRODUCT_TO_CART_BUTTON, productName)));
        //Assert.assertTrue(removeButtonList.isEmpty()); //используется только на страницах с тестами, проверяет отсутствие элемента
    }

    public void addProductToCart() {
    }
}
