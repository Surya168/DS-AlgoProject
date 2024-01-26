Feature: Verifying Stack Page functionalities

  Background: Flow till Stack Page
    Given User is in the Home page after login
    When User clicks Get Started button in Stack pane
    Then User should be in the Stack page

  Scenario Outline: Testing Operations in Stack link
    When The User navigates to tryEditor page by clicking Operations in Stack link
    Then User enters code in tryEditor of Operations in Stack link page
    And click on Run
    Then User should get the output for Operations in stack sneraio

  Scenario Outline: Testing Creating Implementation link
    When The User navigates to tryEditor page by clicking Implementation link
    Then User enters code in tryEditor of Implementation link
    And click on Run
    Then User should get the output for Implementation scenario

  Scenario Outline: Testing Applications in Stack link
    When User navigates to tryEditor page by clicking Applications link
    Then The User enters code in tryEditor of Applications link
    Then User should get the output for Applications scenario
