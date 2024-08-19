package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

     WebDriver driver;

    By title = By.xpath("//span[@class = 'title']");
    By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void isPageOpened() {
        driver.findElement(title).isDisplayed();

    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

}
