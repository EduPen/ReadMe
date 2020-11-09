@Dash @EUG16-224
Feature: As a librarian, I should able to see total books, users and borrowed books information on the Dashboard page


  Background:
    Given the user is on the login page
    When user login as "usertype"
    And navigate to "books module"

  @EUG16-262
  Scenario: Total borrowed books number on Dashboard
    And calculate total borrowed books number
    And navigate to "dashboard module"
    Then verify the barrowed books number are equal

  @EUG16-222
  Scenario: Total users number on Dashboard
    And calculate total books number
    And navigate to "dashboard module"
    Then verify the users  number are equal

  @EUG16-223
  Scenario: Total books number on Dashboard
    And calculate total (active and inactive ) users
    And navigate to "dashboard module"
    Then verify the books numbers are equal