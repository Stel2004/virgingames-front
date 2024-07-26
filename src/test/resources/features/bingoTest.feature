Feature: Virgin Games

  Background: I am On Homepage

  @regression
  Scenario: User should be able to click on Login button and go to login page
    Given I am on home pages "https://www.virgingames.com/"
    When  I click on Blog menu link
    Then  I should be on Bingo page and verified the page heading

