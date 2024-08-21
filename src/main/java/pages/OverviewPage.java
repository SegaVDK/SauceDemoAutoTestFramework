package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    WebDriver driver;

    By title = By.xpath("//span[@class ='title']");
    By finishButton = By.id("finish");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Проверяем появление элемента Checkout: Overview на странице")
    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    @Step("Нажимаем на кнопку Finish")
    public void clickFinish() {
        driver.findElement(finishButton).click();
    }
}
