Feature: Creating user on  users page

  Background:
    Given the user is on the login page
    When user login as "student_username"
    And navigate to "users" module

  @EUG16-253 @EUG16-224
  Scenario: add users with valid info
    And click Add User
    And creates new user using following information
      | Full Name  | Mike Smith                       |
      | Email      | mikesmith@email.com              |
      | Password   | 12345                            |
      | User Group | Students                         |
      | Status     | Active                           |
      | Start Date | 11-04-2020                       |
      | End Date   | 11-04-2030                       |
      | Address    | 100 Same st, Anytown, USA, 10001 |
    Then the message  "the user has been created" should be displayed

  @EUG16-254 @EUG16-224
  Scenario: Closing the adding user
    And click Add User
    And click close button
    Then verify closing the “adding”

  @EUG16-255 @EUG16-224
  Scenario: edit user info
    And click Edit User
    And do some valid changes
      | Full Name | Smith Mike          |
      | Email     | smithmike@email.com |
    Then verify editing

  @EUG16-256 @EUG16-224
  Scenario: Closing the editing user
    And click Edit User
    And click close button
    Then verify closing the editing
