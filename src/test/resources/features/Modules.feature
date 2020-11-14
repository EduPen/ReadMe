Feature: As a librarian, I should able to see three modules on Dashboard page


  @EUG16-251 @EUG16-224
  Scenario: Librarian should see three modules on Dashboard page
  =  Given the user is on the login page
    When user login as "librarian_username"
    Then users see following modules
      | Users          |
      | Books          |
      | Borrowed Books |