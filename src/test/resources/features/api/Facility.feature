@facility
Feature: Facility

  @post-positive-facility
  Scenario: POST Created Facility Successfully
    When user send POST successfully create facility request to server
    Then response status code should be 200
    And response structure should match json schema "createFacilitySuccess.json"

  @post-negative-facility
  Scenario: POST Created Facility Unsuccessfully
    When user send POST unsuccessfully create facility request to server
    Then response status code should be 400
    And response structure should match json schema "createFacilityFailed.json"

  @get-positive-facility
  Scenario: GET Facility For All Successfully
    When user send GET successfully all facility request to server
    Then response status code should be 200
    And response structure should match json schema "getFacilitySuccess.json"

  @get-negative-facility
  Scenario: GET Facility For All Unsuccessfully
    When user send GET unsuccessfully all facility request to server
    Then response status code should be 400
    And response structure should match json schema "getFacilityFailed.json"

  @put-positive-facility
  Scenario: PUT Update Facility Successfully
    When user send PUT successfully update facility request to server
    Then response status code should be 200
    And response structure should match json schema "putFscilitySuccess.json"

  @put-negative-facility
  Scenario: PUT Update Facility Unsuccessfully
    When user send PUT unsuccessfully update facility request to server
    Then response status code should be 400
    And response structure should match json schema "putFacilityFailed.json"

  @delete-positive-facility
  Scenario: DELETE Facility Successfully
    When user send DELETE successfully facility request to server
    Then response status code should be 200
    And response structure should match json schema "deleteFacilitySuccess.json"

  @delete-negative-facility
  Scenario: DELETE Facility Unsuccessfully
    When user send DELETE unsuccessfully facility request to server
    Then response status code should be 400
    And response structure should match json schema "deleteFacilityFailed.json"