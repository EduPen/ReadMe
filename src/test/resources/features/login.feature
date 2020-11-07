Feature:  verify login


  @EUG16-257
  Scenario: User Login scenario
    Given the user is on the login page
    When user login as “usertype”
    Then title contains “pag


  @EUG16-259

  Scenario Outline: user login to page
    Given the user is on the login page
    When user enter <email> and enter <password>
    Then user logged in page

    Examples:
      | email                |password     |
      | student70@library    |FPEDLRY3     |
      | student91@library    |c4vlSAqZ     |
      | student92@library    |7kPVRH29     |
      | librarian18@library  |rKG2sP88     |

