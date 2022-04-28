@Vanue
Feature: User Profile

  @positive
  Scenario: PUT update vanue successfully
    When user send PUT successfully vanue in server
    Then response status code should be 200
    And response structure should match json schema "VanueSuccessfully.json"

  Scenario: PUT update vanue unsuccessfully
    When user send PUT unsuccessfully vanue in server
    Then response status code should be 400
    And response structure should match json schema "VanueUnsuccessfully.json"

  Scenario: PUT update vanue unsuccessfully
    When user send PUT unsuccessfully vanue in server
    Then response status code should be 400
    And response structure should match json schema "VanueUnsuccessfully.json"