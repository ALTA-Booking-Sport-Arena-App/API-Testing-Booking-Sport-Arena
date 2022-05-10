package api.stepdef;
import api.service.VanueService;
import io.cucumber.java.en.*;

public class VanueStepdefs {
    VanueService Vanue = new VanueService();
    String tokenGenerat;

    @Given("user already has login token")
    public void AlreadyHasLoginToken() {
        this.tokenGenerat = Vanue.GetToken();

    }

    @When("user send POST successfully venue in server")
    public void POSTSuccessfullyVenue() {
        Vanue.POSTVanueSuccessfully(tokenGenerat);
    }

    @When("user send POST unsuccessfully venue in server")
    public void POSTUnsuccessfullyVenue() {
        Vanue.POSTVanueunSuccessfully(tokenGenerat);
    }


    @When("user send POST successfully venue in server with json schema")
    public void POSTSuccessfullyVenueInServer() {
        Vanue.POSTSuccessfullyVenue (tokenGenerat);
    }

    @When("user send GET single venue successfully venue in server")
    public void GETSingleVenueSuccessfully() {
        Vanue.GETSingleVenue(tokenGenerat);
    }

    @When("user send GET single venue unsuccessfully venue in server")
    public void GETSingleVenueUnsuccessfully() {
        Vanue.GETSingleVenueUnsuccessfuly(tokenGenerat);
    }

    @When("user send GET single venue by id successfully venue in server")
    public void GETSingleVenueByIdSuccessfull() {
        Vanue.GETSingleVenueByIdSuccessfull(tokenGenerat);
    }

    @When("user send GET single venue by id unsuccessfully venue in server")
    public void GETSingleVenueByIdUnsuccessfully() {
        Vanue.GETSingleVenueByIdUnSuccessfull(tokenGenerat);
    }

    @When("user send DELETE Venue successfully in server")
    public void DELETEVenueSuccessfully() {
        Vanue.DELETEVenueSuccessfully(tokenGenerat);
    }

    @When("user send PUT update venue unsuccessfully in server")
    public void PUTUpdateVenueUnsuccessfully() {
        Vanue.DELETEVenue(tokenGenerat);

    }
}
