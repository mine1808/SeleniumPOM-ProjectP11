package pagesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator
    By username = By.id("username");
    By password = By.id("password");
    By submitBtn = By.id("submit");


    // Method
    public void inputUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void inputPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickBtn() {
        driver.findElement(submitBtn).click();
    }
}
