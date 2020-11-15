

@hulya
Feature: As a user, I should be able to see book records on user page



  @EUG16-242 @EUG16-224
  Scenario:  default record is 10
    Given the user is on the login page
    When user login as "students"
    And navigate to "Books" module
    Then the default record shows "10"


  @EUG16-267
  Scenario:Show records for count options
    Given the user is on the login page
    When user login as "students"
    And navigate to "Books" module
    Then records options have these numbers
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |

