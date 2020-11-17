@Barrow
Feature:Borrowing books

  Background:
    Given the user is on the login page
    When user login as "students"


	#As a student, I should be able to borrow a book from the Books page
  @EUG16-247
  Scenario: Borrowing the book
    And navigate to books module
    And click Borrow book button
    Then the message “The book has been borrowed” is displayed


	#As a student, I should be able to return the book from borrowing books page
  @EUG16-246 @EUG16-224
  Scenario: Returning the book
    And navigate to borrowing book page
    And click Return book button
    Then the message “The book has been returned” is displayed