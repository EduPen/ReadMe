
@login
Feature:As a user, I should be able to login to the library app

  Background:
    Given the user is on the login page


  @EUG16-259  @EUG16-224
  Scenario Outline: verify login
    When user enter "<email>" and enter "<password>"
    Then user logged in page

    Examples:
      | email               | password |
      | student70@library   | FPEDLRY3 |
      | student91@library   | c4vlSAqZ |
      | student92@library   | 7kPVRH29 |
      | librarian18@library | rKG2sP88 |


  @EUG16-257  @EUG16-224
  Scenario: verify role login
    When user login as "usertype"
    Then title contains "Library"


 @EUG16-224 @son
  Scenario  Enter with invalid credentials

    When Users login with invalid "invalid" and "FPEDLRY3"
    And user gets this message: "Please enter a valid email address."

    When Users login with invalid "student91@library" and "invalid"
    And user gets this message: "Sorry, Wrong Email or Password"

    When Users login with invalid "" and "FPEDLRY3"
    And user gets this message: "This field is required."

    When Users login with invalid "student91@library" and ""
    And user gets this message: "Sorry, Wrong Email or Password"

    When Users login with invalid "" and ""
    And user gets this message: "This field is required."

