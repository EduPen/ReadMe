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


  @EUG16-224 @log
  Scenario Outline: Enter with invalid credentials
    Given the user is on the login page
    When Users login with invalid "<email>" and "<password>"
    Then Error "<message>" display
    Examples:
      | email             | password | message                             |
      | student91@library | ABC123   | Sorry, Wrong Email or Password      |
      | email @emal       | c4vlSAqZ | Please enter a valid email address. |
      | ABC               |          | Please enter a valid email address. |
      |                   | c4vlSAqZ | This field is required.             |
      | student91@library |          | Sorry, Wrong Email or Password      |
      |                   |          | This field is required.             |




