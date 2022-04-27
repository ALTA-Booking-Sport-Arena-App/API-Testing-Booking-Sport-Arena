package api.stepdef;

import api.service.*;
import io.cucumber.java.en.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ApiStepDef {
    Api api = new Api();

    //Action To Step Dev -- Begin

    //Start -- Login
    @When("user send POST success login request to server")
    public void postLoginSuccessfully(){
        api.postLoginSuccessfully();
    }
    @When("user send POST login without email request to server")
    public void postLoginwithoutEmail(){
        api.postLoginwithoutEmail();
    }
    @When("user send POST login without password request to server")
    public void postLoginwithoutPassword(){
        api.postLoginwithoutPassword();
    }
    @When("user send POST login without body request to server")
    public void postLoginwithoutBodyRequest(){
        api.postLoginwithoutBodyRequest();
    }
    @When("user send POST login with account dont register request to server")
    public void postLoginwithAccountDontRegister(){
        api.postLoginwithAccountDontRegister();
    }
    //End -- Login

    //Action To Step Dev -- Begin

    //Start -- Register
    @When("user send user send POST success register request to server")
    public void postRegisterSuccess() {
        api.postRegisterSuccess();
    }
    @When("user send POST register without password request to server")
    public void postRegisterwithoutPassword() {
        api.postRegisterwithoutPassword();
    }
    @When("user send POST register without fullname request to server")
    public void postRegisterwithoutFullname() {
        api.postRegisterwithoutFullname();
    }
    @When("user send POST register without body request to server")
    public void postRegisterwithoutBody() {
        api.postRegisterwithoutBody();
    }
    @When("user send POST register with registered email request to server")
    public void postRegisterwithRegisteredEmail() {
        api.postRegisterwithRegisteredEmail();
    }
    //End -- Register

    //Start -- Users Profile
    @When("user send PUT successfully user profile in server")
    public void PutUserSuccessfully() {
        api.PutUserSuccessfully();
    }

    @When("user send PUT unsuccessfully user profile in server")
    public void PutUserUnsuccessfully() {
        api.PutUserUnsuccessfully();
    }

    @When("user send GET single user successfully user profile in server")
    public void GetSingleUserSuccessfully() {
        api.GetSingleUserSuccessfully();
    }
    @When("user send GET single user unsuccessfully user profile in server")
    public void GetSingleUserUnsuccessfully() {
        api.GetSingleUserUnsuccessfully();

    }

    @When("user send DELETE user successfully user profile in server")
    public void DeleteUserSuccessfully() {
        api.DeleteUserSuccessfully ();

    }

    @When("user send DELETE user unsuccessfully user profile in server")
    public void DeleteUserUnsuccessfully() {
        api.DeleteUserUnsuccessfully();

    }

    @When("user send PUT update image user unsuccessfully user profile in server")
    public void PutUpdateImage() {
        api.PutUpdateImage();
    }
    //End -- User Profile

    //Action To Step Dev -- End



    //Validation -- Begin
    @Then("response status code should be {int}")
    public void statusCodeValidation(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Then("response structure should match json schema {string}")
    public void validateJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }
    //Validation -- End
}
