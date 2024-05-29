package pagesSauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By textProducts = By.xpath("//*[contains(text(), 'Products')]");

    public void getTextProducts() {
        driver.findElement(textProducts).isDisplayed();
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }
}