package api.stepdef;
import api.service.*;
import io.cucumber.java.en.*;
public class UserListStepDef {
    UserListService userList = new UserListService();

    String tokenGenerated;

    @Given("user has already had login token")
    public void GetTokenLogin()throws Exception{
        this.tokenGenerated = userList.GetTokenLogin();
    }
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
        System.out.println(tokenGenerated);
        userList.GetSingleUserSuccessfully(tokenGenerated);
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
