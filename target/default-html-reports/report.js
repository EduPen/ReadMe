$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddBooks.feature");
formatter.feature({
  "name": "As a librarian, I should be able to add a book from the books page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Elif"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as \"librarian\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"Books\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.navigateToModule(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Librarian adds new book by filling up with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Elif"
    },
    {
      "name": "@EUG16-268"
    }
  ]
});
formatter.step({
  "name": "click Add book button",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.clickAddBookButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates new book using following information",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.createsNewBookUsingFollowingInformation(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the message \"The book has been created.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.theMessageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as \"librarian\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"Books\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.navigateToModule(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit the book information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Elif"
    },
    {
      "name": "@EUG16-269"
    }
  ]
});
formatter.step({
  "name": "click Edit Book",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.clickEditBook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "do some info changes",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.doSomeInfoChanges(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click save changes",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.clickSaveChanges()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the book info edited",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.verifyTheBookInfoEdited()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as \"librarian\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"Books\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.navigateToModule(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancel the editing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Elif"
    },
    {
      "name": "@EUG16-270"
    }
  ]
});
formatter.step({
  "name": "click Edit Book",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.clickEditBook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the closing edit",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.verifyTheClosingEdit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click close button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.clickCloseButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login as \"librarian\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to \"Books\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.navigateToModule(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancel the add book by clicking the Cancel button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Elif"
    },
    {
      "name": "@EUG16-271"
    }
  ]
});
formatter.step({
  "name": "click Add book button",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.clickAddBookButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click close button",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.clickCloseButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Books Module",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.AddBooksStepDefs.userIsOnTheBooksModule()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});