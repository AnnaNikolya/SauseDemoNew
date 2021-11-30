package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LoginPage extends BasePage {

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        private static final By USERNAME_INPUT = By.xpath("//*[@id='user-name']");
        private static final By PASSWORD_INPUT = By.xpath("//*[@id='password']");
        private static final By LOGIN_BUTTON = By.xpath("//*[@id='login-button']");
        private static final By BOT_LOGO = By.xpath("//*[@class='bot_column']");

        @Step("Login as '{username}' with '{password}'")
        public void login(String username, String password) {
            waitForElementLocated(USERNAME_INPUT, 10);
            driver.findElement(USERNAME_INPUT).sendKeys(username);
            driver.findElement(PASSWORD_INPUT).sendKeys(password);
            driver.findElement(LOGIN_BUTTON).click();
        }

        public void waitForPageOpened() {
            waitForElementLocated(BOT_LOGO, 10);
        }

        public void typeTextInFrames() {
            driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
            driver.findElement(By.id("tinymce")).sendKeys("asdsd");
            driver.switchTo().defaultContent();
        }

        //public void actiomExample() {
        //  Actions action = new Actions(driver);
        //  action.dragAndDrop()
        //  }

        public void fileUpload(String filePath){
            driver.findElement(By.xpath("//input[@id='file_upload']")).sendKeys("/Users/annanikolaevna/IdeaProjects/SouceDemo/README); driver.findElement(By.xpath("Кнопка старта загрузки")).click();
                    wait.until(ExceptedConditions.invisibilytyOf(load));
        }
    }
}
