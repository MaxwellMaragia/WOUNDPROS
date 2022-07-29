Feature: Verify the process of adding patient health data details

  Background: Navigate to login page and login
    Given Navigate to Woundpros login page
    When Enter username and Password
    And Click on login button
    Then User should be logged in with success message "Login success"

  @AddPatient @AddPatientCard @registration @AddPatientHealthData
  Scenario: Validate add allergies health data
    Given User clicks on patient menu from dashboard
    Then Click on newly created patient
    Then Click on health data tab
    Then Click on allergies tab
    Then Click + under allergies
    Then Select Allergy type as "Drug Class"
    Then Select Allergen as "Pollen"
    Then Select Reaction as "Nasal"
    Then Select Status as "Active"
    Then Enter notes as "This is a note"
    Then Click create to save allergy
    Then Verify success message alert "added successfully"
