Feature: User should be able to see table with default titles

  @EUG16-252 @EUG16-224
  Scenario Outline: Verify the table title
    Given the user is on the login page
    When the user logs in as <usertype>
    And goes to Books tab
    Then verifies table titles as

    Examples:
      | usertype    |
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |
