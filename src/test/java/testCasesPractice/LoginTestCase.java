package testCasesPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pagesPractice.LoginPage;
import pagesPractice.SuccessPage;

public class LoginTestCase {

        @Test
        public void logintest() {

            // Object Driver
            WebDriver driver;
            driver = new EdgeDriver();
            driver.get("https://practicetestautomation.com/practice-test-login/");

            // Maximize Windows Edge Browser
            driver.manage().window().maximize();

            // Calling Object From Page
            LoginPage loginPage = new LoginPage(driver);
            SuccessPage successPage = new SuccessPage(driver);

            // Method
            loginPage.inputUsername("student"); // Username
            loginPage.inputPassword("Password123"); // Password
            loginPage.clickBtn(); // Submit Button

            // Verify congratulationMessage
            successPage.getCongratulationMessage();

            // Verify url
            String expectedURL = "https://practicetestautomation.com/logged-in-successfully/";
            Assert.assertEquals(successPage.getActualUrl(), expectedURL);

            // quit driver
            driver.quit();
        }
}
