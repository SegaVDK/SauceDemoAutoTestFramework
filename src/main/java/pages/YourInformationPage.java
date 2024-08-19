package pages;

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

    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    public void dataEntry(String firstName, String lastName, String postalCode) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

}
