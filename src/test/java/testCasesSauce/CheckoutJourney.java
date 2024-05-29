package testCasesSauce;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pagesSauce.HomePage;
import pagesSauce.LoginPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckoutJourney {

    public String url = "https://www.saucedemo.com";

    public String expectedUrl = "https://www.saucedemo.com/inventory.html";

    public WebDriver driver;

    @BeforeEach
    public void setup() {
        this.driver = new EdgeDriver();
        this.driver.manage().window().maximize();;
        this.driver.get(url);
    }
    @Test
    public void checkout() {

        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        //assertions
        home.getTextProducts();
        Assert.assertEquals(home.getActualUrl(), expectedUrl);
    }
    @AfterEach
    public void terminateBrowser() {
        driver.quit();
    }
}
