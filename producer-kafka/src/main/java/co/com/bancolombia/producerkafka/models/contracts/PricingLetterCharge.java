package co.com.bancolombia.producerkafka.models.contracts;


import java.util.List;

public class PricingLetterCharge {
    private String chargeCode;
    private String chargeDescription;
    private String chargeCategory;
    private String chargeModel;
    private String afpCode;
    private String revenueClass;
    private String period;
    private String includeInPricingLetter;
    private List<StandardCharge> standardCharge;
    private List<DealCharge> dealCharge;

    public String getChargeCode() {
        return chargeCode;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public String getChargeDescription() {
        return chargeDescription;
    }

    public void setChargeDescription(String chargeDescription) {
        this.chargeDescription = chargeDescription;
    }

    public String getChargeCategory() {
        return chargeCategory;
    }

    public void setChargeCategory(String chargeCategory) {
        this.chargeCategory = chargeCategory;
    }

    public String getChargeModel() {
        return chargeModel;
    }

    public void setChargeModel(String chargeModel) {
        this.chargeModel = chargeModel;
    }

    public String getAfpCode() {
        return afpCode;
    }

    public void setAfpCode(String afpCode) {
        this.afpCode = afpCode;
    }

    public String getRevenueClass() {
        return revenueClass;
    }

    public void setRevenueClass(String revenueClass) {
        this.revenueClass = revenueClass;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getIncludeInPricingLetter() {
        return includeInPricingLetter;
    }

    public void setIncludeInPricingLetter(String includeInPricingLetter) {
        this.includeInPricingLetter = includeInPricingLetter;
    }

    public List<StandardCharge> getStandardCharge() {
        return standardCharge;
    }

    public void setStandardCharge(List<StandardCharge> standardCharge) {
        this.standardCharge = standardCharge;
    }

    public List<DealCharge> getDealCharge() {
        return dealCharge;
    }

    public void setDealCharge(List<DealCharge> dealCharge) {
        this.dealCharge = dealCharge;
    }
}
