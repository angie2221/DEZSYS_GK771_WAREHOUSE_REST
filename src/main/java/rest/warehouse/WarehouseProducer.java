package rest.warehouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rest.model.WarehouseData;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class WarehouseProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    // Kafka Topic für die Grundlagen
    private static final String TOPIC = "warehouse-queue";

    /**
     * Sendet WarehouseData an Kafka Topic
     */
    public void sendWarehouseData(WarehouseData data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonData = mapper.writeValueAsString(data);

            kafkaTemplate.send(TOPIC, jsonData);

            System.out.println("Sent to Kafka: " + jsonData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
