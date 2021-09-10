package pages.main.topMenu.kitapMuzikFilmHobi;

import pages.base.BasePage;
import pages.main.ProductListPage;

public class UzaktanKumandaliAraclar extends BasePage {

    ProductListPage productListPage = new ProductListPage();

    public void clickToAProductName(String product){
        productListPage.clickToAProductName(product);
    }
}
