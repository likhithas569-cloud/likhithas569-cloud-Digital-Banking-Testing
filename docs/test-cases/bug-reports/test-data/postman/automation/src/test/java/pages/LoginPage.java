import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginTest {

    WebDriver driver;

    LoginPage loginPage;


    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
    }


    @Test
    public void verifyValidLogin() {

        driver.get("https://fintrustbank.com/login");


        loginPage.enterUsername("testuser@fintrust.com");

        loginPage.enterPassword("ValidPassword123");

        loginPage.clickLogin();


        System.out.println("Login test completed successfully");
    }


    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
