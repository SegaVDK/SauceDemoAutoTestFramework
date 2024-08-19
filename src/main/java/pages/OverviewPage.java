package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    WebDriver driver;

    By title = By.xpath("//span[@class ='title']");
    By finishButton = By.id("finish");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void isPageOpened() {
        driver.findElement(title).isDisplayed();
    }

    public void clickFinish() {
        driver.findElement(finishButton).click();
    }
}
