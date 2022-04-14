@regression @OMT-7924
Feature: Etsy Application search and filter functionality

  #@Before method will run here
  Background: Repeated first steps in each scenario
    Given user navigates to the Etsy application
    When user searches for "carpet"



  Scenario: Validating price range filter functionality for searched items
    And user applies for price filter over 1000
    Then user validates that the items price is equal or over 1000.00



    @OMT-7924
    Scenario: Validating search results
      Then user validates search result items contain keyword "carpet" or "rug"
      #@After method will run here
