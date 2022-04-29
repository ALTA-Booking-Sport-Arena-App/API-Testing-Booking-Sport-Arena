@login
Feature: Login

  @loginpositive
  Scenario: POST User Login Successfully
    When user send POST success login request to server
    Then response status code should be 200
    And response structure should match json schema "loginSuccessfully.json"

  @negative
  Scenario: POST User Login without Email
    When user send POST login without email request to server
    Then response status code should be 400
    And response structure should match json schema "loginUnsuccessfully.json"

  @negative
  Scenario: POST User Login without Password
    When user send POST login without password request to server
    Then response status code should be 400
    And response structure should match json schema "loginUnsuccessfully.json"

  @negative
  Scenario: POST User Login without Body Request
    When user send POST login without body request to server
    Then response status code should be 400
    And response structure should match json schema "loginUnsuccessfully.json"

  @negative
  Scenario: POST User Login with Account don't Register
    When user send POST login with account dont register request to server
    Then response status code should be 400
    And response structure should match json schema "loginUnsuccessfully.json"