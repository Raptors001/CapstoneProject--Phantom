@LabSession
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'alex1@gmail.com' and password 'Tek@1234'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Alexx' and Phone '5713956255'
    And User click on Update button
    Then user profile information should be updated
