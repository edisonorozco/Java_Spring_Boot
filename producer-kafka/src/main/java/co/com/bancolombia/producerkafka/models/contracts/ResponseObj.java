package co.com.bancolombia.producerkafka.models.contracts;

import java.util.List;

public class ResponseObj {
    private String dealVersion;
    private String dealID;
    private String purpose;
    private List<DealDetail> dealDetails;

    public String getDealVersion() {
        return dealVersion;
    }

    public void setDealVersion(String dealVersion) {
        this.dealVersion = dealVersion;
    }

    public String getDealID() {
        return dealID;
    }

    public void setDealID(String dealID) {
        this.dealID = dealID;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public List<DealDetail> getDealDetails() {
        return dealDetails;
    }

    public void setDealDetails(List<DealDetail> dealDetails) {
        this.dealDetails = dealDetails;
    }
}
