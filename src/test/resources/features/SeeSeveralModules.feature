Feature:

	#US:As a user, I should be able to see several modules once login.

  @EUG16-263 @EUG16-224
  Scenario Outline: Library App See several modules once login (librarians)

    Given the user is on the login page
    When user login as "usertype"
    Then user see following modules
      Examples:
      |Dashboard|
      | Books |
      | Borrowing Books|

  @EUG16-228 @EUG16-224
  Scenario Outline: Library App See several modules once login (students)

    Given the user is on the login page
    When user login as "usertype"
    Then user see following modules
       Examples:
      | Books |
      | Borrowing Books|


