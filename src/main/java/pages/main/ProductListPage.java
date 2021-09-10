package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class ProductListPage extends BasePage {

    private final By firstItemInProductList = By.xpath("//div[@id='cac-favorite']/following-sibling::li[1]");
    public String urun;
    private String mainXpathoFProducts = "//a/div[contains(.,\'";

    public void clickToFirstProductOnTheProdcutListPage(){
        clickToElement(firstItemInProductList);
    }

    public void clickToAProductName(String productName){
        mainXpathoFProducts = mainXpathoFProducts + productName + "')]";
        clickToElement(By.xpath(mainXpathoFProducts));
    }
}
