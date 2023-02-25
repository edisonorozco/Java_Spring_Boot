package co.com.bancolombia.producerkafka.models.contracts;

import java.util.List;

public class ServiceLevelWeightage{
    private String applicableDiscountPercentage;
    private String minDiscountPercentage;
    private String maxDiscountPercentage;
    private List<ServiceLevelAttribute> serviceLevelAttributes;

    public String getApplicableDiscountPercentage() {
        return applicableDiscountPercentage;
    }

    public void setApplicableDiscountPercentage(String applicableDiscountPercentage) {
        this.applicableDiscountPercentage = applicableDiscountPercentage;
    }

    public String getMinDiscountPercentage() {
        return minDiscountPercentage;
    }

    public void setMinDiscountPercentage(String minDiscountPercentage) {
        this.minDiscountPercentage = minDiscountPercentage;
    }

    public String getMaxDiscountPercentage() {
        return maxDiscountPercentage;
    }

    public void setMaxDiscountPercentage(String maxDiscountPercentage) {
        this.maxDiscountPercentage = maxDiscountPercentage;
    }

    public List<ServiceLevelAttribute> getServiceLevelAttributes() {
        return serviceLevelAttributes;
    }

    public void setServiceLevelAttributes(List<ServiceLevelAttribute> serviceLevelAttributes) {
        this.serviceLevelAttributes = serviceLevelAttributes;
    }
}
