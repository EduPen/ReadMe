$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CreateUser.feature");
formatter.feature({
  "name": "Creating user on  users page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@c"
    }
  ]
});
formatter.scenario({
  "name": "add users with valid info",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@c"
    },
    {
      "name": "@EUG16-253"
    },
    {
      "name": "@EUG16-224"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user login as \"usertype\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "navigate to \"users module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click \"Add User\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the message  \"the user has been created\" should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Closing the adding user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@c"
    },
    {
      "name": "@EUG16-254"
    },
    {
      "name": "@EUG16-224"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user login as \"usertype\".",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "navigate to \"users module\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click \"Add User\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click close button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify closing the “adding”",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "edit user info",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@c"
    },
    {
      "name": "@EUG16-255"
    },
    {
      "name": "@EUG16-224"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user login as \"usertype\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click \"Edit User\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "do some valid changes",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify editing",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Closing the editing user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@c"
    },
    {
      "name": "@EUG16-256"
    },
    {
      "name": "@EUG16-224"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user login as \"usertype\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click \"Edit User\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click close button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify closing the “editing",
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