package co.com.bancolombia.producerkafka.models.contracts;

import java.util.List;

public class DealDetail{
    private String customerId;
    private String customerName;
    private String customerNIT;
    private String legalRepresentativeId;
    private String legalRepresentativeName;
    private String commissionAccountID;
    private String commissionAccountType;
    private String dealCreationDate;
    private String dealVersion;
    private String customerSegment;
    private String dealID;
    private String dealDescription;
    private String dealSource;
    private String dealCurrency;
    private String countryOfOperation;
    private String dealStatus;
    private String dealOwner;
    private String dealCreatedBy;
    private String dealPeriodType;
    private String dealPeriod;
    private String dealAdditionalInformation;
    private String grossDealEBVDealCurrency;
    private String netDealEBVDealCurrency;
    private String baseCurrency;
    private String grossDealEBVBaseCurrency;
    private String netDealEBVBaseCurrency;
    private List<SegmentLevelCommitment> segmentLevelCommitments;
    private List<ServiceLevelCommitment> serviceLevelCommitments;
    private String userField1;
    private String userField2;
    private String dealApprovedDate;
    private List<ChildCustomerDetail> childCustomerDetails;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNIT() {
        return customerNIT;
    }

    public void setCustomerNIT(String customerNIT) {
        this.customerNIT = customerNIT;
    }

    public String getLegalRepresentativeId() {
        return legalRepresentativeId;
    }

    public void setLegalRepresentativeId(String legalRepresentativeId) {
        this.legalRepresentativeId = legalRepresentativeId;
    }

    public String getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    public void setLegalRepresentativeName(String legalRepresentativeName) {
        this.legalRepresentativeName = legalRepresentativeName;
    }

    public String getCommissionAccountID() {
        return commissionAccountID;
    }

    public void setCommissionAccountID(String commissionAccountID) {
        this.commissionAccountID = commissionAccountID;
    }

    public String getCommissionAccountType() {
        return commissionAccountType;
    }

    public void setCommissionAccountType(String commissionAccountType) {
        this.commissionAccountType = commissionAccountType;
    }

    public String getDealCreationDate() {
        return dealCreationDate;
    }

    public void setDealCreationDate(String dealCreationDate) {
        this.dealCreationDate = dealCreationDate;
    }

    public String getDealVersion() {
        return dealVersion;
    }

    public void setDealVersion(String dealVersion) {
        this.dealVersion = dealVersion;
    }

    public String getCustomerSegment() {
        return customerSegment;
    }

    public void setCustomerSegment(String customerSegment) {
        this.customerSegment = customerSegment;
    }

    public String getDealID() {
        return dealID;
    }

    public void setDealID(String dealID) {
        this.dealID = dealID;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public String getDealSource() {
        return dealSource;
    }

    public void setDealSource(String dealSource) {
        this.dealSource = dealSource;
    }

    public String getDealCurrency() {
        return dealCurrency;
    }

    public void setDealCurrency(String dealCurrency) {
        this.dealCurrency = dealCurrency;
    }

    public String getCountryOfOperation() {
        return countryOfOperation;
    }

    public void setCountryOfOperation(String countryOfOperation) {
        this.countryOfOperation = countryOfOperation;
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus;
    }

    public String getDealOwner() {
        return dealOwner;
    }

    public void setDealOwner(String dealOwner) {
        this.dealOwner = dealOwner;
    }

    public String getDealCreatedBy() {
        return dealCreatedBy;
    }

    public void setDealCreatedBy(String dealCreatedBy) {
        this.dealCreatedBy = dealCreatedBy;
    }

    public String getDealPeriodType() {
        return dealPeriodType;
    }

    public void setDealPeriodType(String dealPeriodType) {
        this.dealPeriodType = dealPeriodType;
    }

    public String getDealPeriod() {
        return dealPeriod;
    }

    public void setDealPeriod(String dealPeriod) {
        this.dealPeriod = dealPeriod;
    }

    public String getDealAdditionalInformation() {
        return dealAdditionalInformation;
    }

    public void setDealAdditionalInformation(String dealAdditionalInformation) {
        this.dealAdditionalInformation = dealAdditionalInformation;
    }

    public String getGrossDealEBVDealCurrency() {
        return grossDealEBVDealCurrency;
    }

    public void setGrossDealEBVDealCurrency(String grossDealEBVDealCurrency) {
        this.grossDealEBVDealCurrency = grossDealEBVDealCurrency;
    }

    public String getNetDealEBVDealCurrency() {
        return netDealEBVDealCurrency;
    }

    public void setNetDealEBVDealCurrency(String netDealEBVDealCurrency) {
        this.netDealEBVDealCurrency = netDealEBVDealCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getGrossDealEBVBaseCurrency() {
        return grossDealEBVBaseCurrency;
    }

    public void setGrossDealEBVBaseCurrency(String grossDealEBVBaseCurrency) {
        this.grossDealEBVBaseCurrency = grossDealEBVBaseCurrency;
    }

    public String getNetDealEBVBaseCurrency() {
        return netDealEBVBaseCurrency;
    }

    public void setNetDealEBVBaseCurrency(String netDealEBVBaseCurrency) {
        this.netDealEBVBaseCurrency = netDealEBVBaseCurrency;
    }

    public List<SegmentLevelCommitment> getSegmentLevelCommitments() {
        return segmentLevelCommitments;
    }

    public void setSegmentLevelCommitments(List<SegmentLevelCommitment> segmentLevelCommitments) {
        this.segmentLevelCommitments = segmentLevelCommitments;
    }

    public List<ServiceLevelCommitment> getServiceLevelCommitments() {
        return serviceLevelCommitments;
    }

    public void setServiceLevelCommitments(List<ServiceLevelCommitment> serviceLevelCommitments) {
        this.serviceLevelCommitments = serviceLevelCommitments;
    }

    public String getUserField1() {
        return userField1;
    }

    public void setUserField1(String userField1) {
        this.userField1 = userField1;
    }

    public String getUserField2() {
        return userField2;
    }

    public void setUserField2(String userField2) {
        this.userField2 = userField2;
    }

    public String getDealApprovedDate() {
        return dealApprovedDate;
    }

    public void setDealApprovedDate(String dealApprovedDate) {
        this.dealApprovedDate = dealApprovedDate;
    }

    public List<ChildCustomerDetail> getChildCustomerDetails() {
        return childCustomerDetails;
    }

    public void setChildCustomerDetails(List<ChildCustomerDetail> childCustomerDetails) {
        this.childCustomerDetails = childCustomerDetails;
    }
}
