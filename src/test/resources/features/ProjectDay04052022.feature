@project
Feature:

Background: Repeated first step scenario
  Given user navigates to the OrangeHRM application
  When user provides login "Admin" and password "admin123"
  And user selects dropdown with value "3"
  And user clicks on edit button
  And user sends project name "FreeWave Technologies, Inc. - FWT - Phase 1"
  Then user selects administration "64" from the dropdown
  And user provides hours
  And user clicks on save button


  Scenario: Validating edit save functionality
    Then user validates status is submitted

  Scenario: Validating remove row functionality
    When user clicks on edit button to remove


