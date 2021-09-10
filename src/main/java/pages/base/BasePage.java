package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumDriver;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = SeleniumDriver.getDriver();
        this.wait = new WebDriverWait(SeleniumDriver.getDriver(), SeleniumDriver.TIMEOUT);
    }

    protected void sendKeysToElement(By by,String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(text);
    }

    protected  void moveToElement(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).perform();
    }

    protected void clickToElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    protected void selectElementFromList(By by,String selection) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(selection);
    }
}
