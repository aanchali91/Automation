$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Bddtest.feature");
formatter.feature({
  "line": 2,
  "name": "BddTests",
  "description": "",
  "id": "bddtests",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BddTests"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on scenario \"Background\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Background",
      "offset": 18
    }
  ],
  "location": "BddTestStepdefinitions.i_am_on_scenario(String)"
});
formatter.result({
  "duration": 166650500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "First scenario",
  "description": "",
  "id": "bddtests;first-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SA"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on Scenario1 of \"Logo validation\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Open Firefox and start application",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "logo image is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "BddTestStepdefinitions.open_Firefox_and_start_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BddTestStepdefinitions.logo_image_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 266200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on scenario \"Background\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Background",
      "offset": 18
    }
  ],
  "location": "BddTestStepdefinitions.i_am_on_scenario(String)"
});
formatter.result({
  "duration": 92000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Top Right links",
  "description": "",
  "id": "bddtests;top-right-links",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@SB"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Open Firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Links check with \"Contact us\" and \"Sign in\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click \"Sign in\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BddTestStepdefinitions.open_Firefox_and_start_application()"
});
formatter.result({
  "duration": 21878262900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contact us",
      "offset": 18
    },
    {
      "val": "Sign in",
      "offset": 35
    }
  ],
  "location": "BddTestStepdefinitions.links_check_with_and(String,String)"
});
formatter.result({
  "duration": 280368000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 7
    }
  ],
  "location": "BddTestStepdefinitions.click(String)"
});
formatter.result({
  "duration": 4481793000,
  "status": "passed"
});
formatter.after({
  "duration": 240100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Test Login",
  "description": "",
  "id": "bddtests;test-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@SASC"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "open_Firefox_and_start_application",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I login with \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Validate message",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "bddtests;test-login;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 25,
      "id": "bddtests;test-login;;1"
    },
    {
      "cells": [
        "abcd@gmail.com",
        "",
        "Mercury"
      ],
      "line": 26,
      "id": "bddtests;test-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on scenario \"Background\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Background",
      "offset": 18
    }
  ],
  "location": "BddTestStepdefinitions.i_am_on_scenario(String)"
});
formatter.result({
  "duration": 219600,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Test Login",
  "description": "",
  "id": "bddtests;test-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@SASC"
    },
    {
      "line": 1,
      "name": "@BddTests"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "open_Firefox_and_start_application",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I login with \"abcd@gmail.com\" and password \"Mercury\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Validate message",
  "keyword": "Then "
});
formatter.match({
  "location": "BddTestStepdefinitions.open_firefox_and_start_application()"
});
formatter.result({
  "duration": 2955731200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd@gmail.com",
      "offset": 14
    },
    {
      "val": "Mercury",
      "offset": 44
    }
  ],
  "location": "BddTestStepdefinitions.i_login_with_and_password(String,String)"
});
formatter.result({
  "duration": 117569600,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: //input[@id\u003d\u0027email\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027WKWIN6482022\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 72.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200117190643, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 27068, moz:profile: C:\\Users\\aantirth\\AppData\\L..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 616fef85-2156-4a09-8233-a3f37ba8ffd2\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027email\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat pages.Homepage.usernamepassvalidation(Homepage.java:76)\r\n\tat stepDefinitions.BddTestStepdefinitions.i_login_with_and_password(BddTestStepdefinitions.java:72)\r\n\tat ✽.Then I login with \"abcd@gmail.com\" and password \"Mercury\"(Bddtest.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BddTestStepdefinitions.validate_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 125000,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 29,
  "name": "Validation",
  "description": "",
  "id": "bddtests;validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@SASD"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "open_Firefox_and_start_application",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Click \"Sign in\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I login with \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "\"QURATE Selenium\" should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "bddtests;validation;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 35,
      "id": "bddtests;validation;;1"
    },
    {
      "cells": [
        "qurate@selenium.com",
        "",
        "qurate"
      ],
      "line": 36,
      "id": "bddtests;validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on scenario \"Background\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Background",
      "offset": 18
    }
  ],
  "location": "BddTestStepdefinitions.i_am_on_scenario(String)"
});
formatter.result({
  "duration": 130700,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Validation",
  "description": "",
  "id": "bddtests;validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BddTests"
    },
    {
      "line": 28,
      "name": "@SASD"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "open_Firefox_and_start_application",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Click \"Sign in\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I login with \"qurate@selenium.com\" and password \"qurate\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "\"QURATE Selenium\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BddTestStepdefinitions.open_firefox_and_start_application()"
});
formatter.result({
  "duration": 2710563900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 7
    }
  ],
  "location": "BddTestStepdefinitions.click(String)"
});
formatter.result({
  "duration": 2998818200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qurate@selenium.com",
      "offset": 14
    },
    {
      "val": "qurate",
      "offset": 49
    }
  ],
  "location": "BddTestStepdefinitions.i_login_with_and_password(String,String)"
});
formatter.result({
  "duration": 2903406600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QURATE Selenium",
      "offset": 1
    }
  ],
  "location": "BddTestStepdefinitions.should_be_displayed(String)"
});
formatter.result({
  "duration": 110802400,
  "status": "passed"
});
formatter.after({
  "duration": 93500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on scenario \"Background\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Background",
      "offset": 18
    }
  ],
  "location": "BddTestStepdefinitions.i_am_on_scenario(String)"
});
formatter.result({
  "duration": 81900,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "AddItem Tocart",
  "description": "",
  "id": "bddtests;additem-tocart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@SASE"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "open_Firefox_and_start_application",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "Mousehover DRESSES",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "click SummerDresses",
  "keyword": "Then "
});
formatter.match({
  "location": "BddTestStepdefinitions.open_firefox_and_start_application()"
});
formatter.result({
  "duration": 2564454000,
  "status": "passed"
});
formatter.match({
  "location": "BddTestStepdefinitions.mousehover_DRESSES()"
});
formatter.result({
  "duration": 166320900,
  "status": "passed"
});
formatter.match({
  "location": "BddTestStepdefinitions.click_SummerDresses()"
});
formatter.result({
  "duration": 560406800,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: SUMMER DRESSES\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027WKWIN6482022\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 72.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200117190643, moz:geckodriverVersion: 0.26.0, moz:headless: false, moz:processID: 27068, moz:profile: C:\\Users\\aantirth\\AppData\\L..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 616fef85-2156-4a09-8233-a3f37ba8ffd2\n*** Element info: {Using\u003dlink text, value\u003dSUMMER DRESSES}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:376)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:220)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat pages.Homepage.click_summer_dresses(Homepage.java:112)\r\n\tat stepDefinitions.BddTestStepdefinitions.click_SummerDresses(BddTestStepdefinitions.java:101)\r\n\tat ✽.Then click SummerDresses(Bddtest.feature:42)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 72900,
  "status": "passed"
});
});