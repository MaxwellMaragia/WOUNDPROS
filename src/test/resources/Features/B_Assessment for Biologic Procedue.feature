Feature: Verify the process of patient assessment for Biologic Procedure

  Background: Navigate to login page and login
    Given Navigate to Woundpros login page
    When Enter username and Password
    And Click on login button
    Then User should be logged in with success message "Login success"

  @PatientAssessmentBiologic @boom
  Scenario: Validate the process of patient assessment for Biologic procedure
    Given User clicks on patient menu from dashboard
    Then User selects newly created patient
    Given User clicks on newly created appointment
    Then Add assessment for "Biologics"
    Then Start assessment for "Biologics"
    Then Select treatment number "Pre-treatment Assessment - Lower Extremity"
    #steps for biologic
    Then Click on add biologic button
    Then Select biologic "Skye Biologics Woundfix"
    Then Select graft size and enter quantity as "2"
    #end steps for biologic
    Then Add circulation and neurologic status
    Then Select Comorbidities as "Type 1 Diabetes"
    Then Add primary care physician as "DR Alfred Livingstone"
    Then Click create assessment button
    Then Verify success message alert "creating Assessment"
    Then Verify success message alert "Assessment created"

  @PatientAssessmentBiologic @BiologicsOrdering @boom
  Scenario: Validate the process of patient assessment for Biologic procedure
    Given User clicks on patient menu from dashboard
    Then User selects newly created patient
    Given User clicks on newly created appointment
    Then Add assessment for "Biologics Ordering"
    Then Start assessment for "Biologics Ordering"
    Then Click create assessment button
    Then Verify success message alert "creating Assessment"
    Then Verify success message alert "Assessment created"

  @PatientAssessmentBiologic @BiologicsApplication @boom
  Scenario: Validate the process of patient assessment for Biologic procedure
    Given User clicks on patient menu from dashboard
    Then User selects newly created patient
    Given User clicks on newly created appointment
    Then Add assessment for "Biologics Application"
    Then Start assessment for "Biologics Application"
    Then Select previous evaluation date
    Then Upload graft details
    Then Verify success message alert "Getting graft details"
    Then Verify success message alert "Graft OCR details loaded"
    Then Click create assessment button
    Then Verify success message alert "creating Assessment"
    Then Verify success message alert "Assessment created"






