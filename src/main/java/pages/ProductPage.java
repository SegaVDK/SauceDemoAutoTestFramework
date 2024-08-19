package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

     WebDriver driver;

     By title = By.xpath("//span[@class = 'title']");
     String addToCartButton = "//div[text() = '%s']/ancestor::div[@class = 'inventory_item']//button";
     By cartButton = By.xpath("//a[@class = 'shopping_cart_link']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart(String productName) {
        driver.findElement(By.xpath(String.format(addToCartButton, productName))).click();
    }

    public void clickCart() {
        driver.findElement(cartButton).click();
    }

    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
     }
}
