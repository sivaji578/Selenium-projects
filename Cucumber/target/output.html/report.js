$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/cucumber.feature");
formatter.feature({
  "name": "Search one movie",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "What scenario we going to test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User entering the youtube",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_entering_the_youtube()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the movie name as Simhadri",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.enter_the_movie_name_as_Simhadri()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on any one video",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.click_on_any_one_video()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Able to see movie",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.able_to_see_movie()"
});
formatter.result({
  "status": "passed"
});
});