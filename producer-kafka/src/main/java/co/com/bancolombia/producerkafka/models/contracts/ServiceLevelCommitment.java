package co.com.bancolombia.producerkafka.models.contracts;


import java.util.List;

public class ServiceLevelCommitment{
    private String agreementId;
    private List<PricingLetterServiceDet> pricingLetterServiceDet;
    private List<EbvDet> ebvDet;

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public List<PricingLetterServiceDet> getPricingLetterServiceDet() {
        return pricingLetterServiceDet;
    }

    public void setPricingLetterServiceDet(List<PricingLetterServiceDet> pricingLetterServiceDet) {
        this.pricingLetterServiceDet = pricingLetterServiceDet;
    }

    public List<EbvDet> getEbvDet() {
        return ebvDet;
    }

    public void setEbvDet(List<EbvDet> ebvDet) {
        this.ebvDet = ebvDet;
    }
}
