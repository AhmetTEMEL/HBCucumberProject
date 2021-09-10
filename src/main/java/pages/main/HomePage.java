package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By KITAP_MUZIK_FILM_HOBI = By.xpath("//span[contains(text(),'Kitap, Müzik, Film, Hobi')]");
    private final By UZAKTAN_KUMANDALI_ARACLAR = By.xpath("//a[@class='sf-ChildMenuItems-3R6bj item-2124']//span[1]");
    private final By GIRIS_YAP_MENU = By.xpath("//span[@title='Giriş Yap']");
    private final By GIRIS_YAP_LINK = By.xpath("//a[contains(text(),'Giriş Yap')]");
    private final By SEARCH_TEXT_BOX = By.xpath("//input[@placeholder='Ürün, kategori veya marka ara']");
    private final By SEARCH_BUTTON = By.xpath("//div[@class='SearchBoxOld-buttonContainer']");

    public void moveToGirisYapMenu(){
        moveToElement(GIRIS_YAP_MENU);
    }

    public void clickToGirisYapLink(){
        clickToElement(GIRIS_YAP_LINK);
    }

    public void moveToKitapMuzikFilmHobi(){
        moveToElement(KITAP_MUZIK_FILM_HOBI);
    }

    public void clickToUzaktanKumandaliAraclar(){
        clickToElement(UZAKTAN_KUMANDALI_ARACLAR);
    }

    public void enterAndSearchProductName(String text) throws InterruptedException {
        sendKeysToElement(SEARCH_TEXT_BOX,text);
        Thread.sleep(1000);
        clickToElement(SEARCH_BUTTON);
    }
}
