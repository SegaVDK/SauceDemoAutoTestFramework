import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import pages.CartPage;
//import pages.CheckOutPage;
import pages.*;
//import pages.ProductPage;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    YourInformationPage yourInformationPage;
    OverviewPage overviewPage;
    CompletePage completePage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        yourInformationPage = new YourInformationPage(driver);
        overviewPage = new OverviewPage(driver);
        completePage = new CompletePage(driver);

    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
