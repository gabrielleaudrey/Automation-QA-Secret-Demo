@tag1
Feature: Checkout Feature

  @tag1
  Scenario: Successfully Checkout Product
    Given browser is open4
    Given user is on login page4
    When user enters standard_user and secret_sauce4
    And click on login button4
    Then user is navigated to the home page4
    When user click button add to cart of Sauce Labs Backpack2
    Then Cart icon on top right will displayed 1 item on cart2
    When user click cart icon on top right2
    Then user is navigated to cart page2
    Then Cart page will display 1 Sauce Labs Backpack in cart2
    When user click button Checkout
    Then user is navigated to checkout step one page
    When user fill first name, last name, zip code
    When user click button Continue
    Then user is navigated to checkout step two page
    When user click button Finish
    Then user is navigated to checkout complete page and message Thank you for your order! displayed
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
