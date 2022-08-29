Feature: Test the PlaceAdd api

  Scenario: Check wheather it is working or not
    Given User enter the url and body data
    When User set the status like get and enter the suburl data
    Then User click on submit button
    And status response body is ok
