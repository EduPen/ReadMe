$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateUser.feature");
formatter.feature({
  "name": "Creating user on  users page",
  "description": "",
  "keyword": "Feature"
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
  "location": "com.library.step_definitions.LoginStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to user module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.CreateUser_StepDefs.navigate_to_user_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add users with valid info",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EUG16-253"
    },
    {
      "name": "@EUG16-224"
    }
  ]
});
formatter.step({
  "name": "click Add User",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.CreateUser_StepDefs.click_Add_User()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "creates new user using following information",
  "rows": [
    {},
    {},
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
  "location": "com.library.step_definitions.CreateUser_StepDefs.creates_new_user_using_following_information(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the message  \"the user has been created\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.CreateUser_StepDefs.the_message_should_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});