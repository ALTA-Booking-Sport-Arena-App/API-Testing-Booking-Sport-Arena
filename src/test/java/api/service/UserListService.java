package api.service;

import io.cucumber.java.eo.Se;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

import java.io.File;

public class UserListService {

    private static final String API_BASEURL = "https://haudhi.site";

    //login dan return value data token
    public String GetTokenLogin(){
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

    //Start -- Users Profile
    public void PutUserSuccessfully (String token){
        if (token != null){
            JSONObject bodyJson = new JSONObject();

            bodyJson.put("fullname", "admin belom selesai");

            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-type", "application/json")
                    .body(bodyJson.toString())
                    .put(API_BASEURL + "/users/32");
        }
    }

    public void PutUserUnsuccessfully (String token){
        if (token != null) {
            JSONObject bodyJson = new JSONObject();
            bodyJson.put("fullname", "");
            bodyJson.put("username", "");
            bodyJson.put("email", "andre13@email.com.com");
            bodyJson.put("phone_number", "0123456789");
            bodyJson.put("password", "andre13");

            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-type", "application/json")
                    .body(bodyJson.toString())
                    .put(API_BASEURL + "/users/32");
        }
    }

    //send perintah get dengan Authorization Bearer + token
    public void GetSingleUserSuccessfully(String token){

        SerenityRest.given()
                .header("Authorization","Bearer "+token)
                .get(API_BASEURL + "/users/profile");
    }

    public void GetSingleUserUnsuccessfully(String token){
        SerenityRest.given()
                .header("Authorization","Bearer "+token)
                .get(API_BASEURL + "/user/profile");
    }

    public void DeleteUserSuccessfully (String token){
        if (token != null) {
            Response response = SerenityRest.given()
                .header("Authorization","Bearer "+token)
                .delete(API_BASEURL + "/users/2");
            Assert.assertEquals(response.statusCode(), 400);
        }
    }


    public void PutUpdateImage (String token){
        if (token != null) {
            SerenityRest.given()
                    .header("Authorization", "Bearer " + token)
                    .header("Content-Type", "multipart/form-data")
                    .multiPart("image", new File("C:\\Users\\ASUS\\Downloads\\team.png"), "image/png")
                    .when().put(API_BASEURL + "/users/images/21");
        }
    }

    //End -- Users Profile
}

