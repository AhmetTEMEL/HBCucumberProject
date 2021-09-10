package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class ProductDetailsPage extends BasePage {

    private final By ADD_TO_CART_BUTTON = By.xpath("//button[@id='addToCart']");
    private final By ADD_TO_CART_BUTTON_2 = By.xpath("//tr[1]//button[1]");
    private final By CLOSE_MODAL = By.xpath("//a[@class='checkoutui-Modal-2iZXl']//*[local-name()='svg']");

    public void addToCart(){
        clickToElement(ADD_TO_CART_BUTTON);
    }

    public void addToCartFromDifferentSeller(){
        clickToElement(ADD_TO_CART_BUTTON_2);
    }

    public void closeModel(){
        clickToElement(CLOSE_MODAL);
    }

}
