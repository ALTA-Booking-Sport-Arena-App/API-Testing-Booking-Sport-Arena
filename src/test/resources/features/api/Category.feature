@category
Feature: Category

  @post-positive-category
  Scenario: POST Created Category Successfully
    When user send POST successfully create category request to server
    Then response status code should be 200
    And response structure should match json schema "createCategorySuccess.json"

  @post-negative-category
  Scenario: POST Created Category Unsuccessfully
    When user send POST unsuccessfully create category request to server
    Then response status code should be 400
    And response structure should match json schema "createCategoryFailed.json"

  @get-positive-category
  Scenario: GET Categories For All Successfully
    When user send GET successfully all category request to server
    Then response status code should be 200
    And response structure should match json schema "getCategorySuccess.json"

  @get-negative-category
  Scenario: GET Categories For All Unsuccessfully
    When user send GET unsuccessfully all category request to server
    Then response status code should be 400
    And response structure should match json schema "getCategoryFailed.json"

  @put-positive-category
  Scenario: PUT Update Category Successfully
    When user send PUT successfully update category request to server
    Then response status code should be 200
    And response structure should match json schema "putCategorySuccess.json"

  @put-positive-category
  Scenario: PUT Update Category  Unsuccessfully
    When user send PUT unsuccessfully update category request to server
    Then response status code should be 400
    And response structure should match json schema "putCategoryFailed.json"

  @delete-positive-category
  Scenario: DELETE  Category Successfully
    When user send DELETE successfully category request to server
    Then response status code should be 200
    And response structure should match json schema "deleteCategorySuccess.json"

  @delete-negative-category
  Scenario: DELETE  Category Unsuccessfully
    When user send DELETE unsuccessfully category request to server
    Then response status code should be 400
    And response structure should match json schema "deleteCategoryFailed.json"