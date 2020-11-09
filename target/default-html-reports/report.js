$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/dashboardInformation.feature");
formatter.feature({
  "name": "As a librarian, I should able to see total books, users and borrowed books information on the Dashboard page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Dash"
    },
    {
      "name": "@EUG16-224"
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
formatter.step({
  "name": "navigate to \"books module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Total borrowed books number on Dashboard",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Dash"
    },
    {
      "name": "@EUG16-224"
    },
    {
      "name": "@EUG16-262"
    }
  ]
});
formatter.step({
  "name": "calculate total borrowed books number",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "navigate to \"dashboard module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the barrowed books number are equal",
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
formatter.step({
  "name": "navigate to \"books module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Total users number on Dashboard",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Dash"
    },
    {
      "name": "@EUG16-224"
    },
    {
      "name": "@EUG16-222"
    }
  ]
});
formatter.step({
  "name": "calculate total books number",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "navigate to \"dashboard module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the users  number are equal",
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
formatter.step({
  "name": "navigate to \"books module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Total books number on Dashboard",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Dash"
    },
    {
      "name": "@EUG16-224"
    },
    {
      "name": "@EUG16-223"
    }
  ]
});
formatter.step({
  "name": "calculate total (active and inactive ) users",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "navigate to \"dashboard module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify the books numbers are equal",
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