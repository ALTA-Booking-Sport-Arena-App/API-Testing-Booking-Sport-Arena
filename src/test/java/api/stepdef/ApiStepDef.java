package api.stepdef;

import api.service.Api;
import io.cucumber.java.en.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ApiStepDef {
    Api api = new Api();

    //Action -- Begin

    //Register
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

    //Action -- End

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
