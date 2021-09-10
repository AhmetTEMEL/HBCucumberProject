@Add-To-Cart-2
Feature: Validation of adding product to cart

  @Add-To-Cart-NonAuthanticated
  Scenario: Add Product To Cart without authantication
    Given I am on the "https://www.hepsiburada.com/" website of Hepsiburada.com
    When I move to Kitap,Müzik,Film,Hobi menu
      | Menu                    |
      | Kitap,Müzik,Film,Hobi   |
    And I click to Uzaktan Kumandalı Araçlar link
    And I click to "DJI Ryze Tello Drone Yedek Pervane Seti (4 Adet)" product
    And I click to Sepete Ekle button
    Then I should see the products added to my cart