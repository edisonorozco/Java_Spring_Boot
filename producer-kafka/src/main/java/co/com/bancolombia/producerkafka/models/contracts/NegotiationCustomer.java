package co.com.bancolombia.producerkafka.models.contracts;

public class NegotiationCustomer {
    private ResponseObj responseObj;
    private int sucessFailure;

    public ResponseObj getResponseObj() {
        return responseObj;
    }

    public void setResponseObj(ResponseObj responseObj) {
        this.responseObj = responseObj;
    }

    public int getSucessFailure() {
        return sucessFailure;
    }

    public void setSucessFailure(int sucessFailure) {
        this.sucessFailure = sucessFailure;
    }
}

