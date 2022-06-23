Feature: Verify the process of patient assessment for Podiatry Procedure

  Background: Navigate to login page and login
    Given Navigate to Woundpros login page
    When Enter username and Password
    And Click on login button
    Then User should be logged in with success message "Login success"

  @PatientAssessmentPodiatry @sanity
  Scenario: Validate the process of patient assessment for Podiatry procedure
    Given User clicks on patient menu from dashboard
    Then User selects newly created patient
    Given User clicks on newly created appointment
    Then Add assessment for "Podiatry"
    Then Start assessment for "Podiatry"
#    Then Verify success message alert "creating Assessment"
#    Then Verify success message alert "Assessment created"
#    Then Select treatment scenario as "HOME HEALTH Lower extremities with LARGE size ABD PAD"
#    Then Wait until treatment order item is generated "A6446 Bulk Roll Gauze"
#    Then Add plan of care as "Pat dry with gauze"
#    Then Click select all under plan of care
    Then Click create assessment button
    Then Verify success message alert "creating Assessment"
    Then Verify success message alert "Assessment Created"