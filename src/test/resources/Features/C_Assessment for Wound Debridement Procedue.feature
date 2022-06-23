Feature: Verify the process of patient assessment for Wound Debridement Procedure

  Background: Navigate to login page and login
    Given Navigate to Woundpros login page
    When Enter username and Password
    And Click on login button
    Then User should be logged in with success message "Login success"

  @PatientAssessmentWoundDebridement @sanity
  Scenario: Validate the process of patient assessment for Wound Debridement procedure
    Given User clicks on patient menu from dashboard
    Then User selects newly created patient
    Given User clicks on newly created appointment
    Then Add assessment for "Wound Debridement"
    Then Start assessment for "Wound Debridement"
    Then Add anaesthesia used as "Yes"
    Then Add debridement type as "Mechanical Debridement"
    Then Add Vascular measurements
    Then Add Neurology measurements
    Then Click create assessment button
    Then Verify success message alert "creating Assessment"
    Then Verify success message alert "assessment Created"





