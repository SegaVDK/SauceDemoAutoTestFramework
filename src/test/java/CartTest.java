import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test(testName = "Проверка добавления товаров в корзину")
    public void addToCart() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.clickAddToCart("Sauce Labs Bike Light");
        productPage.clickAddToCart("Sauce Labs Backpack");
        productPage.clickCart();
        cartPage.cartItemCheck("Sauce Labs Bike Light");
        cartPage.cartItemCheck("Sauce Labs Backpack");

    }

    @Test(testName = "Проверка удаления товаров из корзины")
    public void removeFromCart()  {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.clickAddToCart("Sauce Labs Bike Light");
        productPage.clickAddToCart("Sauce Labs Backpack");
        productPage.clickCart();
        cartPage.clickRemoveButton("Sauce Labs Bike Light");
        cartPage.clickRemoveButton("Sauce Labs Backpack");


    }
}
