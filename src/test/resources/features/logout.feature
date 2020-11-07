Feature: As a user, I should be able to logout from the library app.
  @EUG16-261
  Scenario: User LogOut
    Given the user is on the login page
    When user login as "usertype"
    Then titles contains "page"
    When user click log out
    Then user is on the login page
