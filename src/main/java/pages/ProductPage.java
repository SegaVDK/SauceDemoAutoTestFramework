package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

     WebDriver driver;

     By title = By.xpath("//span[@class = 'title']");
     String addToCartButton = "//div[text() = '%s']/ancestor::div[@class = 'inventory_item']//button";
     By cartButton = By.xpath("//a[@class = 'shopping_cart_link']");
     By sort = By.xpath("//select[@class = 'product_sort_container']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Нажимаем на кнопку Add to cart у товара с указанным именем")
    public void clickAddToCart(String productName) {
        driver.findElement(By.xpath(String.format(addToCartButton, productName))).click();
    }

    @Step("Нажимаем на кнопку корзины")
    public void clickCart() {
        driver.findElement(cartButton).click();
    }

   @Step("Проверяем появление элемента Products на странице")
    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    @Step("Сортируем товары по указанному принципу")
    public void selectSort(String sorting) {
        Select select = new Select(driver.findElement(sort));
        select.selectByVisibleText(sorting);
    }


}
