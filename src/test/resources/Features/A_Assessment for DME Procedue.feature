Feature: Verify the process of patient assessment for DME Procedure

  Background: Navigate to login page and login
    Given Navigate to Woundpros login page
    When Enter username and Password
    And Click on login button
    Then User should be logged in with success message "Login success"

  @PatientAssessmentDME @sanity @Assessment
  Scenario: Validate the process of patient assessment for DME procedure
    Given User clicks on patient menu from dashboard
    Then User selects newly created patient
    Given User clicks on newly created appointment
    Then Add assessment for "DME"
    Then Start assessment for "DME"
    Then Select response to therapy as "is responding"
    Then Enter treatment filter as "W/ Biologic"
    Then Click get treatment button
    Then Verify success message alert "creating Assessment"
    Then Verify success message alert "Assessment created"
#    Then Select treatment scenario as "28HH -HOME HEALTH Lower extremities with LARGE size ABD PAD"
    Then Select treatment scenario as "68-WP"
#    Then Add treatment order item "A6449 Profore Latex Free Bandage System"
    Then Wait until treatment order item is generated "A6446 Bulk Roll Gauze"
#    Then Add plan of care as "Pat dry with gauze"
    Then Click select all under plan of care
    Then Click create assessment button
#    Then Click update assessment button
    Then Verify success message alert "Updating Assessment"
    Then Verify success message alert "Assessment updated"




