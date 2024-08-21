import org.testng.Assert;
import org.testng.annotations.Test;

public class CriticalPathTest extends BaseTest {

    @Test(testName = "Заказ товара")
    public void placeOrder()  {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.isPageOpened();
        productPage.clickAddToCart("Sauce Labs Bike Light");
        productPage.clickAddToCart("Sauce Labs Backpack");
        productPage.clickCart();
        cartPage.isPageOpened();
        cartPage.clickCheckout();
        yourInformationPage.isPageOpened();
        yourInformationPage.dataEntry("Ivan", "Ivanov", "1111");
        yourInformationPage.clickContinue();
        overviewPage.isPageOpened();
        overviewPage.clickFinish();
        completePage.isPageOpened();
        completePage.clickBackHomeButton();
        productPage.isPageOpened();
    }
}
