import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @Test
    public void verifyValidLogin() {

        driver.get("https://fintrustbank.com/login");

        // Enter username
        // Enter password
        // Click login button

        System.out.println("Login test executed successfully");
    }


    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
