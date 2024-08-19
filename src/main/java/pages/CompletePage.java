package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {

      WebDriver driver;

    By title = org.openqa.selenium.By.xpath("//span[@class ='title']");
    By backHomeButton = By.id("back-to-products");

    public CompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    public void clickBackHomeButton() {
        driver.findElement(backHomeButton).click();
    }
}
