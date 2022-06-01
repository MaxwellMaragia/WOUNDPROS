Feature: Verify the process of adding patient card details

  Background: Navigate to login page and login
    Given Navigate to Woundpros login page
    When Enter username and Password
    And Click on login button
    Then User should be logged in with success message "Login success"

  @AddPatient @AddPatientCard
  Scenario: Validate add patient insurance information
    Given User clicks on patient menu from dashboard
    Then Click on newly created patient
    Then Click + under insurance information
    Then Enter Insurance plan as "Jubilee Insurance"
    Then Enter policy number
    Then Enter phone number
    Then Enter fax
    Then Enter copay due
    Then Select priority
    Then Enter contact person name
    Then Save Insurance Information
    Then Verify success message alert "Insurance added successfully"