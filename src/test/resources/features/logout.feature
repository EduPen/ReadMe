@logout
Feature: As a user, I should be able to logout from the library app


  @EUG16-261  @EUG16-224
  Scenario: Verify logout
    Given the user is on the login page
    When user login as "usertype"
    And user logged out
    Then verify user is on the login page
