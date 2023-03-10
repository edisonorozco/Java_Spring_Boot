package co.com.bancolombia.producerkafka.models;

import co.com.bancolombia.producerkafka.models.alerts.Compliance;

public class AverageBalance {
    private double value;
    private Compliance[] compliance;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Compliance[] getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance[] compliance) {
        this.compliance = compliance;
    }
}
