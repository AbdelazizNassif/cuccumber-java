Feature: Test Login Functionality in swagger

  Scenario Outline: Check login is successful with valid credentials
    Given user in login page of wagger web portal
    When user enter valid <username> and <password> of wagger web portal
    And click login button of wagger web portal
    Then the user is navigated to the home page of wagger web portal

    Examples: 
			| username           					 | password |
      | standard_user      					 | secret_sauce |
      | problem_user      					 | secret_sauce |
      | performance_glitch_user      | secret_sauce |