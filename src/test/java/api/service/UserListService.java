package api.service;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;
public class UserListService {

    private static final String API_BASEURL = "https://haudhi.site";
    //Start -- Users Profile
    public void PutUserSuccessfully (){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("fullname", "admin barusan selesai");
        bodyJson.put("username", "admin");
        bodyJson.put("email", "andre13@email.com.com");
        bodyJson.put("phone_number", "0123456789");
        bodyJson.put("password", "andre13");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/users/2");
    }

    public void PutUserUnsuccessfully (){
        JSONObject bodyJson = new JSONObject();
        bodyJson.put("fullname", "");
        bodyJson.put("username", "");
        bodyJson.put("email", "andre13@email.com.com");
        bodyJson.put("phone_number", "0123456789");
        bodyJson.put("password", "andre13");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/users/2");
    }

    public void GetSingleUserSuccessfully(){
        JSONObject bodyJson = new JSONObject();
        bodyJson.put("email","andre13@email.com");

        SerenityRest.given()
                .body(bodyJson.toString())
                .get(API_BASEURL + "/users/profile");
    }

    public void GetSingleUserUnsuccessfully(){
        SerenityRest.get(API_BASEURL + "/user/profile");
    }

    public void DeleteUserSuccessfully (){
        Response response = SerenityRest.delete(API_BASEURL + "/users/2");
        Assert.assertEquals(response.statusCode(), 200);
    }


    public void PutUpdateImage (){
        SerenityRest.put(API_BASEURL + "/users/image/30");
    }
    //End -- Users Profile
}

