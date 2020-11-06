

@dashboard
Feature:

	#User Story:
	#As a librarian, I should able to see total books, users and borrowed books information on the Dashboard page
  @EUG16-262 @EUG16-224
  Scenario: Total borrowed books number on Dashboard

    Given the user is on the login page
    When user login as "usertype"
    And navigate to "books module"
    And calculate total barrowed books number
    And navigate to "dashboard module"
    Then verify the barrowed books number are equal

  @EUG16-222 @EUG16-224
  Scenario: Total users number on Dashboard

    Given the user is on the login page
    When user login as "usertype"
    And navigate to "books module"
    And calculate total books number
    And navigate to "dashboard module"
    Then verify the users  number are equal


  @EUG16-223 @EUG16-224
  Scenario: Total books number on Dashboard

    Given the user is on the login page
    When user login as "usertype"
    And navigate to "books module"
    And calculate total (active and inactive ) users
    And navigate to "dashboard module"
    Then verify the books numbers are equal