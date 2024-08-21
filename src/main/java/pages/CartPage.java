package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

     WebDriver driver;

    By title = By.xpath("//span[@class = 'title']");
    By checkoutButton = By.id("checkout");
    String cartItem = "//div[text() = '%s']";
    String cartRemoveButton = "//div[text() = '%s']/ancestor::div[@class = 'cart_item_label']" +
            "/descendant::div[@class = 'item_pricebar']/button";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Проверяем появление элемента Your Cart на странице")
    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    @Step("Нажимаем на кнопку Checkout")
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    @Step("Сравниваем добавленный ранее товар и находящийся в корзине ")
    public void cartItemCheck(String productName) {
        driver.findElement(By.xpath(String.format(cartItem, productName))).isDisplayed();
    }

    @Step("Нажимаем на кнопку Remove у товара с указанным именем")
    public void clickRemoveButton(String productName) {
        driver.findElement(By.xpath(String.format(cartRemoveButton, productName))).click();
    }

}
