@Add-To-Cart
  Feature: Validation of adding product to cart

    @Add-To-Cart-Authanticated
      Scenario: Add Product To Cart with authantication
        Given I am on the "https://www.hepsiburada.com/" website of Hepsiburada\.com
        When I move to Giris Yap menu
        And I click to Giriş Yap link
        And I enter a valid "ahmet_temel88@hotmail.com" email
        And I enter a valid "258025A.t." password
        And I click to Giriş Yap button
        And I search "telefon" product from searchbox
        And I click to first poduct that listed
        And I add to cart from a seller
        And I add to cart from different seller again
        Then I should see the products added to my cart