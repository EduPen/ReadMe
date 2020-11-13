$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Modules.feature");
formatter.feature({
  "name": "As a librarian, I should able to see three modules on Dashboard page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Librarian should see three modules on Dashboard page",
  "description": "",
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
  "name": "user login as \"librarian_username\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.library.step_definitions.LoginStepDefs.user_login_as(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\r\n\tat com.library.pages.LoginPage.login(LoginPage.java:23)\r\n\tat com.library.step_definitions.LoginStepDefs.user_login_as(LoginStepDefs.java:71)\r\n\tat ✽.user login as \"librarian_username\"(file:///C:/Users/hhila/IdeaProjects/ReadMe/src/test/resources/features/Modules.feature:7)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});