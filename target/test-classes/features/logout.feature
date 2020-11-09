Feature: logout

  @EUG16-261  @EUG16-224
  Scenario: Verify logout

    Given the user is on the login page
    When user login as "usertype"
    And titles contains "page"
    And user click log out
    Then user is on the login page
