Feature: Verifying Que page functionalities

  Background: Flow till Queue Page
    Given User is in the Home page after successful login
    When User clicks Get Started button in Queue pane
    Then User should be in the Queue page

  Scenario Outline: Testing Implementation of Queue in Python link
    When The User navigates to tryEditor page by clicking Implementation of Queue in Python
    Then User enters code in tryEditor of Implementation of Queue in Python  page
    And click on Run button
    Then User should get the output for Implementation of Queue scenario

  Scenario Outline: Testing Creating Implementation using collectionsdeque link
    When The User navigates to tryEditor page by clicking Implementation using collectionsdeque
    Then User enters code in tryEditor of Implementation using collectionsdeque page
    And click on Run button
    Then User should get the output for Implementation using collectionsdeque scenario

  Scenario Outline: Testing Implementation using array link
    When User navigates to tryEditor page by clicking Implementation using array link
    Then The User enters code in tryEditor of Implementation using array
    Then User should get the output for Implementation using array scenario

  Scenario Outline: Testing Queue Operations link
    When User navigates to tryEditor page by clicking Queue Operations link
    Then The User enters code in tryEditor of Queue Operations
    Then User should get the output for Queue Operations scenario
