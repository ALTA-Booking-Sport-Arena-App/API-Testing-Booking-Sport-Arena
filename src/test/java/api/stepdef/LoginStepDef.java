package api.stepdef;

import api.service.*;
import io.cucumber.java.en.*;


public class LoginStepDef {

    LoginService Login = new LoginService();

    //Start -- Login
    @When("user send POST success login request to server")
    public void postLoginSuccessfully(){
        Login.postLoginSuccessfully();
    }
    @When("user send POST login without email request to server")
    public void postLoginwithoutEmail(){
        Login.postLoginwithoutEmail();
    }
    @When("user send POST login without password request to server")
    public void postLoginwithoutPassword(){
        Login.postLoginwithoutPassword();
    }
    @When("user send POST login without body request to server")
    public void postLoginwithoutBodyRequest(){
        Login.postLoginwithoutBodyRequest();
    }
    @When("user send POST login with account dont register request to server")
    public void postLoginwithAccountDontRegister(){
        Login.postLoginwithAccountDontRegister();
    }
    //End -- Login
}

