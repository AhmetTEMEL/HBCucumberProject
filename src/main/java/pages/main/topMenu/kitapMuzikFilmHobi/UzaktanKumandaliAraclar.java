package pages.main.topMenu.kitapMuzikFilmHobi;

import pages.base.BasePage;
import pages.main.ProductListPage;

public class UzaktanKumandaliAraclar extends BasePage {

    ProductListPage porduct = new ProductListPage();

    public void clickToAProductName(String product){
        porduct.clickToAProductName(product);
    }
}
