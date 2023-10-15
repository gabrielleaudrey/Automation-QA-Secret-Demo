
@tag1
Feature: Filter Product Feature

  @tag1
  Scenario: Successfully filter products
    Given browser is open2
    Given user is on login page2
    When user enters standard_user and secret_sauce2
    And click on login button2
    Then user is navigated to the home page2
    When user click filter combo box
    When user click combo box option price (low to high)
    Then the product will displayed sort by price low to high


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
