package co.com.bancolombia.producerkafka.models.contracts;

public class ServiceLevelAttribute{
    private String serviceAttributeName;
    private String committedValue;
    private String discountPercentage;

    public String getServiceAttributeName() {
        return serviceAttributeName;
    }

    public void setServiceAttributeName(String serviceAttributeName) {
        this.serviceAttributeName = serviceAttributeName;
    }

    public String getCommittedValue() {
        return committedValue;
    }

    public void setCommittedValue(String committedValue) {
        this.committedValue = committedValue;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
