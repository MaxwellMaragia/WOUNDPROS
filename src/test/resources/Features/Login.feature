Feature: User login

  Background: navigate
    Given Navigate to Woundpros login page


  Scenario: valide login test
    When Enter username "avery59@example.org" and Password "password956"
    And Click on login button
    Then User should be logged in with success message "Login success"






