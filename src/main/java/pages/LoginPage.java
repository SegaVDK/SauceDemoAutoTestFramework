package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.xpath("//h3[@data-test = 'error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step ("Открываем страницу LoginPage")
    public void openPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @Step ("Вводим валидные значения в поля userName и password, нажимаем кнопку Login")
    public void login(String userName, String password) {
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    @Step ("Получаем текст ошибки")
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}