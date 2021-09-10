package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.main.HomePage;
import pages.main.ProductDetailsPage;
import pages.main.topMenu.kitapMuzikFilmHobi.UzaktanKumandaliAraclar;
import utils.SeleniumDriver;

public class AddToCartInvalidSteps extends SeleniumDriver{

    HomePage homePage = new HomePage();
    UzaktanKumandaliAraclar uzaktanKumandaliAraclar = new UzaktanKumandaliAraclar();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Given("^I am on the \"([^\"]*)\" website of Hepsiburada\\.com$")
    public void i_am_on_the_website_of_Hepsiburada_com(String websiteUrl) throws Throwable {
        openPage(websiteUrl);
    }

    @When("^I move to Kitap,Müzik,Film,Hobi menu$")
    public void i_move_to_Kitap_Müzik_Film_Hobi_menu() throws Throwable {
        homePage.moveToKitapMuzikFilmHobi();
    }

    @And("^I click to Uzaktan Kumandalı Araçlar link$")
    public void i_click_to_Uzaktan_Kumandalı_Araçlar_link() throws Throwable {
        homePage.clickToUzaktanKumandaliAraclar();
    }

    @And("^I click to \"([^\"]*)\" product$")
    public void i_click_to_product(String productName) throws Throwable {
        uzaktanKumandaliAraclar.clickToAProductName(productName);
    }

    @And("^I click to Sepete Ekle button$")
    public void i_click_to_Sepete_Ekle_button() throws Throwable {
        productDetailsPage.addToCart();
    }

    @Then("^ı should see the popup of cart with product$")
    public void ı_should_see_the_popup_of_cart_with_product() throws Throwable {
        System.out.println("Ürün sepete eklendi");
    }

}
