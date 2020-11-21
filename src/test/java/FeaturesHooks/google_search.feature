Feature: Test google search Functionality
	s
	@regression
  Scenario: Check google search is working
    Given browser is open
    And user is on google search page
    When user search for text
    And user hits enter
    Then the user is navigated to the search results
