package api.service;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
public class RegisterService {
    private static final String API_BASEURL = "https://haudhi.site";
    
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
}
