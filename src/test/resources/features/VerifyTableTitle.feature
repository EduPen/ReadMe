Feature: User should be able to see table with default titles

  Background:
    Given the user is on the login page

  @EUG16-252 @EUG16-224
  Scenario:Table columns names on books page
    When user login as "usertype"
    And navigate to "books module"
    Then verifies books table titles as
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |


  Scenario:Scenario: borrowing book tables name verification
    Given the user is on the login page
    When user login as "students"
    And navigate to "borrowing  book" page
    Then verifies borrowed books table titles as
      | Actions             |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned?        |