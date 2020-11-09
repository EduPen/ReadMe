Feature:As a librarian, I should be able to add a book from the books page

	@EUG16-268
	Scenario: Librarian adds new book by filling up with valid credentials
		 Given the user is on the login page
		 When user login as "usertype"
		 And navigate to "Books" module
		 And click "Add book" button
		 And creates new book using following information 
		    |Book Name     |Selenium Book       |
		    |Author        |Jamal D             |
		    |ISBN          |12345               |
		    |Year          |2020                |
		    |Book Category |Action and Adventure|
		    |Description   |                    |
		Then the message "the book has been added" should be displayed

	@EUG16-269
	Scenario: Edit the book information
		Given the user is on the login page
		When user login as "usertype"
		And navigate to Books module
		And click "Edit Book"
		And do some info changes
			|Book Name |Toni Morrison|
			|Author    |Beloved      |
		And click save changes
		Then verify the book info edited

	@EUG16-270
	Scenario: Cancel the editing
		When user login as "usertype"
		And navigate to Books module
		And click "Edit Book"
		And click close button
		Then verify the closing edit

	@EUG16-271
	Scenario: Cancel the add book by clicking the Cancel button
		Given the user is on the login page
		When user login as "usertype"
		And navigate to "Books" module.
		And click "Add book" button
		And click close button
		Then user is on the "Books" Module