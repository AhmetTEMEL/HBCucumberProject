package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class ProductListPage extends BasePage {

    private final By FIRST_ITEM_IN_PRODUCT_LIST = By.xpath("//div[@id='cac-favorite']/following-sibling::li[1]");
    private String mainXpathoFProducts = "//a/div[contains(.,\'";

    public void clickToFirstProductOnTheProdcutListPage(){
        clickToElement(FIRST_ITEM_IN_PRODUCT_LIST);
    }

    public void clickToAProductName(String productName){
        mainXpathoFProducts = mainXpathoFProducts + productName + "')]";
        clickToElement(By.xpath(mainXpathoFProducts));
    }
}
