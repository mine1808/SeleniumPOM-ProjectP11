package objectSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;

    public LoginObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getInputUsername() {
        return By.id("user-name");
    }

    public By getInputPassword() {
        return By.id("password");
    }

    public By getLoginBtn() {
        return By.id("Login-button");
    }
}
