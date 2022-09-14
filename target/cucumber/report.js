$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TestOne.feature");
formatter.feature({
  "line": 2,
  "name": "Changing the Backgound Color",
  "description": "",
  "id": "changing-the-backgound-color",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.before({
  "duration": 2815527800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "White Background",
  "description": "",
  "id": "changing-the-backgound-color;white-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@white"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Set White Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on the button for White",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to White",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.set_White_Background_button_exists()"
});
formatter.result({
  "duration": 147348900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_click_on_the_button_for_White()"
});
formatter.result({
  "duration": 85928600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.the_background_color_will_change_to_White()"
});
formatter.result({
  "duration": 46854800,
  "status": "passed"
});
});