package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By EMAIL_TEXT_BOX = By.xpath("//input[@id='txtUserName']");
    private final By PASSWORD_TEXT_BOX = By.xpath("//input[@id='txtPassword']");
    private final By LOGIN_BUTTON = By.xpath("//button[contains(text(),'Giriş yap')]");

    public void enterEmail(String email){
        sendKeysToElement(EMAIL_TEXT_BOX,email);
    }

    public void enterPassword(String password){
        sendKeysToElement(PASSWORD_TEXT_BOX,password);
    }

    public void clickToLoginButton(){
        clickToElement(LOGIN_BUTTON);
    }

}
