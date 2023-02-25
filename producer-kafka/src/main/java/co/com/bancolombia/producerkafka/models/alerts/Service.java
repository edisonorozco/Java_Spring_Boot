package co.com.bancolombia.producerkafka.models.alerts;

import co.com.bancolombia.producerkafka.models.AverageBalance;
import co.com.bancolombia.producerkafka.models.NumOfTransaction;

public class Service {
    private String serviceName;
    private int numNonCompliance;
    private NumOfTransaction numOfTransaction;
    private AverageBalance averageBalance;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getNumNonCompliance() {
        return numNonCompliance;
    }

    public void setNumNonCompliance(int numNonCompliance) {
        this.numNonCompliance = numNonCompliance;
    }

    public NumOfTransaction getNumOfTransaction() {
        return numOfTransaction;
    }

    public void setNumOfTransaction(NumOfTransaction numOfTransaction) {
        this.numOfTransaction = numOfTransaction;
    }

    public AverageBalance getAverageBalance() {
        return averageBalance;
    }

    public void setAverageBalance(AverageBalance averageBalance) {
        this.averageBalance = averageBalance;
    }
}