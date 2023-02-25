package co.com.bancolombia.producerkafka.services;

import co.com.bancolombia.producerkafka.models.alerts.StandardAlertReceived;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;

public class KafkaProducer {

    private final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
    private final ReactiveKafkaProducerTemplate<String, String> reactiveKafkaProducerTemplate;

    public KafkaProducer(ReactiveKafkaProducerTemplate<String, String> reactiveKafkaProducerTemplate) {
        this.reactiveKafkaProducerTemplate = reactiveKafkaProducerTemplate;
    }

    public void send(String topic, String message) {
        log.info("send to topic={}, {}={},", topic, StandardAlertReceived.class.getSimpleName(), message);
        reactiveKafkaProducerTemplate.send(topic, message)
                .doOnSuccess(senderResult -> System.out.println("successfully sent: " + message))
                .subscribe();
    }

}
