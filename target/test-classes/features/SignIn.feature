Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @Regresion @FunctionalTestCases @tc-001
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'phantom.test@gmail.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  @tc001
  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                          | password  |
      | phantom.test@gmail.com         | Tek@12345 |
      | phantom.capstone1@tekschool.us | Tek@12345 |
      | phantom.capstone@tekschool.us  | Tek@12345 |

  @dryRun @smokeTest @Regression @registerAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email | password  | confirmPassword |
      | name | email | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
