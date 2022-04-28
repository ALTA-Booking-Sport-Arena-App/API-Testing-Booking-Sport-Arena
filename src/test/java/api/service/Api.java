package api.service;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

public class Api {

    private static final String API_BASEURL = "https://haudhi.site";

    //Start -- Login
    public void postLoginSuccessfully(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "admin@admin.com");
        bodyJson.put("password", "admin");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/login");
    }
    public void postLoginwithoutEmail(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "");
        bodyJson.put("password", "admin");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/login");
    }
    public void postLoginwithoutPassword(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email",  "admin@admin.com");
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

        bodyJson.put("fullname", "Andre Taulani");
        bodyJson.put("username", "Andre13");
        bodyJson.put("email", "andre13@email.com");
        bodyJson.put("phone_number", "081333555666");
        bodyJson.put("password", "andre13");

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
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("fullname", "");
        bodyJson.put("username", "");
        bodyJson.put("email", "");
        bodyJson.put("phone_number", "");
        bodyJson.put("password", "");



        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/users");
    }
    public void postRegisterwithRegisteredEmail(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("fullname", "Sudrajat Dwi");
        bodyJson.put("username", "Sudrajat-D");
        bodyJson.put("email", "andre13@email.com");
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
        bodyJson.put("email", "admin@mail.com");
        bodyJson.put("phone_number", "0123456789");
        bodyJson.put("password", "admin");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/{userId}");
    }

    public void PutUserUnsuccessfully (){
        JSONObject bodyJson = new JSONObject();
        bodyJson.put("fullname", "admin Agung Firmansyah");
        bodyJson.put("username", "admin");
        bodyJson.put("email", "admin@mail.com");
        bodyJson.put("phone_number", "0123456789");
        bodyJson.put("password", "admin");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/{userId}");
    }

    public void GetSingleUserSuccessfully(){
        SerenityRest.get(API_BASEURL + "/users/profile");
    }

    public void GetSingleUserUnsuccessfully(){
        SerenityRest.get(API_BASEURL + "/user/profile");
    }

    public void DeleteUserSuccessfully (){
        Response response = SerenityRest.delete(API_BASEURL + "/users/{userId}");
        Assert.assertEquals(response.statusCode(), 200);
    }

    public void DeleteUserUnsuccessfully (){
        Response response = SerenityRest.delete(API_BASEURL + "/user/{userId}");
        Assert.assertEquals(response.statusCode(), 400);
    }

    public void PutUpdateImage (){
        SerenityRest.put(API_BASEURL + "/users/image/");
    }
    //End -- Users Profile

}
