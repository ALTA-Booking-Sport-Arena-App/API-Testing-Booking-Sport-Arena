package api.stepdef;

import api.service.PaymentService;
import io.cucumber.java.en.*;

public class PaymentStepDef {
    PaymentService Payment = new PaymentService();

    @When("user send POST successfully create booking request to server")
    public void userSendPOSTSuccessfullyCreateBookingRequestToServer() {
        Payment.postBookingSuccess();
    }
    @When("user send POST unsuccessfully create booking request to server")
    public void userSendPOSTUnsuccessfullyCreateBookingRequestToServer() {
        Payment.postBookingFailed();
    }
    @When("user send PUT successfully payment request to server")
    public void userSendPUTSuccessfullyPaymentRequestToServer(){
        Payment.putPaymentSuccess();
    }
    @When("user send PUT unsuccessfully payment request to server")
    public void userSendPUTUnsuccessfullyPaymentRequestToServer() {
        Payment.putPaymentFailed();
    }
}
