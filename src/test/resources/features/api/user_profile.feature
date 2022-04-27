@UserProfile
Feature: User Profile

  @positive
  Scenario: PUT update user successfully
    When user send PUT successfully user profile in server
    Then response status code should be 200
    And response structure should match json schema "userProfileSuccessfully.json"

  @negative
  Scenario: PUT update user unsuccessfully
    When user send PUT unsuccessfully user profile in server
    Then response status code should be 400
    And response structure should match json schema "userProfileUnsuccessfully.json"

  @positive
  Scenario: GET single user successfully
    When user send GET single user successfully user profile in server
    Then response status code should be 200
    And response structure should match json schema "SingleUserSuccessfully.json"

  @negative
  Scenario: GET single user successfully
    When user send GET single user unsuccessfully user profile in server
    Then response status code should be 400
    And response structure should match json schema "SingleUserUnsuccessfully.json"

  @positive
  Scenario: DELETE user successfully
    When user send DELETE user successfully user profile in server
    Then response status code should be 200

  @negative
  Scenario: DELETE user successfully
    When user send DELETE user unsuccessfully user profile in server
    Then response status code should be 400

  @positive
  Scenario: PUT update image user successfully
    When user send PUT update image user unsuccessfully user profile in server
    Then response status code should be 200

