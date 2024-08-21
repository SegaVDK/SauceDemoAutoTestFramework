package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage {

    WebDriver driver;

    By title = By.xpath("//span[@class ='title']");
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueButton = By.id("continue");

    public YourInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Проверяем появление элемента Checkout: Your Information на странице")
    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    @Step ("Вводим валидные значения в поля firstName, lastName и ZIP/Postal Code")
    public void dataEntry(String firstName, String lastName, String postalCode) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    @Step("Нажимаем на кнопку Continue")
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

}
