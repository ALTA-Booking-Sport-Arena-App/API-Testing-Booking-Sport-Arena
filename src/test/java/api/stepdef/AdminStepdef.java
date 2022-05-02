package api.stepdef;

import api.service.*;
import io.cucumber.java.en.*;

public class AdminStepdef {
    AdminService admin = new AdminService();

    //Start --Admin
    @When("user send PUT successfully admin verification approve request to server")
    public void putAdminVerificationApproveSuccess(){
        admin.putAdminVerificationApproveSuccessfully();
    }
    @When("user send PUT unsuccessfully admin verification approve request to server")
    public void putAdminVerificationApproveUnsuccessfully(){
        admin.putAdminVerificationApproveUnsuccessfully();
    }
    @When("user send PUT successfully admin verification reject request to server")
    public void putAdminVerificationRejectSuccess(){
        admin.putAdminVerificationRejectSuccess();
    }
    @When("user send PUT unsuccessfully admin verification reject request to server")
    public void putAdminVerificationRejectUnsuccess(){
        admin.putAdminVerificationRejectUnsuccess();
    }
    @When("user send PUT successfully admin change password request to server")
    public void putAdminChangePasswordSuccess(){
        admin.puAdminChangePasswordSuccess();
    }
    @When("user send PUT unsuccessfully admin change password request to server")
    public void putAdminChangePasswordUnsuccess() {
        admin.puAdminChangePasswordUnsuccess();
    }
    @When("user send GET successfully admin request list all owner request to server")
    public void getAdminRequestListAllOwnerSuccess() {
        admin.getAdminRequestListAllOwnerSuccess();
    }
    @When("user send GET unsuccessfully admin ruquest list all owners request to server")
    public void getAdminRequestListAllOwnerUnsuccess() {
        admin.getAdminRequestListAllOwnerUnsuccess();
    }
    @When("user send GET successfully admin list all owners request to server")
    public void getAdminListAllOwnerSuccess() {
        admin.getAdminListAllOwnerSuccess();
    }
    @When("user send GET unsuccessfully admin list all owners request to server")
    public void getAdminListAllOwnerUnsuccess() {
        admin.getAdminListAllOwnerUnsuccess();
    }
    @When("user send GET successfully admin list all users request to server")
    public void getAdminListAllUsersSuccess() {
        admin.getAdminListAllUsersSuccess();
    }
    @When("user send GET unsuccessfully admin list all users request to server")
    public void getAdminListAllUsersUnsuccess() {
        admin.getAdminListAllUsersUnsuccess();
    }
}
