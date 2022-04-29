package api.service;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class LoginService {

    private static final String API_BASEURL = "https://haudhi.site";

    //Start -- Login
    public void postLoginSuccessfully(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "andre13@email.com");
        bodyJson.put("password", "andre13");

//        Response user = SerenityRest.lastResponse()
//                .jsonPath()
//                .getObject("data", Response.class);

        Response response = (Response) SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/login")
                .getBody();

        System.out.println(response);
    }
    public void postLoginwithoutEmail(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "");
        bodyJson.put("password", "andre13");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/login");
    }
    public void postLoginwithoutPassword(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "andre13@email.com");
        bodyJson.put("password", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/login");
    }
    public void postLoginwithoutBodyRequest(){
        SerenityRest.given()
                .header("Content-type","application/json")
                .post(API_BASEURL + "/login");
    }
    public void postLoginwithAccountDontRegister(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "anon");
        bodyJson.put("password", "anonpass");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/login");
    }
    //End -- Login
}
