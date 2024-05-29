package pagesPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessPage {

    WebDriver driver;

    public SuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator
    By congratulationMessage = By.xpath("//*[contains(text(),'Congratulations')]");


    // Method
    public void getCongratulationMessage() {
        driver.findElement(congratulationMessage).isDisplayed();
    }

    public String getActualUrl(){
        return driver.getCurrentUrl();
    }
}