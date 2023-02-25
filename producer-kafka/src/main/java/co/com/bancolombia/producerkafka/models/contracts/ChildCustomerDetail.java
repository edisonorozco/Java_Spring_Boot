package co.com.bancolombia.producerkafka.models.contracts;

public class ChildCustomerDetail {
    private String customerId;
    private String customerNIT;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNIT() {
        return customerNIT;
    }

    public void setCustomerNIT(String customerNIT) {
        this.customerNIT = customerNIT;
    }
}
