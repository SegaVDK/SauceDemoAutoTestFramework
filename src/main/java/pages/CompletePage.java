package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {

      WebDriver driver;

    By title = org.openqa.selenium.By.xpath("//span[@class ='title']");
    By backHomeButton = By.id("back-to-products");

    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Проверяем появление элемента Checkout: Complete! на странице")
    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    @Step("Нажимаем на кнопку BackHome")
    public void clickBackHomeButton() {
        driver.findElement(backHomeButton).click();
    }
}
