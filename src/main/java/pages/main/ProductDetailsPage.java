package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class ProductDetailsPage extends BasePage {

    private final By addToCartButton = By.xpath("//button[@id='addToCart']");
    private final By addToCartButton2 = By.xpath("//tr[1]//button[1]");
    private final By closeModel = By.xpath("//a[@class='checkoutui-Modal-2iZXl']//*[local-name()='svg']");

    public void addToCart(){
        clickToElement(addToCartButton);
    }

    public void addToCartFromDifferentSeller(){
        clickToElement(addToCartButton2);
    }

    public void closeModel(){
        clickToElement(closeModel);
    }

}
