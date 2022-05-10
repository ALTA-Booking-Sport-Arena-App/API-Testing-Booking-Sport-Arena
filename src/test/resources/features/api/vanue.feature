@Venue
Feature: User Profile

  Background: user already login
    Given user already has login token

  @positiveStep1
  Scenario: POST venue successfully
    When user send POST successfully venue in server
    Then response status code should be 200

  @negativeStep1
  Scenario: POST venue unsuccessfully
    When user send POST unsuccessfully venue in server
    Then response status code should be 200

  @positiveStep2
  Scenario: POST venue successfully with json schema
    When user send POST successfully venue in server with json schema
    Then response status code should be 200
    And response structure should match json schema "venue.json"

  @GetSinglePositive
  Scenario: GET single venue successfully
    When user send GET single venue successfully venue in server
    Then response status code should be 200
    And response structure should match json schema "SingleVenue.json"

  @GetSingleNegative
  Scenario: GET single venue unsuccessfully
    When user send GET single venue unsuccessfully venue in server
    Then response status code should be 400
    And response structure should match json schema "SingleVenueUnsuccessfully.json"

  @GetSinglePositive
  Scenario: GET single venue by id successfully
    When user send GET single venue by id successfully venue in server
    Then response status code should be 200
    And response structure should match json schema "Venuebyid.json"

  @GetSingleNegative
  Scenario: GET single venue by id unsuccessfully
    When user send GET single venue by id unsuccessfully venue in server
    Then response status code should be 400
    And response structure should match json schema "Venuebyidunsuccessfully.json"

  @Delete_positive_Venue
  Scenario: DELETE venue successfully
    When user send DELETE Venue successfully in server
    Then response status code should be 400

  @positiveUpdatePUT
  Scenario: PUT update venue successfully
    When user send PUT update venue unsuccessfully in server
    Then response status code should be 200
