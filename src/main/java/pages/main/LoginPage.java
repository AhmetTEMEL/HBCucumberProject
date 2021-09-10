package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By emailTextBox = By.xpath("//input[@id='txtUserName']");
    private final By passwordTextBox = By.xpath("//input[@id='txtPassword']");
    private final By loginButton = By.xpath("//button[contains(text(),'Giriş yap')]");

    public void enterEmail(String email){
        sendKeysToElement(emailTextBox,email);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordTextBox,password);
    }
    public void clickToLoginButton(){
        clickToElement(loginButton);
    }

}
