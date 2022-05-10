package api.service;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.File;

import static io.restassured.RestAssured.given;

public class VanueService {
    private static final String API_BASEURL = "https://haudhi.site";

    //login dan return value data token
    public String GetToken(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "andre113@email.com");
        bodyJson.put("password", "andre13");

        Response response = (Response) SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/login");
        String jsonString = response.getBody().asString();

        return JsonPath.from(jsonString).get("data.token");
    }

    public void POSTVanueSuccessfully (String token){

        if (token != null) {

                given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "multipart/form-data")
                .formParam("name", "Central Futsal")
                .formParam("detail", "Central Futsal di balaraja")
                .formParam("address", "Balaraja tangerang")
                .formParam("city", "Tangerang")
                .formParam("category_id", "basketball")
                .multiPart("image", new File("src/test/java/image/team.png"),"image/png")
                .when().post(API_BASEURL + "/venues/step1");
        }
    }

    public void POSTVanueunSuccessfully (String token){
        if (token != null) {

            given().header("Authorization", "Bearer " + token)
                .header("Content-Type", "multipart/form-data")
                .formParam("name", "Central Futsal")
                .formParam("detail", "Central Futsal di balaraja")
                .formParam("address", "Balaraja tangerang")
                .formParam("city", "Tangerang")
                .formParam("category_id", "basketball")
                .multiPart("image", new File("src/test/java/image/Test.pdf"), "image/png")
                .when().post(API_BASEURL + "/venues/step1");

        }
    }

    public void POSTSuccessfullyVenue (String token){

        if (token != null) {
            JSONObject bodyJson = new JSONObject();

            bodyJson.put("venue_id", 3);
            bodyJson.put("day", "monday");
            bodyJson.put("open_hour", "11:00");
            bodyJson.put("close_hour", "17:00");
            bodyJson.put("price", 200000);
            bodyJson.put("facility_id", 2);

            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-type", "application/json")
                    .body(bodyJson.toString())
                    .post(API_BASEURL + "/venues/step2");
        }

    }

    public void GETSingleVenue (String token){
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(API_BASEURL + "/venues");

    }

    public void GETSingleVenueUnsuccessfuly (String token){
        if (token != null) {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(API_BASEURL + "/venues");
        }
    }

    public void GETSingleVenueByIdSuccessfull(String token){
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(API_BASEURL + "/venues/3");
        }

    public void GETSingleVenueByIdUnSuccessfull (String token){
        if (token != null) {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .get(API_BASEURL + "/venues/3");
        }
    }

    public void DELETEVenueSuccessfully(String token){
        if (token != null) {
            Response response = SerenityRest.given()
                    .header("Authorization","Bearer "+token)
                    .delete(API_BASEURL + "/venues/3");
            Assert.assertEquals(response.statusCode(), 400);
        }

    }

    public void DELETEVenue (String token){
        if (token != null) {

            given().header("Authorization", "Bearer " + token)
                    .header("Content-Type", "multipart/form-data")
                    .formParam("name", "Central Futsal")
                    .formParam("detail", "Central Futsal di Tigaraksa")
                    .formParam("address", "Balaraja tangerang")
                    .formParam("city", "Tangerang")
                    .formParam("category_id", "basketball")
                    .multiPart("image", new File("src/test/java/image/team.png"), "image/png")
                    .when().put(API_BASEURL + "/venues/step1/3");

        }
    }


}
