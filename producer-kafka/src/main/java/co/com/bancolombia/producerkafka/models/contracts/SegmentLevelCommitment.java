package co.com.bancolombia.producerkafka.models.contracts;

public class SegmentLevelCommitment{
    private String segmentAttributeName;
    private String committedValue;
    private String discountPercentage;

    public String getSegmentAttributeName() {
        return segmentAttributeName;
    }

    public void setSegmentAttributeName(String segmentAttributeName) {
        this.segmentAttributeName = segmentAttributeName;
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
