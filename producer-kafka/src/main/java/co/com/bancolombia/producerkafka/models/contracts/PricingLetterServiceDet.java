package co.com.bancolombia.producerkafka.models.contracts;

import java.util.List;

public class PricingLetterServiceDet{
    private String customerName;
    private String accountName;
    private String productCode;
    private String productName;
    private String serviceCode;
    private String serviceName;
    private String includeInPricingLetter;
    private ServiceLevelWeightage serviceLevelWeightage;
    private List<PricingLetterCharge> pricingLetterCharges;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getIncludeInPricingLetter() {
        return includeInPricingLetter;
    }

    public void setIncludeInPricingLetter(String includeInPricingLetter) {
        this.includeInPricingLetter = includeInPricingLetter;
    }

    public ServiceLevelWeightage getServiceLevelWeightage() {
        return serviceLevelWeightage;
    }

    public void setServiceLevelWeightage(ServiceLevelWeightage serviceLevelWeightage) {
        this.serviceLevelWeightage = serviceLevelWeightage;
    }

    public List<PricingLetterCharge> getPricingLetterCharges() {
        return pricingLetterCharges;
    }

    public void setPricingLetterCharges(List<PricingLetterCharge> pricingLetterCharges) {
        this.pricingLetterCharges = pricingLetterCharges;
    }
}
