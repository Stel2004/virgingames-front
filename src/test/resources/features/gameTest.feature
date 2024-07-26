Feature: Virgin Games to access the login page and verify.

  @regression
  Scenario: User should be able to click on Login button and go to login page
    Given I am on home page "https://www.virgingames.com/"
    When  I click on login button
    Then  I should be on login-page "https://www.virgingames.com/quick-login"

