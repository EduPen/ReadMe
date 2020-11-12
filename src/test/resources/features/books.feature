
Feature: As a user, I should be able to see book records on user page

  Background:
    Given the user is on the login page
    When user login as "student"
    And navigate to "Books" module

  @wip
  @EUG16-242 @EUG16-224
  Scenario:  default record is
    Then the default record shows "10"


  @EUG16-267
  Scenario Outline:Show records for count options
    Then records options have numbers
    Examples:
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |

