Feature: As a user ,I should able to search book

  Background:
    Given the user is on the login page
    When user login as "usertype"
    And navigate to books module


  @EUG16-258
  Scenario: searching book with different categories
    Then categories list should have following names:
      | Action and   Adventure  |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |


  @EUG16-260
  Scenario Outline: searching a specific book by column names
    And search by "<columnInfo>"
    Then verify the search with following column information
    Examples:
      | columnInfo    |
      | 12345         |
      | Selenium Book |
      | Jamal D       |







