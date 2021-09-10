package pages.main;

import pages.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By buyandsell = By.xpath("//a[normalize-space()='buy + sell']");
    private final By searchCars = By.xpath("//a[normalize-space()='Search Cars']");
    private final By kitapMuzikFilmHobi = By.xpath("//span[contains(text(),'Kitap, Müzik, Film, Hobi')]");
    private final By uzaktanKumandaliAraclar = By.xpath("//a[@class='sf-ChildMenuItems-3R6bj item-2124']//span[1]");
    private final By girisYapMenu = By.xpath("//span[@title='Giriş Yap']");
    private final By girisYapLink = By.xpath("//a[contains(text(),'Giriş Yap')]");
    private final By searchTextBox = By.xpath("//input[@placeholder='Ürün, kategori veya marka ara']");
    private final By searchButton = By.xpath("//div[@class='SearchBoxOld-buttonContainer']");

    public void clickToBuyAndSell() {
        moveToElement(buyandsell);
    }

    public void moveToGirisYapMenu(){
        moveToElement(girisYapMenu);
    }

    public void clickToGirisYapLink(){
        clickToElement(girisYapLink);
    }

    public void moveToKitapMuzikFilmHobi(){
        moveToElement(kitapMuzikFilmHobi);
    }

    public void clickToUzaktanKumandaliAraclar(){
        clickToElement(uzaktanKumandaliAraclar);
    }

    public void enterAndSearchProductName(String text) throws InterruptedException {
        sendKeysToElement(searchTextBox,text);
        Thread.sleep(1000);
        clickToElement(searchButton);
    }
}
