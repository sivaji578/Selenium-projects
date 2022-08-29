Feature: Search India on BBC website and verify search.

  Scenario Outline: Search India on BBC website and verify it.
    Given I open the firefox browser
    And I navigating to BBc website
    Then I click at search textbox
    And I enter "<country>" in search textbox
    And I click at Search button
    Then I should be taken to search page
    And I verify <country> on search page

    Examples: 
      | country |
      | India   |
      | China   |
