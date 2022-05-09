package api.service;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

public class FacilityService {
    private static final String API_BASEURL = "https://haudhi.site";

    public void postCreateFacilitySuccess(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name",  "basketball");
        bodyJson.put("icon_name", "fa-solid fa-basketball");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/facility");
    }
    public void postCreateFacilityFailed(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name",  "");
        bodyJson.put("icon_name", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/facility");
    }
    public void getFacilitySuccess(){
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/facility");
    }
    public void getFacilityFailed(){
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/facility");
    }
    public void putFacilitySuccess(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("id", "1");
        bodyJson.put("name", "basketball");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/facility/{facilityId}/1");
    }
    public void putFacilityFailed(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("id", "");
        bodyJson.put("name", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/facility/{facilityId}/1");
    }
    public void deleteFacilitySuccess(){
        Response response = SerenityRest.delete(API_BASEURL + "/facility/{facilityId}/1");
        Assert.assertEquals(response.statusCode(), 200);
    }
    public void deleteFacilityFailed(){
        Response response = SerenityRest.delete(API_BASEURL + "/facility/{facilityId}/1");
        Assert.assertEquals(response.statusCode(), 400);
    }
}
