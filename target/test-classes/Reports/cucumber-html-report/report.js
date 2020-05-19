$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Linkined.feature");
formatter.feature({
  "line": 2,
  "name": "linkedin Website",
  "description": "",
  "id": "linkedin-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@linkedin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "validate the login functionality",
  "description": "",
  "id": "linkedin-website;validate-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "linkedin-website;validate-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 12,
      "id": "linkedin-website;validate-the-login-functionality;;1"
    },
    {
      "cells": [
        "sweta.p.singh@gmail.com",
        "Yati@123"
      ],
      "line": 13,
      "id": "linkedin-website;validate-the-login-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "validate the login functionality",
  "description": "",
  "id": "linkedin-website;validate-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@linkedin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter \"sweta.p.singh@gmail.com\" and \"Yati@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});