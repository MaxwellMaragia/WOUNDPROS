Feature: Verify the process of scheduling an appointment

  Background: Navigate to login page and login
    Given Navigate to Woundpros login page
#    When Enter username "avery59@example.org" and Password "password956"
    When Enter username "super_admin_1@example.com" and Password "password"
    And Click on login button
    Then User should be logged in with success message "Login success"

  @AddAppointment @sanity
  Scenario: Validate add patient test
    Given User clicks on patient menu from dashboard
    Then User selects newly created patient
    Then User clicks add appointment button
    Then User selects visit type as "New Visit"
    Then User enters date as today
    Then User enters timeslot as "09:45:00 pm" to "10:45:00 pm"
    Then User Selects newly created consultant
    Then User Selects wound location as "Arm"
    Then User Selects Procedue as "Podiatry"
    Then User Enters reason as "Accident"
    Then User Saves appointment
    Then Verify success message alert "Appointment created"
