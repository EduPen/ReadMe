@Barrow
Feature:Borrowing books

  Background:
    Given the user is on the login page
    When user login as "usertype"


	#As a student, I should be able to borrow a book from the Books page
  @EUG16-247
  Scenario: Borrowing the book
    And Click borrow book button
    Then the message “The book has been borrowed” is displayed


	#As a student, I should be able to return the book from borrowing books page
  @EUG16-246 @EUG16-224
  Scenario: Returning the book
    And navigate to borrowing book page
    And click return button
    Then verify that borrowed book returned