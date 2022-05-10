package api.stepdef;
import api.service.*;
import io.cucumber.java.en.*;
public class UserListStepDef {
    UserListService userList = new UserListService();

    String tokenGenerated;

    //get value token input in variable tokenGenerated
    @Given("user has already had login token")
    public void GetTokenLogin()throws Exception{
        this.tokenGenerated = userList.GetTokenLogin();
    }
    //Start -- Users Profile
    @When("user send PUT successfully user profile in server")
    public void PutUserSuccessfully() {
        userList.PutUserSuccessfully(tokenGenerated);
    }

    @When("user send PUT unsuccessfully user profile in server")
    public void PutUserUnsuccessfully() {
        userList.PutUserUnsuccessfully(tokenGenerated);
    }

    //panggil method dengan param token
    @When("user send GET single user successfully user profile in server")
    public void GetSingleUserSuccessfully() {

        userList.GetSingleUserSuccessfully(tokenGenerated);
    }
    @When("user send GET single user unsuccessfully user profile in server")
    public void GetSingleUserUnsuccessfully() {
        userList.GetSingleUserUnsuccessfully(tokenGenerated);

    }

    @When("user send DELETE user successfully user profile in server")
    public void DeleteUserSuccessfully() {
        userList.DeleteUserSuccessfully (tokenGenerated);

    }


    @When("user send PUT update image user unsuccessfully user profile in server")
    public void PutUpdateImage() {
        userList.PutUpdateImage(tokenGenerated);
    }
    //End -- User Profile

}
