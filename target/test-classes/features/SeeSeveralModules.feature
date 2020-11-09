Feature:

	#US:As a user, I should be able to see several modules once login.

  Background:
    Given the user is on the login page
    When user login as "usertype"

  @EUG16-263 @EUG16-224
  Scenario: Library App See several modules once login (librarians)

    Then user see following modules
      | Dashboard       |
      | Books           |
      | Borrowing Books |


  @EUG16-228 @EUG16-224
  Scenario: Library App See several modules once login (students)
    Then user see following modules
      | Books           |
      | Borrowing Books |




