@register
Feature: Register

  @register_positive
  Scenario: POST User Register Successful
    When user send user send POST success register request to server
    Then response status code should be 200
    And response structure should match json schema "registerSuccess.json"

  @register_negatif
  Scenario: POST User Register without password
    When user send POST register without password request to server
    Then response status code should be 400
    And response structure should match json schema "registerUnsuccess.json"

  @register_negatif
  Scenario: POST User Register without fullname
    When user send POST register without fullname request to server
    Then response status code should be 400
    And response structure should match json schema "registerUnsuccess.json"

  @register_negatif
  Scenario: POST User Register without body request
    When user send POST register without body request to server
    Then response status code should be 400
    And response structure should match json schema "registerUnsuccess.json"

  @register_negatif
  Scenario: POST User Register again with the registered email account
    When user send POST register with registered email request to server
    Then response status code should be 400
    And response structure should match json schema "registerUnsuccess.json"