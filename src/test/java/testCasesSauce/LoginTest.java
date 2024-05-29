package testCasesSauce;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pagesSauce.HomePage;
import pagesSauce.LoginPage;

public class LoginTest {
    @Test
    public void login() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        //verify if the homepage contains text Products
        home.getTextProducts();

        //verify the current URL
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(home.getActualUrl(), expectedUrl);

        driver.quit();

    }
}
