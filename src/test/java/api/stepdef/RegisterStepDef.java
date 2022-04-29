package api.stepdef;

import api.service.*;
import io.cucumber.java.en.*;

public class RegisterStepDef {
    RegisterService Regis = new RegisterService();

    //Start -- Register
    @When("user send user send POST success register request to server")
    public void postRegisterSuccess() {
        Regis.postRegisterSuccess();
    }
    @When("user send POST register without password request to server")
    public void postRegisterwithoutPassword() {
        Regis.postRegisterwithoutPassword();
    }
    @When("user send POST register without fullname request to server")
    public void postRegisterwithoutFullname() {
        Regis.postRegisterwithoutFullname();
    }
    @When("user send POST register without body request to server")
    public void postRegisterwithoutBody() {
        Regis.postRegisterwithoutBody();
    }
    @When("user send POST register with registered email request to server")
    public void postRegisterwithRegisteredEmail() {
        Regis.postRegisterwithRegisteredEmail();
    }
    //End -- Register
    
}
