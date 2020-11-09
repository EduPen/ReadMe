Feature:

  @Background:
  Given the user is on the login page


  @EUG16-259  @EUG16-224
  Scenario Outline:verify login
    When user enter <email> and enter <password>
    Then user logged in page

    Examples:
      | email               | password |
      | student70@library   | FPEDLRY3 |
      | student91@library   | c4vlSAqZ |
      | student92@library   | 7kPVRH29 |
      | librarian18@library | rKG2sP88 |


  @EUG16-257  @EUG16-224
  Scenario:verify role login
    When user login as “usertype”
    Then title contains “page”


  @EUG16-264  @EUG16-224
  Scenario Outline:Enter with invalid credentials

    When Users login with invalid "<email>" and "<password>"
    Then Error message "Sorry, Wrong Email or Password" display
    Examples:
      | email             | password |
      | invalid           | FPEDLRY3 |
      | student91@library | invalid  |
      |                   | FPEDLRY3 |
      | student91@library |          |
      |                   |          |