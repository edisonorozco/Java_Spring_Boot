package co.com.bancolombia.producerkafka.controller;

import co.com.bancolombia.producerkafka.models.alerts.StandardAlertReceived;
import co.com.bancolombia.producerkafka.models.contracts.NegotiationCustomer;
import co.com.bancolombia.producerkafka.services.KafkaProducer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

@RestController()
public class KafkaController {

    @Autowired
    ReactiveKafkaProducerTemplate<String, String> reactiveKafkaProducerTemplate;

    @Value(value = "${KAFKA_XELERATE_TOPIC}")
    private String kafkaTopic;

    @GetMapping("/send")
    public String startSendMessage() throws InterruptedException, IOException {

        final File folder = new File(ClassLoader.getSystemResource("alertstest").getFile());
        File[] fileList = Objects.requireNonNull(folder.listFiles());

        KafkaProducer kafkaProducer = new KafkaProducer(reactiveKafkaProducerTemplate);

        for (File file : fileList) {
            Thread.sleep(1000L);
            StandardAlertReceived standardAlertReceived = new ObjectMapper().readValue(file, StandardAlertReceived.class);
            kafkaProducer.send(kafkaTopic, new ObjectMapper().writeValueAsString(standardAlertReceived));
        }

        return "Alerts messages send";
    }

    @GetMapping("/send-contract")
    public String sendMessageContract() throws IOException {

        KafkaProducer kafkaProducer = new KafkaProducer(reactiveKafkaProducerTemplate);

        File file = new File(ClassLoader.getSystemResource("contracts/OfferLetter_v2.json").getPath());

        String dealId = UUID.randomUUID().toString();

        NegotiationCustomer negotiationCustomer = new ObjectMapper().readValue(file, NegotiationCustomer.class);
        negotiationCustomer.getResponseObj().setDealID(dealId);
        negotiationCustomer.getResponseObj().getDealDetails().forEach(dealDetail -> dealDetail.setDealID(dealId));
        kafkaProducer.send(kafkaTopic, new ObjectMapper().writeValueAsString(negotiationCustomer));

        return "Contract message send";
    }

}
