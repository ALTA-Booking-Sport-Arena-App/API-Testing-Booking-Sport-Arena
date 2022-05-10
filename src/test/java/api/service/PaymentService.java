package api.service;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class PaymentService {
    private static final String API_BASEURL = "https://haudhi.site";

    public void postBookingSuccess() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("venue_id", "1");
        bodyJson.put("total_price", "12000");
        bodyJson.put("day", "Saturday, 8 May 2022");
        bodyJson.put("start_date", "12:00");
        bodyJson.put("end_date", "17:00");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/booking");
    }
    public void postBookingFailed() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("venue_id", "10");
        bodyJson.put("total_price", "");
        bodyJson.put("day", "");
        bodyJson.put("start_date", "");
        bodyJson.put("end_date", "");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(API_BASEURL + "/booking");
    }
    public void putPaymentSuccess(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("user_id", "1");
        bodyJson.put("venue_id", "2");
        bodyJson.put("payment_link", "");
        bodyJson.put("secret_key", "123");
        bodyJson.put("code", "dana");
        bodyJson.put("start_date", "2022-04-07T21:08:54.73+07:00");
        bodyJson.put("end_date", "2022-04-07T21:08:54.73+07:00");
        bodyJson.put("price", "120000");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/payment");
    }
    public void putPaymentFailed(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("user_id", "");
        bodyJson.put("venue_id", "");
        bodyJson.put("payment_link", "");
        bodyJson.put("secret_key", "");
        bodyJson.put("code", "dana");
        bodyJson.put("start_date", "");
        bodyJson.put("end_date", "");
        bodyJson.put("price", "");

        SerenityRest.given()
                .header("Content-type","application/json")
                .body(bodyJson.toString())
                .put(API_BASEURL + "/payment");
    }
}
