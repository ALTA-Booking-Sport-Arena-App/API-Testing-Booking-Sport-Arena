@payment
Feature: Payment

  @post-positive-booking
  Scenario: POST Created Booking Successfully
    When user send POST successfully create booking request to server
    Then response status code should be 200
    And response structure should match json schema "bookingSuccess.json"

  @post-negative-booking
  Scenario: POST Created Booking Unsuccessfully
    When user send POST unsuccessfully create booking request to server
    Then response status code should be 400
    And response structure should match json schema "bookingFailed.json"

  @put-positive-payment
  Scenario: PUT Payment Successfully
    When user send PUT successfully payment request to server
    Then response status code should be 200
    And response structure should match json schema "paymentSuccess.json"

  @put-negative-payment
  Scenario: PUT Payment Unsuccessfully
    When user send PUT unsuccessfully payment request to server
    Then response status code should be 400
    And response structure should match json schema "paymentFailed.json"