$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Borrowing.feature");
formatter.feature({
  "name": "Borrowing books",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@D"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user login as \"usertype\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.library.step_definitions.logout_StepDef.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Borrowing the book",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@D"
    },
    {
      "name": "@EUG16-247"
    }
  ]
});
formatter.step({
  "name": "Click “borrow book button\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the message “The book has been borrowed” is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.library.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user login as \"usertype\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.library.step_definitions.logout_StepDef.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Returning the book",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@D"
    },
    {
      "name": "@EUG16-246"
    },
    {
      "name": "@EUG16-224"
    }
  ]
});
formatter.step({
  "name": "navigate to \"borrowing book\" page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click \"return button\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify that barrowed book returned",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});