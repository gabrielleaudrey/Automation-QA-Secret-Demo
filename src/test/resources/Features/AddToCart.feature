
@tag1
Feature: Add To Cart Feature

  @tag1
  Scenario: Successfully Add Product To Cart 
    Given browser is open3
    Given user is on login page3
    When user enters standard_user and secret_sauce3
    And click on login button3
    Then user is navigated to the home page3
    When user click button add to cart of Sauce Labs Backpack
    Then Cart icon on top right will displayed 1 item on cart
    When user click cart icon on top right
    Then user is navigated to cart page
    Then Cart page will display 1 Sauce Labs Backpack in cart


  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
