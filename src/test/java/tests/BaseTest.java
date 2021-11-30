package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.CartPage;
import pages.ProductsPage;

public class BaseTest {

    @Listeners()
    public sealed class BaseTest permits CartTests {
        WebDriver driver;
        LoginPage loginPage;
        ProductsPage productsPage;
        CartPage cartPage;
        ProductSteps productsSteps;
        CartSteps cartSteps;

        @BeforeMethod
        public void initTest() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            loginPage = new LoginPage(driver);
            productsPage = new ProductsPage(driver);
            cartPage = new CartPage(driver);
        }
        @AfterMethod(alwaysRun = true)
        public void closeDriver() {
            driver.quit();
        }

    driver.manage()
        String driverVariable()
    }
}
