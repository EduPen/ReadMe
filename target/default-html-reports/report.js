$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchBox.feature");
formatter.feature({
  "name": "As a user ,I should able to search book",
  "description": "  Background\n    Given the user is on the login page\n    When user login as \"usertype\"",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "searching book with different categories",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EUG16-258"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "navigate to books module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.dashboardInformation_StepDef.navigate_to_books_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "categories list should have following names:",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
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