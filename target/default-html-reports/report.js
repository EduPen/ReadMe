$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Modules.feature");
formatter.feature({
  "name": "As a librarian, I should able to see three modules on Dashboard page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Librarian should see three modules on Dashboard page",
  "description": " \u003d   Given the user is on the login page",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EUG16-251"
    },
    {
      "name": "@EUG16-224"
    }
  ]
});
formatter.before({
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
  "name": "users see following modules",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.Modules_StepDefs.users_see_following_modules(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});