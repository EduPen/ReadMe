@logout
Feature: As a user, I should be able to logout from the library app
  Background:
    Given the user is on the login page

  @EUG16-259  @EUG16-224
  Scenario Outline: verify login
    When user enter "<email>" and enter "<password>"
    And user logged out
    Then verify user is on the login page

    Examples:
      | email               | password |
      | student70@library   | FPEDLRY3 |
      | student91@library   | c4vlSAqZ |
      | student92@library   | 7kPVRH29 |
      | librarian18@library | rKG2sP88 |



  @EUG16-261  @EUG16-224
  Scenario: Verify logout
    When user login as "usertype"
    And user logged out
    Then verify user is on the login page
