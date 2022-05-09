package api.stepdef;

import api.service.FacilityService;
import io.cucumber.java.en.*;

public class FacilityStepDef {
    FacilityService Facility = new FacilityService();

    @When("user send POST successfully create facility request to server")
    public void userSendPOSTSuccessfullyCreateFacilityRequestToServer() {
        Facility.postCreateFacilitySuccess();
    }
    @When("user send POST unsuccessfully create facility request to server")
    public void userSendPOSTUnsuccessfullyCreateFacilityRequestToServer() {
        Facility.postCreateFacilityFailed();
    }
    @When("user send GET successfully all facility request to server")
    public void userSendGETSuccessfullyAllFacilityRequestToServer(){
        Facility.getFacilitySuccess();
    }
    @When("user send GET unsuccessfully all facility request to server")
    public void userSendGETUnsuccessfullyAllFacilityRequestToServer(){
        Facility.getFacilityFailed();
    }
    @When("user send PUT successfully update facility request to server")
    public void userSendPUTSuccessfullyUpdateFacilityRequestToServer(){
        Facility.putFacilitySuccess();
    }
    @When("user send PUT unsuccessfully update facility request to server")
    public void userSendPUTUnsuccessfullyUpdateFacilityRequestToServer(){
        Facility.putFacilityFailed();
    }
    @When("user send DELETE successfully facility request to server")
    public void userSendDELETESuccessfullyFacilityRequestToServer(){
        Facility.deleteFacilitySuccess();
    }
    @When("user send DELETE unsuccessfully facility request to server")
    public void userSendDELETEUnsuccessfullyFacilityRequestToServer(){
        Facility.deleteFacilityFailed();
    }
}
