@admin
Feature: Admin

  @put-positive-approve
  Scenario: PUT Admin Verification Approve Successfully
    When user send PUT successfully admin verification approve request to server
    Then response status code should be 200
    And response structure should match json schema "adminPUTApproveSuccess.json"

  @put-negative-approve
  Scenario: PUT Admin Verification Approve Unsuccessfully
    When user send PUT unsuccessfully admin verification approve request to server
    Then response status code should be 400
    And response structure should match json schema "adminPUTUnsuccessfully.json"

  @put-positive-reject
  Scenario: PUT Admin Verification Reject Successfully
    When user send PUT successfully admin verification reject request to server
    Then response status code should be 200
    And response structure should match json schema "adminPUTRejectSuccess.json"

  @put-negative-reject
  Scenario: PUT Admin Verification Reject Unsuccessfully
    When user send PUT unsuccessfully admin verification reject request to server
    Then response status code should be 400
    And response structure should match json schema "adminPUTRejectFailed.json"

  @put-positive-changepassword
  Scenario: PUT Admin Change Password Successfully
    When user send PUT successfully admin change password request to server
    Then response status code should be 200
    And response structure should match json schema "adminPUTChangePasswordSuccess.json"

  @put-negative-changepassword
  Scenario: PUT Admin Change Password Unsuccessfully
    When user send PUT unsuccessfully admin change password request to server
    Then response status code should be 400
    And response structure should match json schema "adminPUTChangePasswordFailed.json"

  @get-positive-listallownerrequest
  Scenario: GET Admin Lists All Owners Request Successfully
    When user send GET successfully admin request list all owner request to server
    Then response status code should be 200
    And response structure should match json schema "adminGETListAllOwnerRequestSuccess.json"

  @get-negative-listallownersrequest
  Scenario: PUT Admin Lists All Owners Request Unsuccessfully
    When user send GET unsuccessfully admin ruquest list all owners request to server
    Then response status code should be 400
    And response structure should match json schema "adminGETListAllOwnerFailed.json"

  @get-positive-listallowners
  Scenario: GET Admin Lists All Owners Successfully
    When user send GET successfully admin list all owners request to server
    Then response status code should be 200
    And response structure should match json schema "adminGETListAllOwnerSuccess.json"

  @get-negative-listallowners
  Scenario: GET Admin Lists All Owners Unsuccessfully
    When user send GET unsuccessfully admin list all owners request to server
    Then response status code should be 400
    And response structure should match json schema "adminGETListAllOwnerFailed.json"

  @get-positive-listallusers
  Scenario: GET Admin Lists All Users Successfully
    When user send GET successfully admin list all users request to server
    Then response status code should be 200
    And response structure should match json schema "adminGETListAllUsersSuccess.json"

  @get-negative-listallusers
  Scenario: PUT Admin Lists All Users Unsuccessfully
    When user send GET unsuccessfully admin list all users request to server
    Then response status code should be 400
    And response structure should match json schema "adminGETListAllUsersFailed.json"