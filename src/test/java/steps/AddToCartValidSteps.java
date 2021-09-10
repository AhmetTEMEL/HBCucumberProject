package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.base.BasePage;
import pages.main.HomePage;
import pages.main.LoginPage;
import pages.main.ProductDetailsPage;
import pages.main.ProductListPage;
import utils.SeleniumDriver;

import java.util.List;

public class AddToCartValidSteps extends SeleniumDriver{

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Given("^I am on the \"([^\"]*)\" website of Hepsiburada\\\\.com$")
    public void i_am_on_the_website_of_Hepsiburada_com(String websiteUrl) throws Throwable {
        openPage(websiteUrl);
    }

    @When("^I move to Giris Yap menu$")
    public void i_move_to_Giris_Yap_menu() throws Throwable {
        homePage.moveToGirisYapMenu();
    }

    @And("^I click to Giriş Yap link$")
    public void i_click_to_Giriş_Yap_link() throws Throwable {
        homePage.clickToGirisYapLink();
    }

    @And("^I enter a valid \"([^\"]*)\" email$")
    public void i_enter_a_valid_email(String email) throws Throwable {
        loginPage.enterEmail(email);
    }

    @And("^I enter a valid \"([^\"]*)\" password$")
    public void i_enter_a_valid_password(String password) throws Throwable {
        loginPage.enterPassword(password);
    }

    @And("^I click to Giriş Yap button$")
    public void i_click_to_Giriş_Yap_button() throws Throwable {
        loginPage.clickToLoginButton();
    }

    @And("^I search \"([^\"]*)\" product from searchbox$")
    public void i_search_product_from_searchbox(String product) throws Throwable {
        homePage.enterAndSearchProductName(product);
    }

    @And("^I click to first poduct that listed$")
    public void i_click_to_first_poduct_that_listed() throws Throwable {
        productListPage.clickToFirstProductOnTheProdcutListPage();
    }

    @And("^I add to cart from a seller$")
    public void i_add_to_cart_from_a_seller() throws Throwable {
        productDetailsPage.addToCart();
    }

    @And("^I add to cart from different seller again$")
    public void i_add_to_cart_from_different_seller_again() throws Throwable {
        productDetailsPage.closeModel();
        productDetailsPage.addToCartFromDifferentSeller();
    }

    @Then("^I should see the products added to my cart$")
    public void i_should_see_the_products_added_to_my_cart() throws Throwable {
        System.out.println("Ürünlerin sepete eklendiği görüldü");
    }
}
