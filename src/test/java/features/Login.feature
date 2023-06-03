#Author: hebbarkarthik02@gmail.com
Feature: Login

  @smoketest
  Scenario Outline: Login with valid credentials
    Given I am on the login page of the website
    When I enter the username <username>
    And I enter the password <password>
    And I click on Login button
    Then I should be able to login successfully
    And I should be navigated to the Homepage of the application

    Examples: 
      | username   | password |
      | bapanuser1 | Test@123 |