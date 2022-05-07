package api.stepdef;

import api.service.CategoryService;
import io.cucumber.java.en.*;

public class CategoryStepDef {
    CategoryService Category = new CategoryService();

    @When("user send POST successfully create category request to server")
    public void userSendPOSTSuccessfullyCreateCategoryRequestToServer() {
        Category.postCreateCategorySuccess();
    }
    @When("user send POST unsuccessfully create category request to server")
    public void userSendPOSTUnsuccessfullyCreateCategoryRequestToServer(){
        Category.postCreateCategoryFailed();
    }
    @When("user send GET successfully all category request to server")
    public void userSendGETSuccessfullyAllCategoryRequestToServer(){
        Category.getCategorySuccess();
    }
    @When("user send GET unsuccessfully all category request to server")
    public void userSendGETUnsuccessfullyAllCategoryRequestToServer(){
        Category.getCategoryFailed();
    }
    @When("user send PUT successfully update category request to server")
    public void userSendPUTSuccessfullyUpdateCategoryRequestToServer(){
        Category.putCategorySuccess();
    }
    @When("user send PUT unsuccessfully update category request to server")
    public void userSendPUTUnsuccessfullyUpdateCategoryRequestToServer(){
        Category.putCategoryFailed();
    }
    @When("user send DELETE successfully category request to server")
    public void userSendDELETESuccessfullyCategoryRequestToServer(){
        Category.deleteCategorySuccess();
    }
    @When("user send DELETE unsuccessfully category request to server")
    public void userSendDELETEUnsuccessfullyCategoryRequestToServer(){
        Category.deleteCategoryFailed();
    }
}
