package api.service;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import org.junit.Assert;

public class CategoryService {
    private static final String API_BASEURL = "https://haudhi.site";

    public void postCreateCategorySuccess(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name",  "basketball");
        bodyJson.put("icon_name", "fa-solid fa-basketball");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/category");
    }
    public void postCreateCategoryFailed(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name",  "");
        bodyJson.put("icon_name", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/category");
    }
    public void getCategorySuccess(){
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/category");
    }
    public void getCategoryFailed(){
        SerenityRest.given()
                .queryParam("data", "1")
                .get(API_BASEURL + "/category");
    }
    public void putCategorySuccess(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("id", "1");
        bodyJson.put("name", "basketball");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/category/1");
    }
    public void putCategoryFailed(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("id", "");
        bodyJson.put("name", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/category/1");
    }
    public void deleteCategorySuccess(){
        Response response = SerenityRest.delete(API_BASEURL + "/category/1");
        Assert.assertEquals(response.statusCode(), 200);
    }
    public void deleteCategoryFailed(){
        Response response = SerenityRest.delete(API_BASEURL + "/category/1");
        Assert.assertEquals(response.statusCode(), 400);
    }
}
