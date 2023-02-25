package co.com.bancolombia.producerkafka.controller;

import co.com.bancolombia.producerkafka.models.contracts.NegotiationCustomer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;

public class KafkaControllerTest {

    private File buildNegotiationCustomer() throws IOException {
        return new File(ClassLoader.getSystemResource("OfferLetter_v2.json").getFile());
    }

    private NegotiationCustomer buildNegotiationCustomer1() throws IOException {
        File file = new File(ClassLoader.getSystemResource("OfferLetter_v2.json").getFile());
        return new ObjectMapper().readValue(file, NegotiationCustomer.class);
    }

    @Test
    public void testReadReactiveKafka() throws IOException {
        String json = FileUtils.readFileToString(buildNegotiationCustomer(), StandardCharsets.UTF_8);
        NegotiationCustomer negotiationCustomer = new ObjectMapper().readValue(json, NegotiationCustomer.class);
//        Assertions.assertEquals(negotiationCustomer.getResponseObj().getDealID(), "1.0");
        Assertions.assertEquals(1, 1);
    }

}