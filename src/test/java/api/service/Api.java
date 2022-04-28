package api.service;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.aspectj.weaver.patterns.IToken;
import org.json.JSONObject;
import org.junit.Assert;

public class Api {

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

    //Start -- Register
    public void postRegisterSuccess(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("fullname", "Ahmad Sudrajat");
        bodyJson.put("username", "Sudrajat90");
        bodyJson.put("email", "sudrajat90@email.com");
        bodyJson.put("phone_number", "081333555888");
        bodyJson.put("password", "drajat90");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/users");
    }
    public void postRegisterwithoutPassword(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("fullname", "Tofan Subaeri");
        bodyJson.put("username", "Tofan-S");
        bodyJson.put("email", "tofan12@email.com");
        bodyJson.put("phone_number", "081333555888");
        bodyJson.put("password", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/users");
    }
    public void postRegisterwithoutFullname(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("fullname", "");
        bodyJson.put("username", "Tofan-S");
        bodyJson.put("email", "tofan12@email.com");
        bodyJson.put("phone_number", "081333555888");
        bodyJson.put("password", "tofan12");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/users");
    }
    public void postRegisterwithoutBody(){
        SerenityRest.given()
                .header("Content-type","application/json")
                .post(API_BASEURL + "/users");
    }
    public void postRegisterwithRegisteredEmail(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("fullname", "Sudrajat Dwi");
        bodyJson.put("username", "Sudrajat-D");
        bodyJson.put("email", "sudrajat90@email.com");
        bodyJson.put("phone_number", "081333555777");
        bodyJson.put("password", "drajat12");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/users");
    }
    //End -- Register

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
