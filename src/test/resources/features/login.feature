@Login
Feature: Only authorized users should be able to login
  Description: The purpose of this feature is to test the Login functionality

  @librarian
  Scenario: Login as a librarian
    Given the user enter valid librarian credentials "librarian18@library" "rKG2sP88"
    Then the user should be able to login

  @student
  Scenario: Login as a student
    Given the user enter valid student credentials "student91@library" "c4vlSAqZ"
    Then the user should be able to login