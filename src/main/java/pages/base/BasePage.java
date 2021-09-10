package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = SeleniumDriver.getDriver();
        this.wait = new WebDriverWait(SeleniumDriver.getDriver(), SeleniumDriver.TIMEOUT);
    }

    protected void sendKeysToElement(By element,String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).sendKeys(text);
    }

    protected  void moveToElement(By element) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(element)).perform();
    }

    protected void clickToElement(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }

    protected void selectElementFromList(By element,String selection) {
        Select select = new Select(driver.findElement(element));
        select.selectByVisibleText(selection);
    }
}
