Feature:

	#As a student, I should be able to borrow a book from the Books page
  @EUG16-247
  Scenario Outline: Borrowing the book

    Given the user is on the login page
    When user login as "usertype"
    And Click “borrow book button"
    Then the message “The book has been borrowed” is displayed

Feature:

	#User Sory:
	#
	#As a student, I should be able to return the book from borrowing books page
  @EUG16-246 @EUG16-224
  Scenario: Returning the book
    Given the user is on the login page
    When user login as "usertype"
    And navigate to "borrowing book" page
    And click "return button"
    Then verify that barrowed book returned