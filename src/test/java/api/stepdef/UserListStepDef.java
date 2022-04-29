package api.stepdef;
import api.service.*;
import io.cucumber.java.en.*;
public class UserListStepDef {
    UserListService userList = new UserListService();
    //Start -- Users Profile
    @When("user send PUT successfully user profile in server")
    public void PutUserSuccessfully() {
        userList.PutUserSuccessfully();
    }

    @When("user send PUT unsuccessfully user profile in server")
    public void PutUserUnsuccessfully() {
        userList.PutUserUnsuccessfully();
    }

    @When("user send GET single user successfully user profile in server")
    public void GetSingleUserSuccessfully() {
        userList.GetSingleUserSuccessfully();
    }
    @When("user send GET single user unsuccessfully user profile in server")
    public void GetSingleUserUnsuccessfully() {
        userList.GetSingleUserUnsuccessfully();

    }

    @When("user send DELETE user successfully user profile in server")
    public void DeleteUserSuccessfully() {
        userList.DeleteUserSuccessfully ();

    }


    @When("user send PUT update image user unsuccessfully user profile in server")
    public void PutUpdateImage() {
        userList.PutUpdateImage();
    }
    //End -- User Profile

}
