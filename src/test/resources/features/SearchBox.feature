Feature: As a user ,I should able to search book
  @EUG16-258
Scenario: searching book with different categories
Given the user is on the login page
When user login as "usertype"
And navigate to "books module" and click book categories
Then categories list should have following names:
| Action and   Adventure|
| Anthology    |
| Classic      |
|Comic and Graphic Novel|
|Crime and Detective|
|Drama|
|Fable|
|Fairy Tale|
|Fan-Fiction|
|Fantasy|
|Historical Fiction|
|Horror|
|Science Fiction|
|Biography/Autobiography|
|Humor|
|Romance|
|Short Story|
|Essay|
|Memoir|

Scenario Outline : searching a specific book by column names
  @EUG16-260
Given the user is on the login page
When user login as "usertype"
And navigate to "books module"
And search by <columnInfo>
Then verify the search with following column information
Examples:
| columnInfo |
|12345                |
| Selenium Book |
| Jamal D         |






