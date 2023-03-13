Feature: Login page

  Background:
    Given Navigate to the login page
    When user enter the username and password

@testl
  Scenario: login to google
    Given user click on submit for "sagar"
    Then logged in user should match with this name "sagar"



  Scenario Outline:  login to google
    Given user click on submit for "<username>"
    And user logins in to application with "<username>"

    Examples:
      |username|
      |sagar   |
      |Pavan   |