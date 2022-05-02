package api.service;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;


public class AdminService {
    private static final String API_BASEURL = "https://haudhi.site";

    public void putAdminVerificationApproveSuccessfully(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("user_id", "1");
        bodyJson.put("role", "owner");
        bodyJson.put("status", "approve");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/verification/approve");
    }

    public void putAdminVerificationApproveUnsuccessfully() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("user_id", "");
        bodyJson.put("role", "");
        bodyJson.put("status", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/verification/approve");
    }

    public void putAdminVerificationRejectSuccess() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("user_id", "1");
        bodyJson.put("status", "reject");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/verification/reject");
    }

    public void putAdminVerificationRejectUnsuccess() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("user_id", "");
        bodyJson.put("status", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/verification/reject");
    }

    public void puAdminChangePasswordSuccess() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("password", "inipassword");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/admin/password");
    }

    public void puAdminChangePasswordUnsuccess() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("password", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/admin/password");
    }

    public void getAdminRequestListAllOwnerSuccess() {
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/list/owners-request");
    }

    public void getAdminRequestListAllOwnerUnsuccess() {
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/list/owners-request");
    }

    public void getAdminListAllOwnerSuccess() {
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/list/owners");
    }

    public void getAdminListAllOwnerUnsuccess() {
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/list/owners");
    }

    public void getAdminListAllUsersSuccess() {
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/list/users");
    }

    public void getAdminListAllUsersUnsuccess() {
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/list/users");
    }
}
