$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SearchBox.feature");
formatter.feature({
  "name": "As a user ,I should able to search book",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "searching a specific book by column names",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EUG16-260"
    }
  ]
});
formatter.step({
  "name": "verify the search with following \"\u003ccolumnInfo\u003e\" information",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "columnInfo"
      ]
    },
    {
      "cells": [
        "The Idiot"
      ]
    },
    {
      "cells": [
        "Fyodor Dostoevsky"
      ]
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
  "location": "com.library.step_definitions.LoginStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to books module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.dashboardInformation_StepDef.navigate_to_books_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "searching a specific book by column names",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EUG16-260"
    }
  ]
});
formatter.step({
  "name": "verify the search with following \"The Idiot\" information",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.SearchBox_StepDefs.verify_the_search_with_following_information(java.lang.String)"
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
  "location": "com.library.step_definitions.LoginStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to books module",
  "keyword": "And "
});
formatter.match({
  "location": "com.library.step_definitions.dashboardInformation_StepDef.navigate_to_books_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "searching a specific book by column names",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EUG16-260"
    }
  ]
});
formatter.step({
  "name": "verify the search with following \"Fyodor Dostoevsky\" information",
  "keyword": "Then "
});
formatter.match({
  "location": "com.library.step_definitions.SearchBox_StepDefs.verify_the_search_with_following_information(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});