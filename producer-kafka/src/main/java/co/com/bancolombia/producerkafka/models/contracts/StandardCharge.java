package co.com.bancolombia.producerkafka.models.contracts;

public class StandardCharge{
    private String currency;
    private String minimumCharge;
    private String maximumCharge;
    private String additionalCharge;
    private String basedOn;
    private String computationType;
    private String rateType;
    private String tierUpto;
    private String creditDebit;
    private String rate;
    private String tierGreaterthan;
    private String taxIndicator;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMinimumCharge() {
        return minimumCharge;
    }

    public void setMinimumCharge(String minimumCharge) {
        this.minimumCharge = minimumCharge;
    }

    public String getMaximumCharge() {
        return maximumCharge;
    }

    public void setMaximumCharge(String maximumCharge) {
        this.maximumCharge = maximumCharge;
    }

    public String getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(String additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public String getBasedOn() {
        return basedOn;
    }

    public void setBasedOn(String basedOn) {
        this.basedOn = basedOn;
    }

    public String getComputationType() {
        return computationType;
    }

    public void setComputationType(String computationType) {
        this.computationType = computationType;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public String getTierUpto() {
        return tierUpto;
    }

    public void setTierUpto(String tierUpto) {
        this.tierUpto = tierUpto;
    }

    public String getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(String creditDebit) {
        this.creditDebit = creditDebit;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTierGreaterthan() {
        return tierGreaterthan;
    }

    public void setTierGreaterthan(String tierGreaterthan) {
        this.tierGreaterthan = tierGreaterthan;
    }

    public String getTaxIndicator() {
        return taxIndicator;
    }

    public void setTaxIndicator(String taxIndicator) {
        this.taxIndicator = taxIndicator;
    }
}

